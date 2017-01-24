package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UpdateBatchScheduleCommand implements Serializable {
	@JsonProperty("batchScheduleDataCq")
	private BatchScheduleDataCq batchScheduleDataCq = null;
	
	@JsonProperty("batchScheduleIdCq")
	private BatchScheduleIdCq batchScheduleIdCq = null;
	
	
	public BatchScheduleDataCq getBatchScheduleDataCq() {
		return batchScheduleDataCq;
	}
	
	public void setBatchScheduleDataCq(BatchScheduleDataCq batchScheduleDataCq) {
		this.batchScheduleDataCq = batchScheduleDataCq;
	}
	
	public BatchScheduleIdCq getBatchScheduleIdCq() {
		return batchScheduleIdCq;
	}
	
	public void setBatchScheduleIdCq(BatchScheduleIdCq batchScheduleIdCq) {
		this.batchScheduleIdCq = batchScheduleIdCq;
	}
}

