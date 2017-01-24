package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RoleCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("roleIdCq")
	private RoleIdCq roleIdCq = null;
	
	@JsonProperty("privilegeGroupCqCollection")
	private List<PrivilegeGroupCq> privilegeGroupCqCollection = new ArrayList<PrivilegeGroupCq>();
	
	@JsonProperty("userIdCqCollection")
	private List<UserIdCq> userIdCqCollection = new ArrayList<UserIdCq>();
	
	@JsonProperty("isActive")
	private Boolean isActive = false;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public RoleIdCq getRoleIdCq() {
		return roleIdCq;
	}
	
	public void setRoleIdCq(RoleIdCq roleIdCq) {
		this.roleIdCq = roleIdCq;
	}
	
	public RoleCq addPrivilegeGroupCqCollectionItem(PrivilegeGroupCq privilegeGroupCqCollectionItem) {
		this.privilegeGroupCqCollection.add(privilegeGroupCqCollectionItem);
		return this;
	}
	
	public List<PrivilegeGroupCq> getPrivilegeGroupCqCollection() {
		return privilegeGroupCqCollection;
	}
	
	public void setPrivilegeGroupCqCollection(List<PrivilegeGroupCq> privilegeGroupCqCollection) {
		this.privilegeGroupCqCollection = privilegeGroupCqCollection;
	}
	
	public RoleCq addUserIdCqCollectionItem(UserIdCq userIdCqCollectionItem) {
		this.userIdCqCollection.add(userIdCqCollectionItem);
		return this;
	}
	
	public List<UserIdCq> getUserIdCqCollection() {
		return userIdCqCollection;
	}
	
	public void setUserIdCqCollection(List<UserIdCq> userIdCqCollection) {
		this.userIdCqCollection = userIdCqCollection;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

