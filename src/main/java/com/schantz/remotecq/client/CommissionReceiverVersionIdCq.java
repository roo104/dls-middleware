package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionReceiverVersionIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("baseUid")
	private CommissionReceiverIdCq baseUid = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public CommissionReceiverIdCq getBaseUid() {
		return baseUid;
	}
	
	public void setBaseUid(CommissionReceiverIdCq baseUid) {
		this.baseUid = baseUid;
	}
}

