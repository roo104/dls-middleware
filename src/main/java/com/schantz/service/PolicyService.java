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
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class PolicyService {
	
	@CacheResult(cacheName = "policy")
	public List<Policy> getPolicies(String personRegistration) {
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		ClientRequest<Void> request = ClientRequest.GET(UrlParams.POLICY_SEARCH_URL, personRegistration)
				.build();
		
		PolicySearchQueryResult policies = client.exchange(request)
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
	public Policy getPolicy(String eventTransId) {
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		ClientRequest<Void> request = ClientRequest.GET(UrlParams.POLICY_URL, eventTransId)
				.build();
		
		BasicInfoPolicyQueryResult policyResult = client.exchange(request)
				.then(response -> response.bodyToMono(BasicInfoPolicyQueryResult.class))
				.block();
		
		Policy policy = new Policy(policyResult.getPolicyId().getPolicyUid(), policyResult.getStartDate());
		policy.setEventTransId(policyResult.getPolicyId().getEventTransUid());
		policy.setAgreementId(policyResult.getAgreementIdCq().getLifeProductUid());
		return policy;
	}
	
}