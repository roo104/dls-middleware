/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import java.util.*;
import java.util.stream.*;

import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import javax.cache.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class PolicyService {
	
	@Autowired
	private UserService userService;
	
	@CacheResult(cacheName = "policy")
	public List<Policy> getPolicies(String userId) {
		User user = userService.getUser(userId);
		
		ClientRequest<Void> policyRequest = ClientRequest.GET(UrlParams.POLICY_SEARCH_URL, user.getSocialSecurityNumber())
				.build();
		
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		PolicySearchQueryResult policies = client.exchange(policyRequest)
				.then(response -> response.bodyToMono(PolicySearchQueryResult.class))
				.block();
		
		return policies.getEntryCollection()
				.stream()
				.map(policy -> {
					Policy p = new Policy(policy.getPolicyId().getPolicyUid(), policy.getStartDate());
					p.setOwnerId(policy.getOwner().getUniqueId());
					p.setInsuredPersonId(policy.getInsuredPerson().getUniqueId());
					p.setEventTransId(policy.getPolicyId().getEventTransUid());
					return p;
				})
				.collect(Collectors.toList());
	}
	
	@CacheResult(cacheName = "policy")
	public Policy getPolicy(String userId, String policyId) {
		List<Policy> policies = getPolicies(userId);
		Optional<Policy> policyOptional = policies.stream()
				.filter(policy -> policy.getId().equals(policyId))
				.findFirst();
		
		Policy policy = null;
		if (policyOptional.isPresent()) {
			ClientRequest<Void> request = ClientRequest.GET(UrlParams.POLICY_URL, policyOptional.get().getEventTransId())
					.build();
			
			WebClient client = WebClient.create(new ReactorClientHttpConnector());
			BasicInfoPolicyQueryResult policyResult = client.exchange(request)
					.then(response -> response.bodyToMono(BasicInfoPolicyQueryResult.class))
					.block();
			
			policy = new Policy(policyResult.getPolicyId().getPolicyUid(), policyResult.getStartDate());
			policy.setEventTransId(policyResult.getPolicyId().getEventTransUid());
			policy.setAgreementId(policyResult.getAgreementIdCq().getLifeProductUid());
		}
		return policy;
		
	}
	
}