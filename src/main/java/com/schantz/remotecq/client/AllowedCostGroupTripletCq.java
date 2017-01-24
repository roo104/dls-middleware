package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedCostGroupTripletCq implements Serializable {
	@JsonProperty("localValue")
	private CostGroupSelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private CostGroupSelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private CostGroupSelectionFrameCq resolvedValue = null;
	
	
	public CostGroupSelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(CostGroupSelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public CostGroupSelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(CostGroupSelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public CostGroupSelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(CostGroupSelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

