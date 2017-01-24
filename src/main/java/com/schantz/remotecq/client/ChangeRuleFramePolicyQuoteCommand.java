package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeRuleFramePolicyQuoteCommand implements Serializable {
	@JsonProperty("quoteId")
	private QuoteIdCq quoteId = null;
	
	@JsonProperty("switchDate")
	private LocalDate switchDate = null;
	
	@JsonProperty("coverId")
	private PolicyCoverIdCq coverId = null;
	
	@JsonProperty("packageId")
	private PolicyPackageIdCq packageId = null;
	
	@JsonProperty("portfolioRuleFrameIdCq")
	private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;
	
	
	public QuoteIdCq getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(QuoteIdCq quoteId) {
		this.quoteId = quoteId;
	}
	
	public LocalDate getSwitchDate() {
		return switchDate;
	}
	
	public void setSwitchDate(LocalDate switchDate) {
		this.switchDate = switchDate;
	}
	
	public PolicyCoverIdCq getCoverId() {
		return coverId;
	}
	
	public void setCoverId(PolicyCoverIdCq coverId) {
		this.coverId = coverId;
	}
	
	public PolicyPackageIdCq getPackageId() {
		return packageId;
	}
	
	public void setPackageId(PolicyPackageIdCq packageId) {
		this.packageId = packageId;
	}
	
	public PortfolioRuleFrameIdCq getPortfolioRuleFrameIdCq() {
		return portfolioRuleFrameIdCq;
	}
	
	public void setPortfolioRuleFrameIdCq(PortfolioRuleFrameIdCq portfolioRuleFrameIdCq) {
		this.portfolioRuleFrameIdCq = portfolioRuleFrameIdCq;
	}
}

