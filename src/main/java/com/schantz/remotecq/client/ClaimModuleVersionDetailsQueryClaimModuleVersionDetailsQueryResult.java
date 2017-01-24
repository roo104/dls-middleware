package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimModuleVersionDetailsQueryClaimModuleVersionDetailsQueryResult implements Serializable {
	@JsonProperty("claimModuleVersionIdCq")
	private ClaimModuleVersionIdCq claimModuleVersionIdCq = null;
	
	
	public ClaimModuleVersionIdCq getClaimModuleVersionIdCq() {
		return claimModuleVersionIdCq;
	}
	
	public void setClaimModuleVersionIdCq(ClaimModuleVersionIdCq claimModuleVersionIdCq) {
		this.claimModuleVersionIdCq = claimModuleVersionIdCq;
	}
}

