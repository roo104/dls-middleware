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
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;

@Slf4j
@Service
public class PolicyService {
	
	@Autowired
	private UserService userService;
	
	@CacheResult(cacheName = "policy")
	public List<Policy> getPolicies(String userId) {
		log.info("Getting policies for user {}", userId);
		User user = userService.getUser(userId);
		
		WebClient client = WebClient.create(UrlParams.POLICY_SEARCH_URL);
		
		PolicySearchQueryResult policies = client.get()
				.uri(factory -> factory.uriString("").queryParam("personRegistration", user.getSocialSecurityNumber()).build())
				.exchange()
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
		
		WebClient client = WebClient.create(UrlParams.POLICY_URL);
		
		Policy policy = null;
		if (policyOptional.isPresent()) {
			BasicInfoPolicyQueryResult policyResult = client.get()
					.uri(factory -> factory.uriString("").pathSegment(policyOptional.get().getEventTransId()).build())
					.exchange()
					.then(response -> response.bodyToMono(BasicInfoPolicyQueryResult.class))
					.block();
			
			policy = new Policy(policyResult.getPolicyId().getPolicyUid(), policyResult.getStartDate());
			policy.setEventTransId(policyResult.getPolicyId().getEventTransUid());
			policy.setAgreementId(policyResult.getAgreementIdCq().getLifeProductUid());
		}
		return policy;
	}
	
}