package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeleteBatchScheduleCommand implements Serializable {
	@JsonProperty("batchScheduleUidCq")
	private String batchScheduleUidCq = null;
	
	
	public String getBatchScheduleUidCq() {
		return batchScheduleUidCq;
	}
	
	public void setBatchScheduleUidCq(String batchScheduleUidCq) {
		this.batchScheduleUidCq = batchScheduleUidCq;
	}
}

