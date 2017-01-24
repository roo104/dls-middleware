package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TimeSpecFrameTripletCq implements Serializable {
	@JsonProperty("localValue")
	private TimeSpecFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private TimeSpecFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private TimeSpecFrameCq resolvedValue = null;
	
	
	public TimeSpecFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(TimeSpecFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public TimeSpecFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(TimeSpecFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public TimeSpecFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(TimeSpecFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

