package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimProductCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("claimProductIdCq")
	private ClaimProductIdCq claimProductIdCq = null;
	
	
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
}

