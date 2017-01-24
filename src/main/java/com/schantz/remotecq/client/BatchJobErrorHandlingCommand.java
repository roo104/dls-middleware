package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobErrorHandlingCommand implements Serializable {
	@JsonProperty("data")
	private BatchJobErrorHandlingDataCq data = null;
	
	@JsonProperty("batchJobErrorTicketUidCq")
	private String batchJobErrorTicketUidCq = null;
	
	
	public BatchJobErrorHandlingDataCq getData() {
		return data;
	}
	
	public void setData(BatchJobErrorHandlingDataCq data) {
		this.data = data;
	}
	
	public String getBatchJobErrorTicketUidCq() {
		return batchJobErrorTicketUidCq;
	}
	
	public void setBatchJobErrorTicketUidCq(String batchJobErrorTicketUidCq) {
		this.batchJobErrorTicketUidCq = batchJobErrorTicketUidCq;
	}
}

