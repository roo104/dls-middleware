package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchParameterCq implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("batchParameterMetaData")
	private BatchParameterMetaData batchParameterMetaData = null;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BatchParameterMetaData getBatchParameterMetaData() {
		return batchParameterMetaData;
	}
	
	public void setBatchParameterMetaData(BatchParameterMetaData batchParameterMetaData) {
		this.batchParameterMetaData = batchParameterMetaData;
	}
}

