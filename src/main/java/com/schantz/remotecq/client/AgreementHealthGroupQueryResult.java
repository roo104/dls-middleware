package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementHealthGroupQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("healthGroupVersionCqCollection")
	private List<HealthGroupVersionCq> healthGroupVersionCqCollection = new ArrayList<HealthGroupVersionCq>();
	
	public AgreementHealthGroupQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public AgreementHealthGroupQueryResult addHealthGroupVersionCqCollectionItem(HealthGroupVersionCq healthGroupVersionCqCollectionItem) {
		this.healthGroupVersionCqCollection.add(healthGroupVersionCqCollectionItem);
		return this;
	}
	
	public List<HealthGroupVersionCq> getHealthGroupVersionCqCollection() {
		return healthGroupVersionCqCollection;
	}
	
	public void setHealthGroupVersionCqCollection(List<HealthGroupVersionCq> healthGroupVersionCqCollection) {
		this.healthGroupVersionCqCollection = healthGroupVersionCqCollection;
	}
}

