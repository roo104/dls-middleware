package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ProcessInstanceStateStatusChangeCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("processInstanceStateStatusCq")
	private String processInstanceStateStatusCq = null;
	
	@JsonProperty("log")
	private ProcessInstanceStateLogCq log = null;
	
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public String getProcessInstanceStateStatusCq() {
		return processInstanceStateStatusCq;
	}
	
	public void setProcessInstanceStateStatusCq(String processInstanceStateStatusCq) {
		this.processInstanceStateStatusCq = processInstanceStateStatusCq;
	}
	
	public ProcessInstanceStateLogCq getLog() {
		return log;
	}
	
	public void setLog(ProcessInstanceStateLogCq log) {
		this.log = log;
	}
}

