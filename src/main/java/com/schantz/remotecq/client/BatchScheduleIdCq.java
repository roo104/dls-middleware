package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleIdCq implements Serializable {
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("batchScheduleUidCq")
	private String batchScheduleUidCq = null;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getBatchScheduleUidCq() {
		return batchScheduleUidCq;
	}
	
	public void setBatchScheduleUidCq(String batchScheduleUidCq) {
		this.batchScheduleUidCq = batchScheduleUidCq;
	}
}

