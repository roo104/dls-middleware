package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedRegulationCodeTripletCq implements Serializable {
	@JsonProperty("localValue")
	private RegulationCodeSelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private RegulationCodeSelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private RegulationCodeSelectionFrameCq resolvedValue = null;
	
	
	public RegulationCodeSelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(RegulationCodeSelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public RegulationCodeSelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(RegulationCodeSelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public RegulationCodeSelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(RegulationCodeSelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

