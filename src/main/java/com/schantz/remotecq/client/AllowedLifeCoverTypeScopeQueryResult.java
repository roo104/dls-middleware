package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedLifeCoverTypeScopeQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("lifeCoverScopeCollection")
	private List<LifeCoverTypeCq> lifeCoverScopeCollection = new ArrayList<LifeCoverTypeCq>();
	
	public AllowedLifeCoverTypeScopeQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public AllowedLifeCoverTypeScopeQueryResult addLifeCoverScopeCollectionItem(LifeCoverTypeCq lifeCoverScopeCollectionItem) {
		this.lifeCoverScopeCollection.add(lifeCoverScopeCollectionItem);
		return this;
	}
	
	public List<LifeCoverTypeCq> getLifeCoverScopeCollection() {
		return lifeCoverScopeCollection;
	}
	
	public void setLifeCoverScopeCollection(List<LifeCoverTypeCq> lifeCoverScopeCollection) {
		this.lifeCoverScopeCollection = lifeCoverScopeCollection;
	}
}

