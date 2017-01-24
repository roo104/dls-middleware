package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleRunExampleQueryBatchScheduleRunExampleQueryResult implements Serializable {
	@JsonProperty("exampleNumber")
	private Long exampleNumber = null;
	
	@JsonProperty("batchScheduleSpecCq")
	private BatchScheduleSpecCq batchScheduleSpecCq = null;
	
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	
	public Long getExampleNumber() {
		return exampleNumber;
	}
	
	public void setExampleNumber(Long exampleNumber) {
		this.exampleNumber = exampleNumber;
	}
	
	public BatchScheduleSpecCq getBatchScheduleSpecCq() {
		return batchScheduleSpecCq;
	}
	
	public void setBatchScheduleSpecCq(BatchScheduleSpecCq batchScheduleSpecCq) {
		this.batchScheduleSpecCq = batchScheduleSpecCq;
	}
	
	public BatchJobIdCq getBatchJobIdCq() {
		return batchJobIdCq;
	}
	
	public void setBatchJobIdCq(BatchJobIdCq batchJobIdCq) {
		this.batchJobIdCq = batchJobIdCq;
	}
}

