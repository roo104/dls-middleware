package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class BatchActualScheduleEntryCq implements Serializable {
	@JsonProperty("executionTime")
	private OffsetDateTime executionTime = null;
	
	@JsonProperty("batchScheduleIdCq")
	private BatchScheduleIdCq batchScheduleIdCq = null;
	
	@JsonProperty("isDisabled")
	private Boolean isDisabled = false;
	
	
	public OffsetDateTime getExecutionTime() {
		return executionTime;
	}
	
	public void setExecutionTime(OffsetDateTime executionTime) {
		this.executionTime = executionTime;
	}
	
	public BatchScheduleIdCq getBatchScheduleIdCq() {
		return batchScheduleIdCq;
	}
	
	public void setBatchScheduleIdCq(BatchScheduleIdCq batchScheduleIdCq) {
		this.batchScheduleIdCq = batchScheduleIdCq;
	}
	
	public Boolean getIsDisabled() {
		return isDisabled;
	}
	
	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
}

