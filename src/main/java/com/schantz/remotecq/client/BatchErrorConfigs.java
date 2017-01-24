package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchErrorConfigs implements Serializable {
	@JsonProperty("allowedErrorTicketStatusCollection")
	private List<String> allowedErrorTicketStatusCollection = new ArrayList<String>();
	
	@JsonProperty("allowedPeriodsCollection")
	private List<String> allowedPeriodsCollection = new ArrayList<String>();
	
	@JsonProperty("allowedErrorSeveritiesCollection")
	private List<String> allowedErrorSeveritiesCollection = new ArrayList<String>();
	
	public BatchErrorConfigs addAllowedErrorTicketStatusCollectionItem(String allowedErrorTicketStatusCollectionItem) {
		this.allowedErrorTicketStatusCollection.add(allowedErrorTicketStatusCollectionItem);
		return this;
	}
	
	public List<String> getAllowedErrorTicketStatusCollection() {
		return allowedErrorTicketStatusCollection;
	}
	
	public void setAllowedErrorTicketStatusCollection(List<String> allowedErrorTicketStatusCollection) {
		this.allowedErrorTicketStatusCollection = allowedErrorTicketStatusCollection;
	}
	
	public BatchErrorConfigs addAllowedPeriodsCollectionItem(String allowedPeriodsCollectionItem) {
		this.allowedPeriodsCollection.add(allowedPeriodsCollectionItem);
		return this;
	}
	
	public List<String> getAllowedPeriodsCollection() {
		return allowedPeriodsCollection;
	}
	
	public void setAllowedPeriodsCollection(List<String> allowedPeriodsCollection) {
		this.allowedPeriodsCollection = allowedPeriodsCollection;
	}
	
	public BatchErrorConfigs addAllowedErrorSeveritiesCollectionItem(String allowedErrorSeveritiesCollectionItem) {
		this.allowedErrorSeveritiesCollection.add(allowedErrorSeveritiesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedErrorSeveritiesCollection() {
		return allowedErrorSeveritiesCollection;
	}
	
	public void setAllowedErrorSeveritiesCollection(List<String> allowedErrorSeveritiesCollection) {
		this.allowedErrorSeveritiesCollection = allowedErrorSeveritiesCollection;
	}
}

