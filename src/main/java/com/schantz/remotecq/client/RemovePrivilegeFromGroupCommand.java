package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RemovePrivilegeFromGroupCommand implements Serializable {
	@JsonProperty("privilegeGroupIdCq")
	private PrivilegeGroupIdCq privilegeGroupIdCq = null;
	
	@JsonProperty("privilegesToRemoveCollection")
	private List<PrivilegeIdCq> privilegesToRemoveCollection = new ArrayList<PrivilegeIdCq>();
	
	
	public PrivilegeGroupIdCq getPrivilegeGroupIdCq() {
		return privilegeGroupIdCq;
	}
	
	public void setPrivilegeGroupIdCq(PrivilegeGroupIdCq privilegeGroupIdCq) {
		this.privilegeGroupIdCq = privilegeGroupIdCq;
	}
	
	public RemovePrivilegeFromGroupCommand addPrivilegesToRemoveCollectionItem(PrivilegeIdCq privilegesToRemoveCollectionItem) {
		this.privilegesToRemoveCollection.add(privilegesToRemoveCollectionItem);
		return this;
	}
	
	public List<PrivilegeIdCq> getPrivilegesToRemoveCollection() {
		return privilegesToRemoveCollection;
	}
	
	public void setPrivilegesToRemoveCollection(List<PrivilegeIdCq> privilegesToRemoveCollection) {
		this.privilegesToRemoveCollection = privilegesToRemoveCollection;
	}
}

