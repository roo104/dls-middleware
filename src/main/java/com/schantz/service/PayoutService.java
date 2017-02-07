/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import java.util.*;
import java.util.stream.*;

import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import com.schantz.util.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.*;
import org.springframework.web.reactive.function.client.*;

@Slf4j
@Service
public class PayoutService {
	
	@Value("${base-url}")
	private String baseUrl;
	
	public Map<String, Double> getPayouts(String userId, String policyId, Optional<PeriodLength> periodLength) {
		AgeCq ageCq = new AgeCq();
		ageCq.setYear(67L);
		ageCq.setMonth(0L);
		
		List<AgeCq> ageCqCollection = new ArrayList<>();
		ageCqCollection.add(ageCq);
		
		ProjectionTimeSpecCq projectionTimeSpec = new ProjectionTimeSpecCq();
		projectionTimeSpec.setAgeCqCollection(ageCqCollection);
		
		PolicyIdCq policyIdCq = new PolicyIdCq();
		policyIdCq.setPolicyUid(policyId);
		
		ProjectionQueryProjectionQueryResult projectionQuery = new ProjectionQueryProjectionQueryResult();
		projectionQuery.setProjectionScenarioCq("RS");
		projectionQuery.setProjectionTimeSpecCq(projectionTimeSpec);
		projectionQuery.setPolicyIdCq(policyIdCq);
		projectionQuery.setProjectionPerspectiveCq("statePackageCover");
		projectionQuery.setPeriodLengthCq(periodLength.orElse(PeriodLength.YEARLY).getPeriod());
		
		WebClient client = WebClient.create(baseUrl + UrlParams.PROJECTION_URL);
		
		ProjectionQueryResult queryResult = client.post()
				.uri("")
				.exchange(BodyInserters.fromObject(projectionQuery))
				.then(response -> response.bodyToMono(ProjectionQueryResult.class))
				.block();
		
		Stream<String> headerStream = queryResult.getProjectionResultGroupCqCollection().stream()
				.map(ProjectionResultGroupCq::getProjectionResultSectionCqCollection)
				.flatMap(Collection::stream)
				.collect(Collectors.toList())
				.stream()
				.flatMap(projectionResultSectionCq -> projectionResultSectionCq.getProjectionResultCoverCqCollection().stream())
				.flatMap(projectionResultCoverCq -> projectionResultCoverCq.getPolicyCoverIdCq().getAgreementCoverVariantIdCq().getVariantName().getTranslationCollection().stream())
				.map(EntityNameTranslationCq::getName);
		
		Stream<Double> benefitStream = queryResult.getProjectionResultGroupCqCollection().stream()
				.map(ProjectionResultGroupCq::getProjectionResultSectionCqCollection)
				.flatMap(Collection::stream)
				.collect(Collectors.toList())
				.stream()
				.flatMap(projectionResultSectionCq -> projectionResultSectionCq.getProjectionResultCoverCqCollection().stream())
				.flatMap(projectionResultCoverCq -> projectionResultCoverCq.getProjectionResultCoverBenefitCqCollection().stream())
				.map(ProjectionResultCoverBenefitCq::getBenefit);
		
		Map<String, Double> payables = StreamUtils.zip(headerStream, benefitStream, AbstractMap.SimpleEntry::new)
				.collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
		
		
		return payables;
	}
}
