package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ContributionFrameTripletCq implements Serializable {
	@JsonProperty("localValue")
	private ContributionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private ContributionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private ContributionFrameCq resolvedValue = null;
	
	
	public ContributionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(ContributionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public ContributionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(ContributionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public ContributionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(ContributionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

