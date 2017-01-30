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
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.*;
import org.springframework.web.reactive.function.client.*;

@Slf4j
@Service
public class PayoutService {
	
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
		
		ClientRequest<ProjectionQueryProjectionQueryResult> loginRequest = ClientRequest.POST(UrlParams.PROJECTION_URL)
				.body(BodyInserters.fromObject(projectionQuery));
		
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		ProjectionQueryResult queryResult = client.exchange(loginRequest)
				.then(response -> response.bodyToMono(ProjectionQueryResult.class))
				.block();
		
		Stream<String> headerStream = queryResult.getProjectionResultGroupCqCollection().stream()
				.map(ProjectionResultGroupCq::getProjectionResultSectionCqCollection)
				.flatMap(Collection::stream)
				.collect(Collectors.toList())
				.stream()
				.flatMap(projectionResultSectionCq -> projectionResultSectionCq.getProjectionResultCoverCqCollection().stream())
				.flatMap(projectionResultCoverCq -> projectionResultCoverCq.getPolicyCoverIdCq().getAgreementCoverVariantIdCq().getVariantName().getTranslationCollection().stream())
				.map(entityNameTranslationCq -> entityNameTranslationCq.getName());
		
		Stream<Double> benefitStream = queryResult.getProjectionResultGroupCqCollection().stream()
				.map(ProjectionResultGroupCq::getProjectionResultSectionCqCollection)
				.flatMap(Collection::stream)
				.collect(Collectors.toList())
				.stream()
				.flatMap(projectionResultSectionCq -> projectionResultSectionCq.getProjectionResultCoverCqCollection().stream())
				.flatMap(projectionResultCoverCq -> projectionResultCoverCq.getProjectionResultCoverBenefitCqCollection().stream())
				.map(ProjectionResultCoverBenefitCq::getBenefit);
		
		Map<String, Double> payables = StreamUtils.zip(headerStream,
				benefitStream,
				(a, b) -> {
					Map.Entry<String, Double> entry = new AbstractMap.SimpleEntry<>(a, b);
					return entry;
				})
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		
		
		return payables;
	}
}
