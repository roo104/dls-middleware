package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BonusSpecTripletCq implements Serializable {
	@JsonProperty("localValue")
	private BonusSpecCq localValue = null;
	
	@JsonProperty("parentResolved")
	private BonusSpecCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private BonusSpecCq resolvedValue = null;
	
	
	public BonusSpecCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(BonusSpecCq localValue) {
		this.localValue = localValue;
	}
	
	public BonusSpecCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(BonusSpecCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public BonusSpecCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(BonusSpecCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

