package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCostTripletCq implements Serializable {
	@JsonProperty("localValue")
	private AgreementCostDataCq localValue = null;
	
	@JsonProperty("parentResolved")
	private AgreementCostDataCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private AgreementCostDataCq resolvedValue = null;
	
	
	public AgreementCostDataCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(AgreementCostDataCq localValue) {
		this.localValue = localValue;
	}
	
	public AgreementCostDataCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(AgreementCostDataCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public AgreementCostDataCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(AgreementCostDataCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

