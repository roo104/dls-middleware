/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.controller;

import java.util.*;

import com.schantz.model.*;
import com.schantz.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PolicyController {
	
	private final PolicyService policyService;
	
	public PolicyController(PolicyService policyService) {
		this.policyService = policyService;
	}
	
	@GetMapping("/policies/{userId}")
	public List<Policy> getPolicies(String userId) {
		return policyService.getPolicies(userId);
	}
	
	@GetMapping("/policies/{userId}/{policyId}")
	public Policy getPolicy(String userId, String policyId) {
		return policyService.getPolicy(policyId);
	}
}
