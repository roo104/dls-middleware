/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import java.util.*;

import com.schantz.remotecq.client.*;
import javax.cache.annotation.*;
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;
import reactor.core.publisher.*;

@Service
public class PolicyService {
	
	@CacheResult(cacheName = "policies")
	public PolicySearchQueryResult policy(Optional<String> personRegistration, Optional<String> policyId) {
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		String url = "http://localhost:9000/services/rest/policy/query/policySearchQuery?pagingInfoCq=0,100&personRegistration={personRegistration}&policyId={policyId}";
		
		ClientRequest<Void> request = ClientRequest.GET(url, personRegistration.orElse(""), policyId.orElse(""))
				.header("userSecurityToken", "123")
				.build();
		
		Mono<PolicySearchQueryResult> policy = client.exchange(request)
				.then(response -> response.bodyToMono(PolicySearchQueryResult.class));
		
		return policy.block();
	}
	
}