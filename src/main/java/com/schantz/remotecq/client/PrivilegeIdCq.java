package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PrivilegeIdCq implements Serializable {
	@JsonProperty("privilegeId")
	private String privilegeId = null;
	
	@JsonProperty("privilegeUid")
	private String privilegeUid = null;
	
	
	public String getPrivilegeId() {
		return privilegeId;
	}
	
	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}
	
	public String getPrivilegeUid() {
		return privilegeUid;
	}
	
	public void setPrivilegeUid(String privilegeUid) {
		this.privilegeUid = privilegeUid;
	}
}

