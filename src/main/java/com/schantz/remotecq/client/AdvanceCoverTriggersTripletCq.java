package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AdvanceCoverTriggersTripletCq implements Serializable {
	@JsonProperty("localValue")
	private AdvanceCoverTriggersCq localValue = null;
	
	@JsonProperty("parentResolved")
	private AdvanceCoverTriggersCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private AdvanceCoverTriggersCq resolvedValue = null;
	
	
	public AdvanceCoverTriggersCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(AdvanceCoverTriggersCq localValue) {
		this.localValue = localValue;
	}
	
	public AdvanceCoverTriggersCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(AdvanceCoverTriggersCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public AdvanceCoverTriggersCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(AdvanceCoverTriggersCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

