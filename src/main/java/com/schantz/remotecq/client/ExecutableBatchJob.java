package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExecutableBatchJob implements Serializable {
	@JsonProperty("title")
	private String title = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("shortName")
	private String shortName = null;
	
	@JsonProperty("batchParameterCqCollection")
	private List<BatchParameterCq> batchParameterCqCollection = new ArrayList<BatchParameterCq>();
	
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public ExecutableBatchJob addBatchParameterCqCollectionItem(BatchParameterCq batchParameterCqCollectionItem) {
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
}

