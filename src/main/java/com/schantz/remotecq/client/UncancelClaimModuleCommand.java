package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UncancelClaimModuleCommand implements Serializable {
	@JsonProperty("uncancelMe")
	private ClaimModuleVersionIdCq uncancelMe = null;
	
	@JsonProperty("cancelMe")
	private ClaimModuleVersionIdCq cancelMe = null;
	
	
	public ClaimModuleVersionIdCq getUncancelMe() {
		return uncancelMe;
	}
	
	public void setUncancelMe(ClaimModuleVersionIdCq uncancelMe) {
		this.uncancelMe = uncancelMe;
	}
	
	public ClaimModuleVersionIdCq getCancelMe() {
		return cancelMe;
	}
	
	public void setCancelMe(ClaimModuleVersionIdCq cancelMe) {
		this.cancelMe = cancelMe;
	}
}

