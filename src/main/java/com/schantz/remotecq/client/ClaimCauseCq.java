package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimCauseCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("claimCauseIdCq")
	private ClaimCauseIdCq claimCauseIdCq = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ClaimCauseIdCq getClaimCauseIdCq() {
		return claimCauseIdCq;
	}
	
	public void setClaimCauseIdCq(ClaimCauseIdCq claimCauseIdCq) {
		this.claimCauseIdCq = claimCauseIdCq;
	}
}

