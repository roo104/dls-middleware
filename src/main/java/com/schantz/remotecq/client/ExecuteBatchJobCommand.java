package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExecuteBatchJobCommand implements Serializable {
	@JsonProperty("timeoutMs")
	private Long timeoutMs = null;
	
	@JsonProperty("batchParameterCqCollection")
	private List<BatchParameterCq> batchParameterCqCollection = new ArrayList<BatchParameterCq>();
	
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	@JsonProperty("isSynchronous")
	private Boolean isSynchronous = false;
	
	
	public Long getTimeoutMs() {
		return timeoutMs;
	}
	
	public void setTimeoutMs(Long timeoutMs) {
		this.timeoutMs = timeoutMs;
	}
	
	public ExecuteBatchJobCommand addBatchParameterCqCollectionItem(BatchParameterCq batchParameterCqCollectionItem) {
		this.batchParameterCqCollection.add(batchParameterCqCollectionItem);
		return this;
	}
	
	public List<BatchParameterCq> getBatchParameterCqCollection() {
		return batchParameterCqCollection;
	}
	
	public void setBatchParameterCqCollection(List<BatchParameterCq> batchParameterCqCollection) {
		this.batchParameterCqCollection = batchParameterCqCollection;
	}
	
	public BatchJobIdCq getBatchJobIdCq() {
		return batchJobIdCq;
	}
	
	public void setBatchJobIdCq(BatchJobIdCq batchJobIdCq) {
		this.batchJobIdCq = batchJobIdCq;
	}
	
	public Boolean getIsSynchronous() {
		return isSynchronous;
	}
	
	public void setIsSynchronous(Boolean isSynchronous) {
		this.isSynchronous = isSynchronous;
	}
}

