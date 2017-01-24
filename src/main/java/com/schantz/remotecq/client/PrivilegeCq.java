package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PrivilegeCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("privilegeIdCq")
	private PrivilegeIdCq privilegeIdCq = null;
	
	@JsonProperty("privilegesEnum")
	private String privilegesEnum = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public PrivilegeIdCq getPrivilegeIdCq() {
		return privilegeIdCq;
	}
	
	public void setPrivilegeIdCq(PrivilegeIdCq privilegeIdCq) {
		this.privilegeIdCq = privilegeIdCq;
	}
	
	public String getPrivilegesEnum() {
		return privilegesEnum;
	}
	
	public void setPrivilegesEnum(String privilegesEnum) {
		this.privilegesEnum = privilegesEnum;
	}
}

