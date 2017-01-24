package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchAdminStatusQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("lastRunningBatchJobDate")
	private OffsetDateTime lastRunningBatchJobDate = null;
	
	@JsonProperty("batchSchedulerStatus")
	private String batchSchedulerStatus = null;
	
	@JsonProperty("batchEngineStatus")
	private String batchEngineStatus = null;
	
	@JsonProperty("exclusiveState")
	private String exclusiveState = null;
	
	public BatchAdminStatusQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public OffsetDateTime getLastRunningBatchJobDate() {
		return lastRunningBatchJobDate;
	}
	
	public void setLastRunningBatchJobDate(OffsetDateTime lastRunningBatchJobDate) {
		this.lastRunningBatchJobDate = lastRunningBatchJobDate;
	}
	
	public String getBatchSchedulerStatus() {
		return batchSchedulerStatus;
	}
	
	public void setBatchSchedulerStatus(String batchSchedulerStatus) {
		this.batchSchedulerStatus = batchSchedulerStatus;
	}
	
	public String getBatchEngineStatus() {
		return batchEngineStatus;
	}
	
	public void setBatchEngineStatus(String batchEngineStatus) {
		this.batchEngineStatus = batchEngineStatus;
	}
	
	public String getExclusiveState() {
		return exclusiveState;
	}
	
	public void setExclusiveState(String exclusiveState) {
		this.exclusiveState = exclusiveState;
	}
}

