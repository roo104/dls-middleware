package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TerminateProcessInstanceCommand implements Serializable {
	@JsonProperty("processInstanceIdCq")
	private ProcessInstanceIdCq processInstanceIdCq = null;
	
	
	public ProcessInstanceIdCq getProcessInstanceIdCq() {
		return processInstanceIdCq;
	}
	
	public void setProcessInstanceIdCq(ProcessInstanceIdCq processInstanceIdCq) {
		this.processInstanceIdCq = processInstanceIdCq;
	}
}

