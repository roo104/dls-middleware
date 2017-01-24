package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ExternalReceiverTripletCq implements Serializable {
	@JsonProperty("localValue")
	private LegalPartyIdCq localValue = null;
	
	@JsonProperty("parentResolved")
	private LegalPartyIdCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private LegalPartyIdCq resolvedValue = null;
	
	
	public LegalPartyIdCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(LegalPartyIdCq localValue) {
		this.localValue = localValue;
	}
	
	public LegalPartyIdCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(LegalPartyIdCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public LegalPartyIdCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(LegalPartyIdCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

