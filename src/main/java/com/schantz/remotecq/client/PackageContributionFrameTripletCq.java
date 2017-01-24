package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PackageContributionFrameTripletCq implements Serializable {
	@JsonProperty("localValue")
	private PackageContributionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private PackageContributionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private PackageContributionFrameCq resolvedValue = null;
	
	
	public PackageContributionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(PackageContributionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public PackageContributionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(PackageContributionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public PackageContributionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(PackageContributionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

