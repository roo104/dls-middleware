package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DefaultDimensionValuesTripletCq implements Serializable {
	@JsonProperty("localValue")
	private DefaultDimensionValuesCq localValue = null;
	
	@JsonProperty("parentResolved")
	private DefaultDimensionValuesCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private DefaultDimensionValuesCq resolvedValue = null;
	
	
	public DefaultDimensionValuesCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(DefaultDimensionValuesCq localValue) {
		this.localValue = localValue;
	}
	
	public DefaultDimensionValuesCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(DefaultDimensionValuesCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public DefaultDimensionValuesCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(DefaultDimensionValuesCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

