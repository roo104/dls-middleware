package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class StopBatchJobCommand implements Serializable {
	@JsonProperty("batchJobActivityRequestIdCq")
	private BatchJobActivityRequestIdCq batchJobActivityRequestIdCq = null;
	
	
	public BatchJobActivityRequestIdCq getBatchJobActivityRequestIdCq() {
		return batchJobActivityRequestIdCq;
	}
	
	public void setBatchJobActivityRequestIdCq(BatchJobActivityRequestIdCq batchJobActivityRequestIdCq) {
		this.batchJobActivityRequestIdCq = batchJobActivityRequestIdCq;
	}
}

