package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchDataResultActionEntry implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("batchDataActionTypeCq")
	private String batchDataActionTypeCq = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public String getBatchDataActionTypeCq() {
		return batchDataActionTypeCq;
	}
	
	public void setBatchDataActionTypeCq(String batchDataActionTypeCq) {
		this.batchDataActionTypeCq = batchDataActionTypeCq;
	}
}

