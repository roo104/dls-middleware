package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AddPrivilegeToGroupCommand implements Serializable {
	@JsonProperty("privilegeGroupIdCq")
	private PrivilegeGroupIdCq privilegeGroupIdCq = null;
	
	@JsonProperty("privilegesToAddCollection")
	private List<PrivilegeIdCq> privilegesToAddCollection = new ArrayList<PrivilegeIdCq>();
	
	
	public PrivilegeGroupIdCq getPrivilegeGroupIdCq() {
		return privilegeGroupIdCq;
	}
	
	public void setPrivilegeGroupIdCq(PrivilegeGroupIdCq privilegeGroupIdCq) {
		this.privilegeGroupIdCq = privilegeGroupIdCq;
	}
	
	public AddPrivilegeToGroupCommand addPrivilegesToAddCollectionItem(PrivilegeIdCq privilegesToAddCollectionItem) {
		this.privilegesToAddCollection.add(privilegesToAddCollectionItem);
		return this;
	}
	
	public List<PrivilegeIdCq> getPrivilegesToAddCollection() {
		return privilegesToAddCollection;
	}
	
	public void setPrivilegesToAddCollection(List<PrivilegeIdCq> privilegesToAddCollection) {
		this.privilegesToAddCollection = privilegesToAddCollection;
	}
}

