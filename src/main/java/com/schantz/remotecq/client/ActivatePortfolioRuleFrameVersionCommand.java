package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ActivatePortfolioRuleFrameVersionCommand implements Serializable {
	@JsonProperty("portfolioRuleFrameVersionIdCq")
	private PortfolioRuleFrameVersionIdCq portfolioRuleFrameVersionIdCq = null;
	
	
	public PortfolioRuleFrameVersionIdCq getPortfolioRuleFrameVersionIdCq() {
		return portfolioRuleFrameVersionIdCq;
	}
	
	public void setPortfolioRuleFrameVersionIdCq(PortfolioRuleFrameVersionIdCq portfolioRuleFrameVersionIdCq) {
		this.portfolioRuleFrameVersionIdCq = portfolioRuleFrameVersionIdCq;
	}
}

