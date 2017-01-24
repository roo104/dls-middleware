package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditPortfolioRuleFrameVersionCommand implements Serializable {
	@JsonProperty("portfolioRuleFrameVersionIdCq")
	private PortfolioRuleFrameVersionIdCq portfolioRuleFrameVersionIdCq = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("cancelled")
	private Boolean cancelled = false;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	@JsonProperty("fundRuleSelectionCqCollection")
	private List<FundRuleSelectionCq> fundRuleSelectionCqCollection = new ArrayList<FundRuleSelectionCq>();
	
	@JsonProperty("fundRuleSelectionTypeCq")
	private String fundRuleSelectionTypeCq = null;
	
	@JsonProperty("riskProfileFunctionCq")
	private String riskProfileFunctionCq = null;
	
	@JsonProperty("allowedRebalancingFrequencyCollection")
	private List<String> allowedRebalancingFrequencyCollection = new ArrayList<String>();
	
	@JsonProperty("defaultRebalancingFrequency")
	private String defaultRebalancingFrequency = null;
	
	@JsonProperty("editTradeChargeFrameSelectionCollection")
	private List<EditTradeChargeFrameSelection> editTradeChargeFrameSelectionCollection = new ArrayList<EditTradeChargeFrameSelection>();
	
	
	public PortfolioRuleFrameVersionIdCq getPortfolioRuleFrameVersionIdCq() {
		return portfolioRuleFrameVersionIdCq;
	}
	
	public void setPortfolioRuleFrameVersionIdCq(PortfolioRuleFrameVersionIdCq portfolioRuleFrameVersionIdCq) {
		this.portfolioRuleFrameVersionIdCq = portfolioRuleFrameVersionIdCq;
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
	
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public EntityNameCq getEntityNameCq() {
		return entityNameCq;
	}
	
	public void setEntityNameCq(EntityNameCq entityNameCq) {
		this.entityNameCq = entityNameCq;
	}
	
	public EditPortfolioRuleFrameVersionCommand addFundRuleSelectionCqCollectionItem(FundRuleSelectionCq fundRuleSelectionCqCollectionItem) {
		this.fundRuleSelectionCqCollection.add(fundRuleSelectionCqCollectionItem);
		return this;
	}
	
	public List<FundRuleSelectionCq> getFundRuleSelectionCqCollection() {
		return fundRuleSelectionCqCollection;
	}
	
	public void setFundRuleSelectionCqCollection(List<FundRuleSelectionCq> fundRuleSelectionCqCollection) {
		this.fundRuleSelectionCqCollection = fundRuleSelectionCqCollection;
	}
	
	public String getFundRuleSelectionTypeCq() {
		return fundRuleSelectionTypeCq;
	}
	
	public void setFundRuleSelectionTypeCq(String fundRuleSelectionTypeCq) {
		this.fundRuleSelectionTypeCq = fundRuleSelectionTypeCq;
	}
	
	public String getRiskProfileFunctionCq() {
		return riskProfileFunctionCq;
	}
	
	public void setRiskProfileFunctionCq(String riskProfileFunctionCq) {
		this.riskProfileFunctionCq = riskProfileFunctionCq;
	}
	
	public EditPortfolioRuleFrameVersionCommand addAllowedRebalancingFrequencyCollectionItem(String allowedRebalancingFrequencyCollectionItem) {
		this.allowedRebalancingFrequencyCollection.add(allowedRebalancingFrequencyCollectionItem);
		return this;
	}
	
	public List<String> getAllowedRebalancingFrequencyCollection() {
		return allowedRebalancingFrequencyCollection;
	}
	
	public void setAllowedRebalancingFrequencyCollection(List<String> allowedRebalancingFrequencyCollection) {
		this.allowedRebalancingFrequencyCollection = allowedRebalancingFrequencyCollection;
	}
	
	public String getDefaultRebalancingFrequency() {
		return defaultRebalancingFrequency;
	}
	
	public void setDefaultRebalancingFrequency(String defaultRebalancingFrequency) {
		this.defaultRebalancingFrequency = defaultRebalancingFrequency;
	}
	
	public EditPortfolioRuleFrameVersionCommand addEditTradeChargeFrameSelectionCollectionItem(EditTradeChargeFrameSelection editTradeChargeFrameSelectionCollectionItem) {
		this.editTradeChargeFrameSelectionCollection.add(editTradeChargeFrameSelectionCollectionItem);
		return this;
	}
	
	public List<EditTradeChargeFrameSelection> getEditTradeChargeFrameSelectionCollection() {
		return editTradeChargeFrameSelectionCollection;
	}
	
	public void setEditTradeChargeFrameSelectionCollection(List<EditTradeChargeFrameSelection> editTradeChargeFrameSelectionCollection) {
		this.editTradeChargeFrameSelectionCollection = editTradeChargeFrameSelectionCollection;
	}
}

