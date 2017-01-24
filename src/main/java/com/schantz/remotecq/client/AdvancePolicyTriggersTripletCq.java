package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AdvancePolicyTriggersTripletCq implements Serializable {
	@JsonProperty("localValue")
	private AdvancePolicyTriggersCq localValue = null;
	
	@JsonProperty("parentResolved")
	private AdvancePolicyTriggersCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private AdvancePolicyTriggersCq resolvedValue = null;
	
	
	public AdvancePolicyTriggersCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(AdvancePolicyTriggersCq localValue) {
		this.localValue = localValue;
	}
	
	public AdvancePolicyTriggersCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(AdvancePolicyTriggersCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public AdvancePolicyTriggersCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(AdvancePolicyTriggersCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

