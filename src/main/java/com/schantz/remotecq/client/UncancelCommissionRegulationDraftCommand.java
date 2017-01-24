package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UncancelCommissionRegulationDraftCommand implements Serializable {
	@JsonProperty("uncancelMe")
	private CommissionRegulationVersionIdCq uncancelMe = null;
	
	@JsonProperty("cancelMe")
	private CommissionRegulationVersionIdCq cancelMe = null;
	
	
	public CommissionRegulationVersionIdCq getUncancelMe() {
		return uncancelMe;
	}
	
	public void setUncancelMe(CommissionRegulationVersionIdCq uncancelMe) {
		this.uncancelMe = uncancelMe;
	}
	
	public CommissionRegulationVersionIdCq getCancelMe() {
		return cancelMe;
	}
	
	public void setCancelMe(CommissionRegulationVersionIdCq cancelMe) {
		this.cancelMe = cancelMe;
	}
}

