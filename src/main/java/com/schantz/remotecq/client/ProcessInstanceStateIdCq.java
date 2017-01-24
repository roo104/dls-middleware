package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ProcessInstanceStateIdCq implements Serializable {
	@JsonProperty("instanceStateUid")
	private String instanceStateUid = null;
	
	@JsonProperty("processInstanceIdCq")
	private ProcessInstanceIdCq processInstanceIdCq = null;
	
	@JsonProperty("configWfc2IdCq")
	private ConfigWfc2IdCq configWfc2IdCq = null;
	
	
	public String getInstanceStateUid() {
		return instanceStateUid;
	}
	
	public void setInstanceStateUid(String instanceStateUid) {
		this.instanceStateUid = instanceStateUid;
	}
	
	public ProcessInstanceIdCq getProcessInstanceIdCq() {
		return processInstanceIdCq;
	}
	
	public void setProcessInstanceIdCq(ProcessInstanceIdCq processInstanceIdCq) {
		this.processInstanceIdCq = processInstanceIdCq;
	}
	
	public ConfigWfc2IdCq getConfigWfc2IdCq() {
		return configWfc2IdCq;
	}
	
	public void setConfigWfc2IdCq(ConfigWfc2IdCq configWfc2IdCq) {
		this.configWfc2IdCq = configWfc2IdCq;
	}
}

