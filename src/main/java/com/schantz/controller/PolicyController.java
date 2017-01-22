/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.controller;

import java.util.*;
import java.util.stream.*;

import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PolicyController {
	
	private final PolicyService policyService;
	
	public PolicyController(PolicyService policyService) {
		this.policyService = policyService;
	}
	
	@GetMapping("/policy")
	public List<Policy> getPolicies(@RequestParam Optional<String> personRegistration, @RequestParam Optional<String> policyId) {
		PolicySearchQueryResult policySearchQueryResult = policyService.policy(personRegistration, policyId);
		
		return policySearchQueryResult.getEntryCollection()
				.stream()
				.map(policy -> new Policy(policy.getPolicyId().getPolicyUid(), policy.getStartDate(), policy.getOwner().getUniqueId(), policy.getInsuredPerson().getUniqueId()))
				.collect(Collectors.toList());
	}
}
