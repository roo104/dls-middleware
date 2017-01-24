package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupIdCq implements Serializable {
	@JsonProperty("versionBaseUid")
	private String versionBaseUid = null;
	
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("priceGroupName")
	private String priceGroupName = null;
	
	
	public String getVersionBaseUid() {
		return versionBaseUid;
	}
	
	public void setVersionBaseUid(String versionBaseUid) {
		this.versionBaseUid = versionBaseUid;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPriceGroupName() {
		return priceGroupName;
	}
	
	public void setPriceGroupName(String priceGroupName) {
		this.priceGroupName = priceGroupName;
	}
}

