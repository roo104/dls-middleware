package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobConfigs implements Serializable {
	@JsonProperty("allowedStatusCollection")
	private List<String> allowedStatusCollection = new ArrayList<String>();
	
	@JsonProperty("allowedStatesCollection")
	private List<String> allowedStatesCollection = new ArrayList<String>();
	
	@JsonProperty("allowedActivityStatusCollection")
	private List<String> allowedActivityStatusCollection = new ArrayList<String>();
	
	public BatchJobConfigs addAllowedStatusCollectionItem(String allowedStatusCollectionItem) {
		this.allowedStatusCollection.add(allowedStatusCollectionItem);
		return this;
	}
	
	public List<String> getAllowedStatusCollection() {
		return allowedStatusCollection;
	}
	
	public void setAllowedStatusCollection(List<String> allowedStatusCollection) {
		this.allowedStatusCollection = allowedStatusCollection;
	}
	
	public BatchJobConfigs addAllowedStatesCollectionItem(String allowedStatesCollectionItem) {
		this.allowedStatesCollection.add(allowedStatesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedStatesCollection() {
		return allowedStatesCollection;
	}
	
	public void setAllowedStatesCollection(List<String> allowedStatesCollection) {
		this.allowedStatesCollection = allowedStatesCollection;
	}
	
	public BatchJobConfigs addAllowedActivityStatusCollectionItem(String allowedActivityStatusCollectionItem) {
		this.allowedActivityStatusCollection.add(allowedActivityStatusCollectionItem);
		return this;
	}
	
	public List<String> getAllowedActivityStatusCollection() {
		return allowedActivityStatusCollection;
	}
	
	public void setAllowedActivityStatusCollection(List<String> allowedActivityStatusCollection) {
		this.allowedActivityStatusCollection = allowedActivityStatusCollection;
	}
}

