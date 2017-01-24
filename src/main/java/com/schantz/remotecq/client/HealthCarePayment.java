package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class HealthCarePayment implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("noOfTreatments")
	private Long noOfTreatments = null;
	
	@JsonProperty("claimGrantHealthCareVersionIdCq")
	private ClaimGrantHealthCareVersionIdCq claimGrantHealthCareVersionIdCq = null;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Long getNoOfTreatments() {
		return noOfTreatments;
	}
	
	public void setNoOfTreatments(Long noOfTreatments) {
		this.noOfTreatments = noOfTreatments;
	}
	
	public ClaimGrantHealthCareVersionIdCq getClaimGrantHealthCareVersionIdCq() {
		return claimGrantHealthCareVersionIdCq;
	}
	
	public void setClaimGrantHealthCareVersionIdCq(ClaimGrantHealthCareVersionIdCq claimGrantHealthCareVersionIdCq) {
		this.claimGrantHealthCareVersionIdCq = claimGrantHealthCareVersionIdCq;
	}
}

