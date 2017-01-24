package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupPriceIdCq implements Serializable {
	@JsonProperty("priceGroupPriceUid")
	private String priceGroupPriceUid = null;
	
	@JsonProperty("priceGroupVersionIdCq")
	private PriceGroupVersionIdCq priceGroupVersionIdCq = null;
	
	
	public String getPriceGroupPriceUid() {
		return priceGroupPriceUid;
	}
	
	public void setPriceGroupPriceUid(String priceGroupPriceUid) {
		this.priceGroupPriceUid = priceGroupPriceUid;
	}
	
	public PriceGroupVersionIdCq getPriceGroupVersionIdCq() {
		return priceGroupVersionIdCq;
	}
	
	public void setPriceGroupVersionIdCq(PriceGroupVersionIdCq priceGroupVersionIdCq) {
		this.priceGroupVersionIdCq = priceGroupVersionIdCq;
	}
}

