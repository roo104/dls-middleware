package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchDataQueryBatchDataQueryResult implements Serializable {
	@JsonProperty("batchIdCq")
	private BatchIdCq batchIdCq = null;
	
	
	public BatchIdCq getBatchIdCq() {
		return batchIdCq;
	}
	
	public void setBatchIdCq(BatchIdCq batchIdCq) {
		this.batchIdCq = batchIdCq;
	}
}

