package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeRuleFramePortfolioCommand implements Serializable {
	@JsonProperty("portfolioId")
	private PortfolioIdCq portfolioId = null;
	
	@JsonProperty("switchDate")
	private LocalDate switchDate = null;
	
	@JsonProperty("portfolioRuleFrameIdCq")
	private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;
	
	
	public PortfolioIdCq getPortfolioId() {
		return portfolioId;
	}
	
	public void setPortfolioId(PortfolioIdCq portfolioId) {
		this.portfolioId = portfolioId;
	}
	
	public LocalDate getSwitchDate() {
		return switchDate;
	}
	
	public void setSwitchDate(LocalDate switchDate) {
		this.switchDate = switchDate;
	}
	
	public PortfolioRuleFrameIdCq getPortfolioRuleFrameIdCq() {
		return portfolioRuleFrameIdCq;
	}
	
	public void setPortfolioRuleFrameIdCq(PortfolioRuleFrameIdCq portfolioRuleFrameIdCq) {
		this.portfolioRuleFrameIdCq = portfolioRuleFrameIdCq;
	}
}

