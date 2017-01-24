package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EiConfigQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("configsCollection")
	private List<EiConfigCq> configsCollection = new ArrayList<EiConfigCq>();
	
	public EiConfigQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public EiConfigQueryResult addConfigsCollectionItem(EiConfigCq configsCollectionItem) {
		this.configsCollection.add(configsCollectionItem);
		return this;
	}
	
	public List<EiConfigCq> getConfigsCollection() {
		return configsCollection;
	}
	
	public void setConfigsCollection(List<EiConfigCq> configsCollection) {
		this.configsCollection = configsCollection;
	}
}

