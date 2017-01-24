package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedPolicyOption3TripletCq implements Serializable {
	@JsonProperty("localValue")
	private PolicyOption3SelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private PolicyOption3SelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private PolicyOption3SelectionFrameCq resolvedValue = null;
	
	
	public PolicyOption3SelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(PolicyOption3SelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public PolicyOption3SelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(PolicyOption3SelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public PolicyOption3SelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(PolicyOption3SelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

