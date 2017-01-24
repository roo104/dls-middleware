package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementRoleValueIdCq implements Serializable {
	@JsonProperty("roleValueUid")
	private String roleValueUid = null;
	
	
	public String getRoleValueUid() {
		return roleValueUid;
	}
	
	public void setRoleValueUid(String roleValueUid) {
		this.roleValueUid = roleValueUid;
	}
}

