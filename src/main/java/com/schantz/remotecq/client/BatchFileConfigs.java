package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchFileConfigs implements Serializable {
	@JsonProperty("allowedActivityModesCollection")
	private List<String> allowedActivityModesCollection = new ArrayList<String>();
	
	@JsonProperty("allowedActivityStatusCollection")
	private List<String> allowedActivityStatusCollection = new ArrayList<String>();
	
	public BatchFileConfigs addAllowedActivityModesCollectionItem(String allowedActivityModesCollectionItem) {
		this.allowedActivityModesCollection.add(allowedActivityModesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedActivityModesCollection() {
		return allowedActivityModesCollection;
	}
	
	public void setAllowedActivityModesCollection(List<String> allowedActivityModesCollection) {
		this.allowedActivityModesCollection = allowedActivityModesCollection;
	}
	
	public BatchFileConfigs addAllowedActivityStatusCollectionItem(String allowedActivityStatusCollectionItem) {
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

