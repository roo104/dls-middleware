package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RemoveRestrictionFromRoleCommand implements Serializable {
	@JsonProperty("restrictionCq")
	private RestrictionCq restrictionCq = null;
	
	@JsonProperty("roleIdCq")
	private RoleIdCq roleIdCq = null;
	
	
	public RestrictionCq getRestrictionCq() {
		return restrictionCq;
	}
	
	public void setRestrictionCq(RestrictionCq restrictionCq) {
		this.restrictionCq = restrictionCq;
	}
	
	public RoleIdCq getRoleIdCq() {
		return roleIdCq;
	}
	
	public void setRoleIdCq(RoleIdCq roleIdCq) {
		this.roleIdCq = roleIdCq;
	}
}

