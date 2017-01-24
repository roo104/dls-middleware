package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ConfigWfc2IdCq implements Serializable {
	@JsonProperty("configUid")
	private String configUid = null;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	@JsonProperty("processVersionIdCq")
	private ProcessVersionIdCq processVersionIdCq = null;
	
	
	public String getConfigUid() {
		return configUid;
	}
	
	public void setConfigUid(String configUid) {
		this.configUid = configUid;
	}
	
	public EntityNameCq getEntityNameCq() {
		return entityNameCq;
	}
	
	public void setEntityNameCq(EntityNameCq entityNameCq) {
		this.entityNameCq = entityNameCq;
	}
	
	public ProcessVersionIdCq getProcessVersionIdCq() {
		return processVersionIdCq;
	}
	
	public void setProcessVersionIdCq(ProcessVersionIdCq processVersionIdCq) {
		this.processVersionIdCq = processVersionIdCq;
	}
}

