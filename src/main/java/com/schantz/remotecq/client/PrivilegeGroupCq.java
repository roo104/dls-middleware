package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PrivilegeGroupCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("privilegeCqCollection")
	private List<PrivilegeCq> privilegeCqCollection = new ArrayList<PrivilegeCq>();
	
	@JsonProperty("privilegeGroupIdCq")
	private PrivilegeGroupIdCq privilegeGroupIdCq = null;
	
	@JsonProperty("roleIdCqCollection")
	private List<RoleIdCq> roleIdCqCollection = new ArrayList<RoleIdCq>();
	
	@JsonProperty("isActive")
	private Boolean isActive = false;
	
	
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
	
	public PrivilegeGroupCq addPrivilegeCqCollectionItem(PrivilegeCq privilegeCqCollectionItem) {
		this.privilegeCqCollection.add(privilegeCqCollectionItem);
		return this;
	}
	
	public List<PrivilegeCq> getPrivilegeCqCollection() {
		return privilegeCqCollection;
	}
	
	public void setPrivilegeCqCollection(List<PrivilegeCq> privilegeCqCollection) {
		this.privilegeCqCollection = privilegeCqCollection;
	}
	
	public PrivilegeGroupIdCq getPrivilegeGroupIdCq() {
		return privilegeGroupIdCq;
	}
	
	public void setPrivilegeGroupIdCq(PrivilegeGroupIdCq privilegeGroupIdCq) {
		this.privilegeGroupIdCq = privilegeGroupIdCq;
	}
	
	public PrivilegeGroupCq addRoleIdCqCollectionItem(RoleIdCq roleIdCqCollectionItem) {
		this.roleIdCqCollection.add(roleIdCqCollectionItem);
		return this;
	}
	
	public List<RoleIdCq> getRoleIdCqCollection() {
		return roleIdCqCollection;
	}
	
	public void setRoleIdCqCollection(List<RoleIdCq> roleIdCqCollection) {
		this.roleIdCqCollection = roleIdCqCollection;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

