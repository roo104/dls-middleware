package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimVersionCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("claimCq")
	private ClaimCq claimCq = null;
	
	@JsonProperty("claimVersionInfoCq")
	private ClaimVersionInfoCq claimVersionInfoCq = null;
	
	@JsonProperty("claimCauseCq")
	private ClaimCauseCq claimCauseCq = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ClaimCq getClaimCq() {
		return claimCq;
	}
	
	public void setClaimCq(ClaimCq claimCq) {
		this.claimCq = claimCq;
	}
	
	public ClaimVersionInfoCq getClaimVersionInfoCq() {
		return claimVersionInfoCq;
	}
	
	public void setClaimVersionInfoCq(ClaimVersionInfoCq claimVersionInfoCq) {
		this.claimVersionInfoCq = claimVersionInfoCq;
	}
	
	public ClaimCauseCq getClaimCauseCq() {
		return claimCauseCq;
	}
	
	public void setClaimCauseCq(ClaimCauseCq claimCauseCq) {
		this.claimCauseCq = claimCauseCq;
	}
}

