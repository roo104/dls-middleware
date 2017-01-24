package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UpdateRoleCommand implements Serializable {
	@JsonProperty("roleIdCq")
	private RoleIdCq roleIdCq = null;
	
	@JsonProperty("newDescription")
	private String newDescription = null;
	
	
	public RoleIdCq getRoleIdCq() {
		return roleIdCq;
	}
	
	public void setRoleIdCq(RoleIdCq roleIdCq) {
		this.roleIdCq = roleIdCq;
	}
	
	public String getNewDescription() {
		return newDescription;
	}
	
	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
	}
}

