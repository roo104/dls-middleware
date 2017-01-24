package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class MagicConstantTripletCq implements Serializable {
	@JsonProperty("localValue")
	private MagicConstantCq localValue = null;
	
	@JsonProperty("parentResolved")
	private MagicConstantCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private MagicConstantCq resolvedValue = null;
	
	
	public MagicConstantCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(MagicConstantCq localValue) {
		this.localValue = localValue;
	}
	
	public MagicConstantCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(MagicConstantCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public MagicConstantCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(MagicConstantCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

