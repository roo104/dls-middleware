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
	
	@GetMapping("/policy")
	public List<Policy> getPolicies(@RequestParam String personRegistration) {
		return policyService.getPolicies(personRegistration);
	}
	
	@GetMapping("/policy/{eventTransId}")
	public Policy getPolicy(@PathVariable String eventTransId) {
		return policyService.getPolicy(eventTransId);
	}
}
