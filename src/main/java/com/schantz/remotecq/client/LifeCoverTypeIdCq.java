package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class LifeCoverTypeIdCq implements Serializable {
	@JsonProperty("lifeCoverTypeUid")
	private String lifeCoverTypeUid = null;
	
	@JsonProperty("lifeCoverTypeId")
	private String lifeCoverTypeId = null;
	
	
	public String getLifeCoverTypeUid() {
		return lifeCoverTypeUid;
	}
	
	public void setLifeCoverTypeUid(String lifeCoverTypeUid) {
		this.lifeCoverTypeUid = lifeCoverTypeUid;
	}
	
	public String getLifeCoverTypeId() {
		return lifeCoverTypeId;
	}
	
	public void setLifeCoverTypeId(String lifeCoverTypeId) {
		this.lifeCoverTypeId = lifeCoverTypeId;
	}
}

