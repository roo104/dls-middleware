package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class VisibilitySelectionFrameTripletCq implements Serializable {
	@JsonProperty("localValue")
	private VisibilitySelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private VisibilitySelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private VisibilitySelectionFrameCq resolvedValue = null;
	
	
	public VisibilitySelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(VisibilitySelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public VisibilitySelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(VisibilitySelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public VisibilitySelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(VisibilitySelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

