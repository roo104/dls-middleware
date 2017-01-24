package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PackageContributionFrameCq implements Serializable {
	@JsonProperty("contributionRule")
	private String contributionRule = null;
	
	@JsonProperty("amountFrameCq")
	private AmountFrameCqObject amountFrameCq = null;
	
	
	public String getContributionRule() {
		return contributionRule;
	}
	
	public void setContributionRule(String contributionRule) {
		this.contributionRule = contributionRule;
	}
	
	public AmountFrameCqObject getAmountFrameCq() {
		return amountFrameCq;
	}
	
	public void setAmountFrameCq(AmountFrameCqObject amountFrameCq) {
		this.amountFrameCq = amountFrameCq;
	}
}

