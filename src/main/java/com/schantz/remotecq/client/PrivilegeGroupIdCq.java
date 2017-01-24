package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PrivilegeGroupIdCq implements Serializable {
	@JsonProperty("groupId")
	private String groupId = null;
	
	@JsonProperty("groupUid")
	private String groupUid = null;
	
	
	public String getGroupId() {
		return groupId;
	}
	
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	public String getGroupUid() {
		return groupUid;
	}
	
	public void setGroupUid(String groupUid) {
		this.groupUid = groupUid;
	}
}

