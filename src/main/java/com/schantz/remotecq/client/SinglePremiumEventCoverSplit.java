package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class SinglePremiumEventCoverSplit implements Serializable {
	@JsonProperty("benefitBefore")
	private Double benefitBefore = null;
	
	@JsonProperty("benefitAfter")
	private Double benefitAfter = null;
	
	@JsonProperty("benefitDiff")
	private Double benefitDiff = null;
	
	@JsonProperty("calculatedPremium")
	private Double calculatedPremium = null;
	
	@JsonProperty("calculatedCharge")
	private Double calculatedCharge = null;
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	
	public Double getBenefitBefore() {
		return benefitBefore;
	}
	
	public void setBenefitBefore(Double benefitBefore) {
		this.benefitBefore = benefitBefore;
	}
	
	public Double getBenefitAfter() {
		return benefitAfter;
	}
	
	public void setBenefitAfter(Double benefitAfter) {
		this.benefitAfter = benefitAfter;
	}
	
	public Double getBenefitDiff() {
		return benefitDiff;
	}
	
	public void setBenefitDiff(Double benefitDiff) {
		this.benefitDiff = benefitDiff;
	}
	
	public Double getCalculatedPremium() {
		return calculatedPremium;
	}
	
	public void setCalculatedPremium(Double calculatedPremium) {
		this.calculatedPremium = calculatedPremium;
	}
	
	public Double getCalculatedCharge() {
		return calculatedCharge;
	}
	
	public void setCalculatedCharge(Double calculatedCharge) {
		this.calculatedCharge = calculatedCharge;
	}
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
}

