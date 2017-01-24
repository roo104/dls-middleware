package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RemovePrivilegeGroupRoleCommand implements Serializable {
	@JsonProperty("roleIdCq")
	private RoleIdCq roleIdCq = null;
	
	@JsonProperty("groupsToRemoveCollection")
	private List<PrivilegeGroupIdCq> groupsToRemoveCollection = new ArrayList<PrivilegeGroupIdCq>();
	
	
	public RoleIdCq getRoleIdCq() {
		return roleIdCq;
	}
	
	public void setRoleIdCq(RoleIdCq roleIdCq) {
		this.roleIdCq = roleIdCq;
	}
	
	public RemovePrivilegeGroupRoleCommand addGroupsToRemoveCollectionItem(PrivilegeGroupIdCq groupsToRemoveCollectionItem) {
		this.groupsToRemoveCollection.add(groupsToRemoveCollectionItem);
		return this;
	}
	
	public List<PrivilegeGroupIdCq> getGroupsToRemoveCollection() {
		return groupsToRemoveCollection;
	}
	
	public void setGroupsToRemoveCollection(List<PrivilegeGroupIdCq> groupsToRemoveCollection) {
		this.groupsToRemoveCollection = groupsToRemoveCollection;
	}
}

