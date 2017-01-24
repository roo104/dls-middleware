package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class NewDataPrivilegeCommand implements Serializable {
	@JsonProperty("privilegeId")
	private String privilegeId = null;
	
	@JsonProperty("description")
	private String description = null;
	
	
	public String getPrivilegeId() {
		return privilegeId;
	}
	
	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}

