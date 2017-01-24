package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobActivityRequestDataCq implements Serializable {
	@JsonProperty("user")
	private String user = null;
	
	@JsonProperty("progressDescription")
	private String progressDescription = null;
	
	@JsonProperty("note")
	private String note = null;
	
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	@JsonProperty("parametersCollection")
	private List<BatchParameterEntryCq> parametersCollection = new ArrayList<BatchParameterEntryCq>();
	
	@JsonProperty("isOneShot")
	private Boolean isOneShot = false;
	
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getProgressDescription() {
		return progressDescription;
	}
	
	public void setProgressDescription(String progressDescription) {
		this.progressDescription = progressDescription;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public BatchJobIdCq getBatchJobIdCq() {
		return batchJobIdCq;
	}
	
	public void setBatchJobIdCq(BatchJobIdCq batchJobIdCq) {
		this.batchJobIdCq = batchJobIdCq;
	}
	
	public BatchJobActivityRequestDataCq addParametersCollectionItem(BatchParameterEntryCq parametersCollectionItem) {
		this.parametersCollection.add(parametersCollectionItem);
		return this;
	}
	
	public List<BatchParameterEntryCq> getParametersCollection() {
		return parametersCollection;
	}
	
	public void setParametersCollection(List<BatchParameterEntryCq> parametersCollection) {
		this.parametersCollection = parametersCollection;
	}
	
	public Boolean getIsOneShot() {
		return isOneShot;
	}
	
	public void setIsOneShot(Boolean isOneShot) {
		this.isOneShot = isOneShot;
	}
}

