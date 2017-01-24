package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedClaimModulesTripletCq implements Serializable {
	@JsonProperty("localValue")
	private ClaimModuleSelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private ClaimModuleSelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private ClaimModuleSelectionFrameCq resolvedValue = null;
	
	
	public ClaimModuleSelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(ClaimModuleSelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public ClaimModuleSelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(ClaimModuleSelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public ClaimModuleSelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(ClaimModuleSelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

