package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobExecutionStatusQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("batchJobExecutionStatusCollection")
	private List<BatchJobExecutionStatus> batchJobExecutionStatusCollection = new ArrayList<BatchJobExecutionStatus>();
	
	public BatchJobExecutionStatusQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchJobExecutionStatusQueryResult addBatchJobExecutionStatusCollectionItem(BatchJobExecutionStatus batchJobExecutionStatusCollectionItem) {
		this.batchJobExecutionStatusCollection.add(batchJobExecutionStatusCollectionItem);
		return this;
	}
	
	public List<BatchJobExecutionStatus> getBatchJobExecutionStatusCollection() {
		return batchJobExecutionStatusCollection;
	}
	
	public void setBatchJobExecutionStatusCollection(List<BatchJobExecutionStatus> batchJobExecutionStatusCollection) {
		this.batchJobExecutionStatusCollection = batchJobExecutionStatusCollection;
	}
}

