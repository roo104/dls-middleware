package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class SaveClaimCriticalIllnessTypeCommand implements Serializable {
	@JsonProperty("claimCriticalIllnessTypeCq")
	private ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq = null;
	
	
	public ClaimCriticalIllnessTypeCq getClaimCriticalIllnessTypeCq() {
		return claimCriticalIllnessTypeCq;
	}
	
	public void setClaimCriticalIllnessTypeCq(ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq) {
		this.claimCriticalIllnessTypeCq = claimCriticalIllnessTypeCq;
	}
}

