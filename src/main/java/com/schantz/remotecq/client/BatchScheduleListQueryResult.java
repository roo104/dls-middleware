package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleListQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("resultEntriesCollection")
	private List<BatchScheduleEntryCq> resultEntriesCollection = new ArrayList<BatchScheduleEntryCq>();
	
	public BatchScheduleListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchScheduleListQueryResult addResultEntriesCollectionItem(BatchScheduleEntryCq resultEntriesCollectionItem) {
		this.resultEntriesCollection.add(resultEntriesCollectionItem);
		return this;
	}
	
	public List<BatchScheduleEntryCq> getResultEntriesCollection() {
		return resultEntriesCollection;
	}
	
	public void setResultEntriesCollection(List<BatchScheduleEntryCq> resultEntriesCollection) {
		this.resultEntriesCollection = resultEntriesCollection;
	}
}

