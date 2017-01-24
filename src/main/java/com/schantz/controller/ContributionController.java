/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.controller;

import java.util.*;

import com.schantz.model.*;
import com.schantz.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContributionController {
	
	@Autowired
	private ContributionService contributionService;
	
	@GetMapping("/contributions/{userId}/{policyId}")
	public List<Contribution> getContributions(@PathVariable String userId, @PathVariable String policyId) {
		return contributionService.getContribution(userId, policyId);
	}
}
