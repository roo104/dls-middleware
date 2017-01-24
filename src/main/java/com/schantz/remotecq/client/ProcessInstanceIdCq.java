package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ProcessInstanceIdCq implements Serializable {
	@JsonProperty("instanceUid")
	private String instanceUid = null;
	
	@JsonProperty("processVersionIdCq")
	private ProcessVersionIdCq processVersionIdCq = null;
	
	
	public String getInstanceUid() {
		return instanceUid;
	}
	
	public void setInstanceUid(String instanceUid) {
		this.instanceUid = instanceUid;
	}
	
	public ProcessVersionIdCq getProcessVersionIdCq() {
		return processVersionIdCq;
	}
	
	public void setProcessVersionIdCq(ProcessVersionIdCq processVersionIdCq) {
		this.processVersionIdCq = processVersionIdCq;
	}
}

