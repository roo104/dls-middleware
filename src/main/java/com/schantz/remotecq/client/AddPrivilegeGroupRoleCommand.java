package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AddPrivilegeGroupRoleCommand implements Serializable {
	@JsonProperty("roleIdCq")
	private RoleIdCq roleIdCq = null;
	
	@JsonProperty("groupsToAddCollection")
	private List<PrivilegeGroupIdCq> groupsToAddCollection = new ArrayList<PrivilegeGroupIdCq>();
	
	
	public RoleIdCq getRoleIdCq() {
		return roleIdCq;
	}
	
	public void setRoleIdCq(RoleIdCq roleIdCq) {
		this.roleIdCq = roleIdCq;
	}
	
	public AddPrivilegeGroupRoleCommand addGroupsToAddCollectionItem(PrivilegeGroupIdCq groupsToAddCollectionItem) {
		this.groupsToAddCollection.add(groupsToAddCollectionItem);
		return this;
	}
	
	public List<PrivilegeGroupIdCq> getGroupsToAddCollection() {
		return groupsToAddCollection;
	}
	
	public void setGroupsToAddCollection(List<PrivilegeGroupIdCq> groupsToAddCollection) {
		this.groupsToAddCollection = groupsToAddCollection;
	}
}

