package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RoleIdCq implements Serializable {
	@JsonProperty("roleId")
	private String roleId = null;
	
	@JsonProperty("roleUid")
	private String roleUid = null;
	
	
	public String getRoleId() {
		return roleId;
	}
	
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleUid() {
		return roleUid;
	}
	
	public void setRoleUid(String roleUid) {
		this.roleUid = roleUid;
	}
}

