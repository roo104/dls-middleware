package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRefundSearchQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("defaultVersionEntryCollection")
	private List<CommissionRefundSearchEntryCq> defaultVersionEntryCollection = new ArrayList<CommissionRefundSearchEntryCq>();
	
	public CommissionRefundSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CommissionRefundSearchQueryResult addDefaultVersionEntryCollectionItem(CommissionRefundSearchEntryCq defaultVersionEntryCollectionItem) {
		this.defaultVersionEntryCollection.add(defaultVersionEntryCollectionItem);
		return this;
	}
	
	public List<CommissionRefundSearchEntryCq> getDefaultVersionEntryCollection() {
		return defaultVersionEntryCollection;
	}
	
	public void setDefaultVersionEntryCollection(List<CommissionRefundSearchEntryCq> defaultVersionEntryCollection) {
		this.defaultVersionEntryCollection = defaultVersionEntryCollection;
	}
}

