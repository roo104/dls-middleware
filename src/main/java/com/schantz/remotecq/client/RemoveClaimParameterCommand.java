package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RemoveClaimParameterCommand implements Serializable {
	@JsonProperty("claimParameterIdCq")
	private ClaimParameterIdCq claimParameterIdCq = null;
	
	
	public ClaimParameterIdCq getClaimParameterIdCq() {
		return claimParameterIdCq;
	}
	
	public void setClaimParameterIdCq(ClaimParameterIdCq claimParameterIdCq) {
		this.claimParameterIdCq = claimParameterIdCq;
	}
}

