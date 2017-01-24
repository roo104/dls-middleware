package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ConfigurationPriceGroupQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("allowedCalculationTypesCollection")
	private List<String> allowedCalculationTypesCollection = new ArrayList<String>();
	
	@JsonProperty("scopePartCqCollection")
	private List<ScopePartCq> scopePartCqCollection = new ArrayList<ScopePartCq>();
	
	public ConfigurationPriceGroupQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ConfigurationPriceGroupQueryResult addAllowedCalculationTypesCollectionItem(String allowedCalculationTypesCollectionItem) {
		this.allowedCalculationTypesCollection.add(allowedCalculationTypesCollectionItem);
		return this;
	}
	
	public List<String> getAllowedCalculationTypesCollection() {
		return allowedCalculationTypesCollection;
	}
	
	public void setAllowedCalculationTypesCollection(List<String> allowedCalculationTypesCollection) {
		this.allowedCalculationTypesCollection = allowedCalculationTypesCollection;
	}
	
	public ConfigurationPriceGroupQueryResult addScopePartCqCollectionItem(ScopePartCq scopePartCqCollectionItem) {
		this.scopePartCqCollection.add(scopePartCqCollectionItem);
		return this;
	}
	
	public List<ScopePartCq> getScopePartCqCollection() {
		return scopePartCqCollection;
	}
	
	public void setScopePartCqCollection(List<ScopePartCq> scopePartCqCollection) {
		this.scopePartCqCollection = scopePartCqCollection;
	}
}

