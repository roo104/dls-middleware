package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimCriticalIllnessTypeCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("claimCriticalIllnessTypeId")
	private ClaimCriticalIllnessTypeIdCq claimCriticalIllnessTypeId = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ClaimCriticalIllnessTypeIdCq getClaimCriticalIllnessTypeId() {
		return claimCriticalIllnessTypeId;
	}
	
	public void setClaimCriticalIllnessTypeId(ClaimCriticalIllnessTypeIdCq claimCriticalIllnessTypeId) {
		this.claimCriticalIllnessTypeId = claimCriticalIllnessTypeId;
	}
}

