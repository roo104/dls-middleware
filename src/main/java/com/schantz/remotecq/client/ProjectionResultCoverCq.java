package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ProjectionResultCoverCq implements Serializable {
	@JsonProperty("currentBenefit")
	private Double currentBenefit = null;
	
	@JsonProperty("projectionResultCoverBenefitCqCollection")
	private List<ProjectionResultCoverBenefitCq> projectionResultCoverBenefitCqCollection = new ArrayList<ProjectionResultCoverBenefitCq>();
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("originalCoverId")
	private PolicyCoverIdCq originalCoverId = null;
	
	@JsonProperty("expiryAge")
	private AgeCq expiryAge = null;
	
	@JsonProperty("benefitPeriod")
	private TimeParameterCq benefitPeriod = null;
	
	@JsonProperty("insuranceTypeCq")
	private String insuranceTypeCq = null;
	
	
	public Double getCurrentBenefit() {
		return currentBenefit;
	}
	
	public void setCurrentBenefit(Double currentBenefit) {
		this.currentBenefit = currentBenefit;
	}
	
	public ProjectionResultCoverCq addProjectionResultCoverBenefitCqCollectionItem(ProjectionResultCoverBenefitCq projectionResultCoverBenefitCqCollectionItem) {
		this.projectionResultCoverBenefitCqCollection.add(projectionResultCoverBenefitCqCollectionItem);
		return this;
	}
	
	public List<ProjectionResultCoverBenefitCq> getProjectionResultCoverBenefitCqCollection() {
		return projectionResultCoverBenefitCqCollection;
	}
	
	public void setProjectionResultCoverBenefitCqCollection(List<ProjectionResultCoverBenefitCq> projectionResultCoverBenefitCqCollection) {
		this.projectionResultCoverBenefitCqCollection = projectionResultCoverBenefitCqCollection;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public PolicyCoverIdCq getOriginalCoverId() {
		return originalCoverId;
	}
	
	public void setOriginalCoverId(PolicyCoverIdCq originalCoverId) {
		this.originalCoverId = originalCoverId;
	}
	
	public AgeCq getExpiryAge() {
		return expiryAge;
	}
	
	public void setExpiryAge(AgeCq expiryAge) {
		this.expiryAge = expiryAge;
	}
	
	public TimeParameterCq getBenefitPeriod() {
		return benefitPeriod;
	}
	
	public void setBenefitPeriod(TimeParameterCq benefitPeriod) {
		this.benefitPeriod = benefitPeriod;
	}
	
	public String getInsuranceTypeCq() {
		return insuranceTypeCq;
	}
	
	public void setInsuranceTypeCq(String insuranceTypeCq) {
		this.insuranceTypeCq = insuranceTypeCq;
	}
}

