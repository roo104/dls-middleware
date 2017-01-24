package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimCriticalIllnessProductCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("claimProductIdCq")
	private ClaimProductIdCq claimProductIdCq = null;
	
	@JsonProperty("waitingPeriod")
	private Long waitingPeriod = null;
	
	@JsonProperty("claimCriticalIllnessTypeCq")
	private ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq = null;
	
	@JsonProperty("periodLengthCq")
	private String periodLengthCq = null;
	
	@JsonProperty("periodStartCq")
	private String periodStartCq = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ClaimProductIdCq getClaimProductIdCq() {
		return claimProductIdCq;
	}
	
	public void setClaimProductIdCq(ClaimProductIdCq claimProductIdCq) {
		this.claimProductIdCq = claimProductIdCq;
	}
	
	public Long getWaitingPeriod() {
		return waitingPeriod;
	}
	
	public void setWaitingPeriod(Long waitingPeriod) {
		this.waitingPeriod = waitingPeriod;
	}
	
	public ClaimCriticalIllnessTypeCq getClaimCriticalIllnessTypeCq() {
		return claimCriticalIllnessTypeCq;
	}
	
	public void setClaimCriticalIllnessTypeCq(ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq) {
		this.claimCriticalIllnessTypeCq = claimCriticalIllnessTypeCq;
	}
	
	public String getPeriodLengthCq() {
		return periodLengthCq;
	}
	
	public void setPeriodLengthCq(String periodLengthCq) {
		this.periodLengthCq = periodLengthCq;
	}
	
	public String getPeriodStartCq() {
		return periodStartCq;
	}
	
	public void setPeriodStartCq(String periodStartCq) {
		this.periodStartCq = periodStartCq;
	}
}

