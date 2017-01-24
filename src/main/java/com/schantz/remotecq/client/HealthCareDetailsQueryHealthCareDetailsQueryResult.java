package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class HealthCareDetailsQueryHealthCareDetailsQueryResult implements Serializable {
	@JsonProperty("claimVersionIdCq")
	private ClaimVersionIdCq claimVersionIdCq = null;
	
	@JsonProperty("claimGrantStatusCq")
	private String claimGrantStatusCq = null;
	
	
	public ClaimVersionIdCq getClaimVersionIdCq() {
		return claimVersionIdCq;
	}
	
	public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
		this.claimVersionIdCq = claimVersionIdCq;
	}
	
	public String getClaimGrantStatusCq() {
		return claimGrantStatusCq;
	}
	
	public void setClaimGrantStatusCq(String claimGrantStatusCq) {
		this.claimGrantStatusCq = claimGrantStatusCq;
	}
}

