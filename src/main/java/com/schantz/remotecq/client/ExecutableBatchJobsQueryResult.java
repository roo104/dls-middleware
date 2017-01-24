package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExecutableBatchJobsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("executableBatchJobCollection")
	private List<ExecutableBatchJob> executableBatchJobCollection = new ArrayList<ExecutableBatchJob>();
	
	public ExecutableBatchJobsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ExecutableBatchJobsQueryResult addExecutableBatchJobCollectionItem(ExecutableBatchJob executableBatchJobCollectionItem) {
		this.executableBatchJobCollection.add(executableBatchJobCollectionItem);
		return this;
	}
	
	public List<ExecutableBatchJob> getExecutableBatchJobCollection() {
		return executableBatchJobCollection;
	}
	
	public void setExecutableBatchJobCollection(List<ExecutableBatchJob> executableBatchJobCollection) {
		this.executableBatchJobCollection = executableBatchJobCollection;
	}
}

