package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PaidUpFrameTripletCq implements Serializable {
	@JsonProperty("localValue")
	private PaidUpFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private PaidUpFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private PaidUpFrameCq resolvedValue = null;
	
	
	public PaidUpFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(PaidUpFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public PaidUpFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(PaidUpFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public PaidUpFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(PaidUpFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

