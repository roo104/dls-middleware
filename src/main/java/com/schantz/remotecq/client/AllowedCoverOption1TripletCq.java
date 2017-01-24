package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedCoverOption1TripletCq implements Serializable {
	@JsonProperty("localValue")
	private CoverOption1SelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private CoverOption1SelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private CoverOption1SelectionFrameCq resolvedValue = null;
	
	
	public CoverOption1SelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(CoverOption1SelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public CoverOption1SelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(CoverOption1SelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public CoverOption1SelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(CoverOption1SelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

