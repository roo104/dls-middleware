package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobActivityRequestIdCq implements Serializable {
	@JsonProperty("batchJobActivityRequestUidCq")
	private String batchJobActivityRequestUidCq = null;
	
	
	public String getBatchJobActivityRequestUidCq() {
		return batchJobActivityRequestUidCq;
	}
	
	public void setBatchJobActivityRequestUidCq(String batchJobActivityRequestUidCq) {
		this.batchJobActivityRequestUidCq = batchJobActivityRequestUidCq;
	}
}

