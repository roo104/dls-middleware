package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedPortfolioRuleFrameIdTripletCq implements Serializable {
	@JsonProperty("localValue")
	private PortfolioRuleFrameSelectionFrameCq localValue = null;
	
	@JsonProperty("parentResolved")
	private PortfolioRuleFrameSelectionFrameCq parentResolved = null;
	
	@JsonProperty("resolvedValue")
	private PortfolioRuleFrameSelectionFrameCq resolvedValue = null;
	
	
	public PortfolioRuleFrameSelectionFrameCq getLocalValue() {
		return localValue;
	}
	
	public void setLocalValue(PortfolioRuleFrameSelectionFrameCq localValue) {
		this.localValue = localValue;
	}
	
	public PortfolioRuleFrameSelectionFrameCq getParentResolved() {
		return parentResolved;
	}
	
	public void setParentResolved(PortfolioRuleFrameSelectionFrameCq parentResolved) {
		this.parentResolved = parentResolved;
	}
	
	public PortfolioRuleFrameSelectionFrameCq getResolvedValue() {
		return resolvedValue;
	}
	
	public void setResolvedValue(PortfolioRuleFrameSelectionFrameCq resolvedValue) {
		this.resolvedValue = resolvedValue;
	}
}

