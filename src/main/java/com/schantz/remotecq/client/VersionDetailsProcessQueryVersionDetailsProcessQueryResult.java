package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsProcessQueryVersionDetailsProcessQueryResult implements Serializable {
	@JsonProperty("processVersionIdCq")
	private ProcessVersionIdCq processVersionIdCq = null;
	
	
	public ProcessVersionIdCq getProcessVersionIdCq() {
		return processVersionIdCq;
	}
	
	public void setProcessVersionIdCq(ProcessVersionIdCq processVersionIdCq) {
		this.processVersionIdCq = processVersionIdCq;
	}
}

