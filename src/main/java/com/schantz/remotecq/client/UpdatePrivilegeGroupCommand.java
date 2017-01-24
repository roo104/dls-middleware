package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UpdatePrivilegeGroupCommand implements Serializable {
	@JsonProperty("privilegeGroupIdCq")
	private PrivilegeGroupIdCq privilegeGroupIdCq = null;
	
	@JsonProperty("newDescription")
	private String newDescription = null;
	
	
	public PrivilegeGroupIdCq getPrivilegeGroupIdCq() {
		return privilegeGroupIdCq;
	}
	
	public void setPrivilegeGroupIdCq(PrivilegeGroupIdCq privilegeGroupIdCq) {
		this.privilegeGroupIdCq = privilegeGroupIdCq;
	}
	
	public String getNewDescription() {
		return newDescription;
	}
	
	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
	}
}

