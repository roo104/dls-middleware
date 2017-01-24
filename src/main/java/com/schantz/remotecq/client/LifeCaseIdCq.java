package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class LifeCaseIdCq implements Serializable {
	@JsonProperty("lifeCaseId")
	private String lifeCaseId = null;
	
	@JsonProperty("lifeCaseUid")
	private String lifeCaseUid = null;
	
	
	public String getLifeCaseId() {
		return lifeCaseId;
	}
	
	public void setLifeCaseId(String lifeCaseId) {
		this.lifeCaseId = lifeCaseId;
	}
	
	public String getLifeCaseUid() {
		return lifeCaseUid;
	}
	
	public void setLifeCaseUid(String lifeCaseUid) {
		this.lifeCaseUid = lifeCaseUid;
	}
}

