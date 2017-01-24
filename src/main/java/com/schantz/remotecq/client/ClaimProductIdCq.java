package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimProductIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("claimModuleVersionIdCq")
	private ClaimModuleVersionIdCq claimModuleVersionIdCq = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public ClaimModuleVersionIdCq getClaimModuleVersionIdCq() {
		return claimModuleVersionIdCq;
	}
	
	public void setClaimModuleVersionIdCq(ClaimModuleVersionIdCq claimModuleVersionIdCq) {
		this.claimModuleVersionIdCq = claimModuleVersionIdCq;
	}
}

