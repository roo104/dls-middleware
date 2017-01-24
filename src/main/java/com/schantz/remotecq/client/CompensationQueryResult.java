package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CompensationQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("compensationInfoCqCollection")
	private List<CompensationInfoCq> compensationInfoCqCollection = new ArrayList<CompensationInfoCq>();
	
	public CompensationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CompensationQueryResult addCompensationInfoCqCollectionItem(CompensationInfoCq compensationInfoCqCollectionItem) {
		this.compensationInfoCqCollection.add(compensationInfoCqCollectionItem);
		return this;
	}
	
	public List<CompensationInfoCq> getCompensationInfoCqCollection() {
		return compensationInfoCqCollection;
	}
	
	public void setCompensationInfoCqCollection(List<CompensationInfoCq> compensationInfoCqCollection) {
		this.compensationInfoCqCollection = compensationInfoCqCollection;
	}
}

