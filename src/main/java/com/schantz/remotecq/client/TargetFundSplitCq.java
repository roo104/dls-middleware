package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TargetFundSplitCq implements Serializable {
	@JsonProperty("pct")
	private Double pct = null;
	
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	
	public Double getPct() {
		return pct;
	}
	
	public void setPct(Double pct) {
		this.pct = pct;
	}
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
}

