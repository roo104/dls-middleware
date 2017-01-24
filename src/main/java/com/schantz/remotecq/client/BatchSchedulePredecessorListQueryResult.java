package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchSchedulePredecessorListQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("predecessorsCollection")
	private List<BatchScheduleIdCq> predecessorsCollection = new ArrayList<BatchScheduleIdCq>();
	
	public BatchSchedulePredecessorListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchSchedulePredecessorListQueryResult addPredecessorsCollectionItem(BatchScheduleIdCq predecessorsCollectionItem) {
		this.predecessorsCollection.add(predecessorsCollectionItem);
		return this;
	}
	
	public List<BatchScheduleIdCq> getPredecessorsCollection() {
		return predecessorsCollection;
	}
	
	public void setPredecessorsCollection(List<BatchScheduleIdCq> predecessorsCollection) {
		this.predecessorsCollection = predecessorsCollection;
	}
}

