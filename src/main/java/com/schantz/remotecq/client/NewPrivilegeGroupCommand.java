package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class NewPrivilegeGroupCommand implements Serializable {
	@JsonProperty("privilegeGroupId")
	private String privilegeGroupId = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("privilegeGroupToCopyFrom")
	private PrivilegeGroupIdCq privilegeGroupToCopyFrom = null;
	
	
	public String getPrivilegeGroupId() {
		return privilegeGroupId;
	}
	
	public void setPrivilegeGroupId(String privilegeGroupId) {
		this.privilegeGroupId = privilegeGroupId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public PrivilegeGroupIdCq getPrivilegeGroupToCopyFrom() {
		return privilegeGroupToCopyFrom;
	}
	
	public void setPrivilegeGroupToCopyFrom(PrivilegeGroupIdCq privilegeGroupToCopyFrom) {
		this.privilegeGroupToCopyFrom = privilegeGroupToCopyFrom;
	}
}

