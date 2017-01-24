package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedAgreementCostTypeTripletCq implements Serializable {
	@JsonProperty("localValue")
	private CostTypeFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private CostTypeFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private CostTypeFrameCq resolvedValue = null;
	
	
	public CostTypeFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(CostTypeFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public CostTypeFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(CostTypeFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public CostTypeFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(CostTypeFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

