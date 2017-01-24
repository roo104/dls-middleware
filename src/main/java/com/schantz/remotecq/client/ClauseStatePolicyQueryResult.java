package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClauseStatePolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("clauseStatePolicyQueryEntryCollection")
	private List<ClauseStatePolicyQueryEntry> clauseStatePolicyQueryEntryCollection = new ArrayList<ClauseStatePolicyQueryEntry>();
	
	public ClauseStatePolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClauseStatePolicyQueryResult addClauseStatePolicyQueryEntryCollectionItem(ClauseStatePolicyQueryEntry clauseStatePolicyQueryEntryCollectionItem) {
		this.clauseStatePolicyQueryEntryCollection.add(clauseStatePolicyQueryEntryCollectionItem);
		return this;
	}
	
	public List<ClauseStatePolicyQueryEntry> getClauseStatePolicyQueryEntryCollection() {
		return clauseStatePolicyQueryEntryCollection;
	}
	
	public void setClauseStatePolicyQueryEntryCollection(List<ClauseStatePolicyQueryEntry> clauseStatePolicyQueryEntryCollection) {
		this.clauseStatePolicyQueryEntryCollection = clauseStatePolicyQueryEntryCollection;
	}
}

