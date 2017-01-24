package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimClosingCauseCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("claimClosingCauseIdCq")
	private ClaimClosingCauseIdCq claimClosingCauseIdCq = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ClaimClosingCauseIdCq getClaimClosingCauseIdCq() {
		return claimClosingCauseIdCq;
	}
	
	public void setClaimClosingCauseIdCq(ClaimClosingCauseIdCq claimClosingCauseIdCq) {
		this.claimClosingCauseIdCq = claimClosingCauseIdCq;
	}
}

