package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchAdminConfigs implements Serializable {
	@JsonProperty("allowedEngineStatusCollection")
	private List<String> allowedEngineStatusCollection = new ArrayList<String>();
	
	@JsonProperty("allowedExclusiveStatesCollection")
	private List<String> allowedExclusiveStatesCollection = new ArrayList<String>();
	
	@JsonProperty("allowedSchedulerStatusCollection")
	private List<String> allowedSchedulerStatusCollection = new ArrayList<String>();
	
	public BatchAdminConfigs addAllowedEngineStatusCollectionItem(String allowedEngineStatusCollectionItem) {
		this.allowedEngineStatusCollection.add(allowedEngineStatusCollectionItem);
		return this;
	}
	
	public List<String> getAllowedEngineStatusCollection() {
		return allowedEngineStatusCollection;
	}
	
	public void setAllowedEngineStatusCollection(List<String> allowedEngineStatusCollection) {
		this.allowedEngineStatusCollection = allowedEngineStatusCollection;
	}
	
	public BatchAdminConfigs addAllowedExclusiveStatesCollectionItem(String allowedExclusiveStatesCollectionItem) {
		this.allowedExclusiveStatesCollection.add(allowedExclusiveStatesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedExclusiveStatesCollection() {
		return allowedExclusiveStatesCollection;
	}
	
	public void setAllowedExclusiveStatesCollection(List<String> allowedExclusiveStatesCollection) {
		this.allowedExclusiveStatesCollection = allowedExclusiveStatesCollection;
	}
	
	public BatchAdminConfigs addAllowedSchedulerStatusCollectionItem(String allowedSchedulerStatusCollectionItem) {
		this.allowedSchedulerStatusCollection.add(allowedSchedulerStatusCollectionItem);
		return this;
	}
	
	public List<String> getAllowedSchedulerStatusCollection() {
		return allowedSchedulerStatusCollection;
	}
	
	public void setAllowedSchedulerStatusCollection(List<String> allowedSchedulerStatusCollection) {
		this.allowedSchedulerStatusCollection = allowedSchedulerStatusCollection;
	}
}

