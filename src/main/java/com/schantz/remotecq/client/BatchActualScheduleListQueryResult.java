package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchActualScheduleListQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("resultEntriesCollection")
	private List<BatchActualScheduleEntryCq> resultEntriesCollection = new ArrayList<BatchActualScheduleEntryCq>();
	
	public BatchActualScheduleListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchActualScheduleListQueryResult addResultEntriesCollectionItem(BatchActualScheduleEntryCq resultEntriesCollectionItem) {
		this.resultEntriesCollection.add(resultEntriesCollectionItem);
		return this;
	}
	
	public List<BatchActualScheduleEntryCq> getResultEntriesCollection() {
		return resultEntriesCollection;
	}
	
	public void setResultEntriesCollection(List<BatchActualScheduleEntryCq> resultEntriesCollection) {
		this.resultEntriesCollection = resultEntriesCollection;
	}
}

