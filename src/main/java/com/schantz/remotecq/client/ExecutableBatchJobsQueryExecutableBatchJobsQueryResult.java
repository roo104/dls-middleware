package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ExecutableBatchJobsQueryExecutableBatchJobsQueryResult implements Serializable {
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	
	public BatchJobIdCq getBatchJobIdCq() {
		return batchJobIdCq;
	}
	
	public void setBatchJobIdCq(BatchJobIdCq batchJobIdCq) {
		this.batchJobIdCq = batchJobIdCq;
	}
}

