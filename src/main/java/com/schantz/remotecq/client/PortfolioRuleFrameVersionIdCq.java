package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PortfolioRuleFrameVersionIdCq implements Serializable {
	@JsonProperty("uid")
	private String uid = null;
	
	@JsonProperty("portfolioRuleFrameIdCq")
	private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;
	
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public PortfolioRuleFrameIdCq getPortfolioRuleFrameIdCq() {
		return portfolioRuleFrameIdCq;
	}
	
	public void setPortfolioRuleFrameIdCq(PortfolioRuleFrameIdCq portfolioRuleFrameIdCq) {
		this.portfolioRuleFrameIdCq = portfolioRuleFrameIdCq;
	}
}

