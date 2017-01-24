package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EditSeverityTaskInstanceCommand implements Serializable {
	@JsonProperty("processInstanceStateIdCq")
	private ProcessInstanceStateIdCq processInstanceStateIdCq = null;
	
	@JsonProperty("taskSeverityCq")
	private String taskSeverityCq = null;
	
	
	public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
		return processInstanceStateIdCq;
	}
	
	public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
		this.processInstanceStateIdCq = processInstanceStateIdCq;
	}
	
	public String getTaskSeverityCq() {
		return taskSeverityCq;
	}
	
	public void setTaskSeverityCq(String taskSeverityCq) {
		this.taskSeverityCq = taskSeverityCq;
	}
}

