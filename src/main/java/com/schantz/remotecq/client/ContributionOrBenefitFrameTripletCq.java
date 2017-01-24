package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ContributionOrBenefitFrameTripletCq implements Serializable {
	@JsonProperty("localValue")
	private ContributionOrBenefitFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private ContributionOrBenefitFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private ContributionOrBenefitFrameCq resolvedValue = null;
	
	
	public ContributionOrBenefitFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(ContributionOrBenefitFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public ContributionOrBenefitFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(ContributionOrBenefitFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public ContributionOrBenefitFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(ContributionOrBenefitFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

