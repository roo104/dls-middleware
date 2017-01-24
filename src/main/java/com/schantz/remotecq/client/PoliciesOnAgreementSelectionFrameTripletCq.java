package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PoliciesOnAgreementSelectionFrameTripletCq implements Serializable {
	@JsonProperty("localValue")
	private PoliciesOnAgreementSelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private PoliciesOnAgreementSelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private PoliciesOnAgreementSelectionFrameCq resolvedValue = null;
	
	
	public PoliciesOnAgreementSelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(PoliciesOnAgreementSelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public PoliciesOnAgreementSelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(PoliciesOnAgreementSelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public PoliciesOnAgreementSelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(PoliciesOnAgreementSelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

