package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AdvanceCoverTriggerIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("groupId")
	private String groupId = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getGroupId() {
		return groupId;
	}
	
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
}

