package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class HistoricRuleFrameChangeCq implements Serializable {
	@JsonProperty("switchDate")
	private LocalDate switchDate = null;
	
	@JsonProperty("portfolioRuleFrameIdCq")
	private PortfolioRuleFrameIdCq portfolioRuleFrameIdCq = null;
	
	
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

