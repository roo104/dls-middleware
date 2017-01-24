package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantTypeLevelEdit implements Serializable {
	@JsonProperty("claimProductTypeCq")
	private String claimProductTypeCq = null;
	
	
	public String getClaimProductTypeCq() {
		return claimProductTypeCq;
	}
	
	public void setClaimProductTypeCq(String claimProductTypeCq) {
		this.claimProductTypeCq = claimProductTypeCq;
	}
}

