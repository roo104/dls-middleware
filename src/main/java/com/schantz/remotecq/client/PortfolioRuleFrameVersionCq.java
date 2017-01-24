package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PortfolioRuleFrameVersionCq implements Serializable {
	@JsonProperty("lifeCycle")
	private Boolean lifeCycle = false;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("draft")
	private Boolean draft = false;
	
	@JsonProperty("cancelled")
	private Boolean cancelled = false;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("portfolioTradeChargeFrameCqCollection")
	private List<PortfolioTradeChargeFrameCq> portfolioTradeChargeFrameCqCollection = new ArrayList<PortfolioTradeChargeFrameCq>();
	
	@JsonProperty("defaultRebalancingFrequency")
	private String defaultRebalancingFrequency = null;
	
	@JsonProperty("allowedRebalancingFrequencyCollection")
	private List<String> allowedRebalancingFrequencyCollection = new ArrayList<String>();
	
	@JsonProperty("fundRuleSelectionCqCollection")
	private List<FundRuleSelectionCq> fundRuleSelectionCqCollection = new ArrayList<FundRuleSelectionCq>();
	
	@JsonProperty("riskProfileFunction")
	private String riskProfileFunction = null;
	
	@JsonProperty("portfolioRuleFrameVersionIdCq")
	private PortfolioRuleFrameVersionIdCq portfolioRuleFrameVersionIdCq = null;
	
	@JsonProperty("fundRuleSelectionType")
	private String fundRuleSelectionType = null;
	
	
	public Boolean getLifeCycle() {
		return lifeCycle;
	}
	
	public void setLifeCycle(Boolean lifeCycle) {
		this.lifeCycle = lifeCycle;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public Boolean getDraft() {
		return draft;
	}
	
	public void setDraft(Boolean draft) {
		this.draft = draft;
	}
	
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public PortfolioRuleFrameVersionCq addPortfolioTradeChargeFrameCqCollectionItem(PortfolioTradeChargeFrameCq portfolioTradeChargeFrameCqCollectionItem) {
		this.portfolioTradeChargeFrameCqCollection.add(portfolioTradeChargeFrameCqCollectionItem);
		return this;
	}
	
	public List<PortfolioTradeChargeFrameCq> getPortfolioTradeChargeFrameCqCollection() {
		return portfolioTradeChargeFrameCqCollection;
	}
	
	public void setPortfolioTradeChargeFrameCqCollection(List<PortfolioTradeChargeFrameCq> portfolioTradeChargeFrameCqCollection) {
		this.portfolioTradeChargeFrameCqCollection = portfolioTradeChargeFrameCqCollection;
	}
	
	public String getDefaultRebalancingFrequency() {
		return defaultRebalancingFrequency;
	}
	
	public void setDefaultRebalancingFrequency(String defaultRebalancingFrequency) {
		this.defaultRebalancingFrequency = defaultRebalancingFrequency;
	}
	
	public PortfolioRuleFrameVersionCq addAllowedRebalancingFrequencyCollectionItem(String allowedRebalancingFrequencyCollectionItem) {
		this.allowedRebalancingFrequencyCollection.add(allowedRebalancingFrequencyCollectionItem);
		return this;
	}
	
	public List<String> getAllowedRebalancingFrequencyCollection() {
		return allowedRebalancingFrequencyCollection;
	}
	
	public void setAllowedRebalancingFrequencyCollection(List<String> allowedRebalancingFrequencyCollection) {
		this.allowedRebalancingFrequencyCollection = allowedRebalancingFrequencyCollection;
	}
	
	public PortfolioRuleFrameVersionCq addFundRuleSelectionCqCollectionItem(FundRuleSelectionCq fundRuleSelectionCqCollectionItem) {
		this.fundRuleSelectionCqCollection.add(fundRuleSelectionCqCollectionItem);
		return this;
	}
	
	public List<FundRuleSelectionCq> getFundRuleSelectionCqCollection() {
		return fundRuleSelectionCqCollection;
	}
	
	public void setFundRuleSelectionCqCollection(List<FundRuleSelectionCq> fundRuleSelectionCqCollection) {
		this.fundRuleSelectionCqCollection = fundRuleSelectionCqCollection;
	}
	
	public String getRiskProfileFunction() {
		return riskProfileFunction;
	}
	
	public void setRiskProfileFunction(String riskProfileFunction) {
		this.riskProfileFunction = riskProfileFunction;
	}
	
	public PortfolioRuleFrameVersionIdCq getPortfolioRuleFrameVersionIdCq() {
		return portfolioRuleFrameVersionIdCq;
	}
	
	public void setPortfolioRuleFrameVersionIdCq(PortfolioRuleFrameVersionIdCq portfolioRuleFrameVersionIdCq) {
		this.portfolioRuleFrameVersionIdCq = portfolioRuleFrameVersionIdCq;
	}
	
	public String getFundRuleSelectionType() {
		return fundRuleSelectionType;
	}
	
	public void setFundRuleSelectionType(String fundRuleSelectionType) {
		this.fundRuleSelectionType = fundRuleSelectionType;
	}
}

