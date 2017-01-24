package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ProcessSearchEntry implements Serializable {
	@JsonProperty("defaultVersion")
	private ProcessVersionIdCq defaultVersion = null;
	
	@JsonProperty("processIdCq")
	private ProcessIdCq processIdCq = null;
	
	
	public ProcessVersionIdCq getDefaultVersion() {
		return defaultVersion;
	}
	
	public void setDefaultVersion(ProcessVersionIdCq defaultVersion) {
		this.defaultVersion = defaultVersion;
	}
	
	public ProcessIdCq getProcessIdCq() {
		return processIdCq;
	}
	
	public void setProcessIdCq(ProcessIdCq processIdCq) {
		this.processIdCq = processIdCq;
	}
}

