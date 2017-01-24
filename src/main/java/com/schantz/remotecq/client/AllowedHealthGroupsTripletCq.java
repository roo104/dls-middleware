package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedHealthGroupsTripletCq implements Serializable {
	@JsonProperty("localValue")
	private HealthGroupSelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private HealthGroupSelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private HealthGroupSelectionFrameCq resolvedValue = null;
	
	
	public HealthGroupSelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(HealthGroupSelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public HealthGroupSelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(HealthGroupSelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public HealthGroupSelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(HealthGroupSelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

