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
public class PayoutsController {
	
	@Autowired
	private PayoutService payoutService;
	
	@GetMapping("/policies/{userId}/{policyId}/payouts")
	public Map<String, Double> getPayouts(@PathVariable String userId, @PathVariable String policyId, @RequestParam Optional<PeriodLength> periodLength) {
		return payoutService.getPayouts(userId, policyId, periodLength);
	}
}
