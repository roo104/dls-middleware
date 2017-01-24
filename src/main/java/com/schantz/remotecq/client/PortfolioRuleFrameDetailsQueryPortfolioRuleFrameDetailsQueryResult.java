package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PortfolioRuleFrameDetailsQueryPortfolioRuleFrameDetailsQueryResult implements Serializable {
	@JsonProperty("portfolioRuleFrameIdCq")
	private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;
	
	
	public PortfolioRuleFrameIdCq getPortfolioRuleFrameIdCq() {
		return portfolioRuleFrameIdCq;
	}
	
	public void setPortfolioRuleFrameIdCq(PortfolioRuleFrameIdCq portfolioRuleFrameIdCq) {
		this.portfolioRuleFrameIdCq = portfolioRuleFrameIdCq;
	}
}

