/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import java.util.*;
import java.util.stream.*;

import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class ContributionService {
	
	@Value("${base-url}")
	private String baseUrl;
	
	@Autowired
	private PolicyService policyService;
	
	public List<Contribution> getContribution(String userId, String policyId) {
		Policy policy = policyService.getPolicy(userId, policyId);
		
		WebClient client = WebClient.create(baseUrl + UrlParams.CONTRIBUTION_URL);
		
		ContributionInfoPolicyQueryResult queryResult = client.get()
				.uri(factory -> factory.uriString("").pathSegment(policy.getEventTransId()).build())
				.exchange()
				.then(response -> response.bodyToMono(ContributionInfoPolicyQueryResult.class))
				.block();
		
		return queryResult.getContributionParameterInfoCqCollection()
				.stream()
				.map(contribution -> {
					Contribution c = new Contribution();
					c.setTotalAmount(contribution.getTotalAmount());
					c.setTotalPct(contribution.getTotalPct());
					c.setSalary(contribution.getEmployeeBillingInfoCq().getSalary());
					c.setEmployeeBillingType(EmployeeBillingType.fromCode(contribution.getEmployeeBillingInfoCq().getEmployeeBillingTypeCq()));
					c.setEmployeeContributionAbs(contribution.getEmployee().getContributionAbs());
					c.setEmployeeContributionPct(contribution.getEmployee().getContributionPct());
					c.setEmployeeContributionIsPct(contribution.getEmployee().getIsPct());
					c.setEmployerContributionAbs(contribution.getEmployer().getContributionAbs());
					c.setEmployerContributionPct(contribution.getEmployer().getContributionPct());
					c.setEmployerContributionIsPct(contribution.getEmployer().getIsPct());
					return c;
				})
				.collect(Collectors.toList());
	}
}
