package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerSelectablityRuleTripletCq implements Serializable {
	@JsonProperty("localValue")
	private CustomerSelectablityRuleCq localValue = null;
	
	@JsonProperty("parentResolved")
	private CustomerSelectablityRuleCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private CustomerSelectablityRuleCq resolvedValue = null;
	
	
	public CustomerSelectablityRuleCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(CustomerSelectablityRuleCq localValue) {
		this.localValue = localValue;
	}
	
	public CustomerSelectablityRuleCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(CustomerSelectablityRuleCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public CustomerSelectablityRuleCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(CustomerSelectablityRuleCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

