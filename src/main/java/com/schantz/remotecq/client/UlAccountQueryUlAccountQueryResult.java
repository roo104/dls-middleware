package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class UlAccountQueryUlAccountQueryResult implements Serializable {
	@JsonProperty("viewAtTime")
	private OffsetDateTime viewAtTime = null;
	
	@JsonProperty("portfolioId")
	private PortfolioIdCq portfolioId = null;
	
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	
	public OffsetDateTime getViewAtTime() {
		return viewAtTime;
	}
	
	public void setViewAtTime(OffsetDateTime viewAtTime) {
		this.viewAtTime = viewAtTime;
	}
	
	public PortfolioIdCq getPortfolioId() {
		return portfolioId;
	}
	
	public void setPortfolioId(PortfolioIdCq portfolioId) {
		this.portfolioId = portfolioId;
	}
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
}

