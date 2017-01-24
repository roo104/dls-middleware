package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BasicClaimCriticalIllnessTypeQueryBasicClaimCriticalIllnessTypeQueryResult implements Serializable {
	@JsonProperty("claimCriticalIllnessTypeId")
	private ClaimCriticalIllnessTypeIdCq claimCriticalIllnessTypeId = null;
	
	
	public ClaimCriticalIllnessTypeIdCq getClaimCriticalIllnessTypeId() {
		return claimCriticalIllnessTypeId;
	}
	
	public void setClaimCriticalIllnessTypeId(ClaimCriticalIllnessTypeIdCq claimCriticalIllnessTypeId) {
		this.claimCriticalIllnessTypeId = claimCriticalIllnessTypeId;
	}
}

