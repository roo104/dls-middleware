package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CoverDeathSpecCq implements Serializable {
	@JsonProperty("noOfMonths")
	private Long noOfMonths = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("benefitInformationEventSpecCqCollection")
	private List<BenefitInformationEventSpecCq> benefitInformationEventSpecCqCollection = new ArrayList<BenefitInformationEventSpecCq>();
	
	
	public Long getNoOfMonths() {
		return noOfMonths;
	}
	
	public void setNoOfMonths(Long noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public CoverDeathSpecCq addBenefitInformationEventSpecCqCollectionItem(BenefitInformationEventSpecCq benefitInformationEventSpecCqCollectionItem) {
		this.benefitInformationEventSpecCqCollection.add(benefitInformationEventSpecCqCollectionItem);
		return this;
	}
	
	public List<BenefitInformationEventSpecCq> getBenefitInformationEventSpecCqCollection() {
		return benefitInformationEventSpecCqCollection;
	}
	
	public void setBenefitInformationEventSpecCqCollection(List<BenefitInformationEventSpecCq> benefitInformationEventSpecCqCollection) {
		this.benefitInformationEventSpecCqCollection = benefitInformationEventSpecCqCollection;
	}
}

