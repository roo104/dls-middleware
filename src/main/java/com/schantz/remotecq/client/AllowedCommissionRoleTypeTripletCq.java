package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedCommissionRoleTypeTripletCq implements Serializable {
	@JsonProperty("localValue")
	private CommissionRoleTypeFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private CommissionRoleTypeFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private CommissionRoleTypeFrameCq resolvedValue = null;
	
	
	public CommissionRoleTypeFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(CommissionRoleTypeFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public CommissionRoleTypeFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(CommissionRoleTypeFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public CommissionRoleTypeFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(CommissionRoleTypeFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

