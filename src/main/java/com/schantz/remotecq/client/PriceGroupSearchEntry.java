package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupSearchEntry implements Serializable {
	@JsonProperty("priceGroupIdCq")
	private PriceGroupIdCq priceGroupIdCq = null;
	
	@JsonProperty("defaultVersion")
	private PriceGroupVersionIdCq defaultVersion = null;
	
	
	public PriceGroupIdCq getPriceGroupIdCq() {
		return priceGroupIdCq;
	}
	
	public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
		this.priceGroupIdCq = priceGroupIdCq;
	}
	
	public PriceGroupVersionIdCq getDefaultVersion() {
		return defaultVersion;
	}
	
	public void setDefaultVersion(PriceGroupVersionIdCq defaultVersion) {
		this.defaultVersion = defaultVersion;
	}
}

