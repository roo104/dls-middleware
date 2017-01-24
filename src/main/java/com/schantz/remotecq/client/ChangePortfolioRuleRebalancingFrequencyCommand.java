package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ChangePortfolioRuleRebalancingFrequencyCommand implements Serializable {
	@JsonProperty("portfolioId")
	private PortfolioIdCq portfolioId = null;
	
	@JsonProperty("switchDate")
	private LocalDate switchDate = null;
	
	@JsonProperty("doRebalance")
	private Boolean doRebalance = false;
	
	@JsonProperty("periodLengthCq")
	private String periodLengthCq = null;
	
	
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
	
	public Boolean getDoRebalance() {
		return doRebalance;
	}
	
	public void setDoRebalance(Boolean doRebalance) {
		this.doRebalance = doRebalance;
	}
	
	public String getPeriodLengthCq() {
		return periodLengthCq;
	}
	
	public void setPeriodLengthCq(String periodLengthCq) {
		this.periodLengthCq = periodLengthCq;
	}
}

