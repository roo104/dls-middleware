package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AssignDataPrivilegeCommand implements Serializable {
	@JsonProperty("dataProtectedEntity")
	private IdCq dataProtectedEntity = null;
	
	@JsonProperty("privilegeIdCq")
	private PrivilegeIdCq privilegeIdCq = null;
	
	
	public IdCq getDataProtectedEntity() {
		return dataProtectedEntity;
	}
	
	public void setDataProtectedEntity(IdCq dataProtectedEntity) {
		this.dataProtectedEntity = dataProtectedEntity;
	}
	
	public PrivilegeIdCq getPrivilegeIdCq() {
		return privilegeIdCq;
	}
	
	public void setPrivilegeIdCq(PrivilegeIdCq privilegeIdCq) {
		this.privilegeIdCq = privilegeIdCq;
	}
}

