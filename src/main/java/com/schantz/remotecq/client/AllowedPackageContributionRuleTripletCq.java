package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedPackageContributionRuleTripletCq implements Serializable {
	@JsonProperty("localValue")
	private PackageContributionRuleSelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private PackageContributionRuleSelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private PackageContributionRuleSelectionFrameCq resolvedValue = null;
	
	
	public PackageContributionRuleSelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(PackageContributionRuleSelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public PackageContributionRuleSelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(PackageContributionRuleSelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public PackageContributionRuleSelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(PackageContributionRuleSelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

