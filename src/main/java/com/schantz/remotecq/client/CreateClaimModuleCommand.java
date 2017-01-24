package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreateClaimModuleCommand implements Serializable {
	@JsonProperty("claimModuleVersionCq")
	private ClaimModuleVersionCq claimModuleVersionCq = null;
	
	
	public ClaimModuleVersionCq getClaimModuleVersionCq() {
		return claimModuleVersionCq;
	}
	
	public void setClaimModuleVersionCq(ClaimModuleVersionCq claimModuleVersionCq) {
		this.claimModuleVersionCq = claimModuleVersionCq;
	}
}

