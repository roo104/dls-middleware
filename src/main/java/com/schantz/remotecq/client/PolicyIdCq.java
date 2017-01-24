package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyIdCq implements Serializable {
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("policyUid")
	private String policyUid = null;
	
	@JsonProperty("eventTransUid")
	private String eventTransUid = null;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPolicyUid() {
		return policyUid;
	}
	
	public void setPolicyUid(String policyUid) {
		this.policyUid = policyUid;
	}
	
	public String getEventTransUid() {
		return eventTransUid;
	}
	
	public void setEventTransUid(String eventTransUid) {
		this.eventTransUid = eventTransUid;
	}
}

