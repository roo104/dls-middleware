package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchConfigurationQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("documentationUrl")
	private String documentationUrl = null;
	
	@JsonProperty("batchJobConfigs")
	private BatchJobConfigs batchJobConfigs = null;
	
	@JsonProperty("batchAdminConfigs")
	private BatchAdminConfigs batchAdminConfigs = null;
	
	@JsonProperty("batchFileConfigs")
	private BatchFileConfigs batchFileConfigs = null;
	
	@JsonProperty("batchErrorConfigs")
	private BatchErrorConfigs batchErrorConfigs = null;
	
	public BatchConfigurationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public String getDocumentationUrl() {
		return documentationUrl;
	}
	
	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}
	
	public BatchJobConfigs getBatchJobConfigs() {
		return batchJobConfigs;
	}
	
	public void setBatchJobConfigs(BatchJobConfigs batchJobConfigs) {
		this.batchJobConfigs = batchJobConfigs;
	}
	
	public BatchAdminConfigs getBatchAdminConfigs() {
		return batchAdminConfigs;
	}
	
	public void setBatchAdminConfigs(BatchAdminConfigs batchAdminConfigs) {
		this.batchAdminConfigs = batchAdminConfigs;
	}
	
	public BatchFileConfigs getBatchFileConfigs() {
		return batchFileConfigs;
	}
	
	public void setBatchFileConfigs(BatchFileConfigs batchFileConfigs) {
		this.batchFileConfigs = batchFileConfigs;
	}
	
	public BatchErrorConfigs getBatchErrorConfigs() {
		return batchErrorConfigs;
	}
	
	public void setBatchErrorConfigs(BatchErrorConfigs batchErrorConfigs) {
		this.batchErrorConfigs = batchErrorConfigs;
	}
}

