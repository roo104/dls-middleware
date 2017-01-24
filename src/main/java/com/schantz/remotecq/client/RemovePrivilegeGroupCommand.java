package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RemovePrivilegeGroupCommand implements Serializable {
	@JsonProperty("privilegeGroupIdCq")
	private PrivilegeGroupIdCq privilegeGroupIdCq = null;
	
	
	public PrivilegeGroupIdCq getPrivilegeGroupIdCq() {
		return privilegeGroupIdCq;
	}
	
	public void setPrivilegeGroupIdCq(PrivilegeGroupIdCq privilegeGroupIdCq) {
		this.privilegeGroupIdCq = privilegeGroupIdCq;
	}
}

