package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UpdatePrivilegeCommand implements Serializable {
	@JsonProperty("newDescription")
	private String newDescription = null;
	
	@JsonProperty("privilegeIdCq")
	private PrivilegeIdCq privilegeIdCq = null;
	
	
	public String getNewDescription() {
		return newDescription;
	}
	
	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
	}
	
	public PrivilegeIdCq getPrivilegeIdCq() {
		return privilegeIdCq;
	}
	
	public void setPrivilegeIdCq(PrivilegeIdCq privilegeIdCq) {
		this.privilegeIdCq = privilegeIdCq;
	}
}

