package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRegulationSearchQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("defaultVersionEntryCollection")
	private List<CommissionRegulationSearchEntryCq> defaultVersionEntryCollection = new ArrayList<CommissionRegulationSearchEntryCq>();
	
	public CommissionRegulationSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CommissionRegulationSearchQueryResult addDefaultVersionEntryCollectionItem(CommissionRegulationSearchEntryCq defaultVersionEntryCollectionItem) {
		this.defaultVersionEntryCollection.add(defaultVersionEntryCollectionItem);
		return this;
	}
	
	public List<CommissionRegulationSearchEntryCq> getDefaultVersionEntryCollection() {
		return defaultVersionEntryCollection;
	}
	
	public void setDefaultVersionEntryCollection(List<CommissionRegulationSearchEntryCq> defaultVersionEntryCollection) {
		this.defaultVersionEntryCollection = defaultVersionEntryCollection;
	}
}

