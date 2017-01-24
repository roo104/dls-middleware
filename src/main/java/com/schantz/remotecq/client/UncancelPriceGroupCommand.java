package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UncancelPriceGroupCommand implements Serializable {
	@JsonProperty("cancelMe")
	private PriceGroupVersionIdCq cancelMe = null;
	
	@JsonProperty("uncancelMe")
	private PriceGroupVersionIdCq uncancelMe = null;
	
	
	public PriceGroupVersionIdCq getCancelMe() {
		return cancelMe;
	}
	
	public void setCancelMe(PriceGroupVersionIdCq cancelMe) {
		this.cancelMe = cancelMe;
	}
	
	public PriceGroupVersionIdCq getUncancelMe() {
		return uncancelMe;
	}
	
	public void setUncancelMe(PriceGroupVersionIdCq uncancelMe) {
		this.uncancelMe = uncancelMe;
	}
}

