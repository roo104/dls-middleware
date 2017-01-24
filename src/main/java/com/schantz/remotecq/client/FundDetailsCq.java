package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class FundDetailsCq implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("yield_ytd")
	private Double yieldYtd = null;
	
	@JsonProperty("yield_1y")
	private Double yield1y = null;
	
	@JsonProperty("yield_5y")
	private Double yield5y = null;
	
	@JsonProperty("projectionGroup")
	private String projectionGroup = null;
	
	@JsonProperty("buy")
	private Double buy = null;
	
	@JsonProperty("sell")
	private Double sell = null;
	
	@JsonProperty("value")
	private Double value = null;
	
	@JsonProperty("cashValue")
	private Double cashValue = null;
	
	@JsonProperty("investmentAssetCq")
	private String investmentAssetCq = null;
	
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	@JsonProperty("sectorCq")
	private String sectorCq = null;
	
	@JsonProperty("currencyCodeCq")
	private String currencyCodeCq = null;
	
	@JsonProperty("morningStarCq")
	private String morningStarCq = null;
	
	@JsonProperty("regionCq")
	private String regionCq = null;
	
	@JsonProperty("investmentRiskCq")
	private String investmentRiskCq = null;
	
	@JsonProperty("kickbackOptionCq")
	private String kickbackOptionCq = null;
	
	@JsonProperty("investmentRuleCq")
	private String investmentRuleCq = null;
	
	@JsonProperty("fundVersionIdCq")
	private FundVersionIdCq fundVersionIdCq = null;
	
	@JsonProperty("fundProjectionGroupCq")
	private String fundProjectionGroupCq = null;
	
	@JsonProperty("fundInternalChargeGroupCq")
	private String fundInternalChargeGroupCq = null;
	
	@JsonProperty("isActive")
	private Boolean isActive = false;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getYieldYtd() {
		return yieldYtd;
	}
	
	public void setYieldYtd(Double yieldYtd) {
		this.yieldYtd = yieldYtd;
	}
	
	public Double getYield1y() {
		return yield1y;
	}
	
	public void setYield1y(Double yield1y) {
		this.yield1y = yield1y;
	}
	
	public Double getYield5y() {
		return yield5y;
	}
	
	public void setYield5y(Double yield5y) {
		this.yield5y = yield5y;
	}
	
	public String getProjectionGroup() {
		return projectionGroup;
	}
	
	public void setProjectionGroup(String projectionGroup) {
		this.projectionGroup = projectionGroup;
	}
	
	public Double getBuy() {
		return buy;
	}
	
	public void setBuy(Double buy) {
		this.buy = buy;
	}
	
	public Double getSell() {
		return sell;
	}
	
	public void setSell(Double sell) {
		this.sell = sell;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double getCashValue() {
		return cashValue;
	}
	
	public void setCashValue(Double cashValue) {
		this.cashValue = cashValue;
	}
	
	public String getInvestmentAssetCq() {
		return investmentAssetCq;
	}
	
	public void setInvestmentAssetCq(String investmentAssetCq) {
		this.investmentAssetCq = investmentAssetCq;
	}
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
	
	public String getSectorCq() {
		return sectorCq;
	}
	
	public void setSectorCq(String sectorCq) {
		this.sectorCq = sectorCq;
	}
	
	public String getCurrencyCodeCq() {
		return currencyCodeCq;
	}
	
	public void setCurrencyCodeCq(String currencyCodeCq) {
		this.currencyCodeCq = currencyCodeCq;
	}
	
	public String getMorningStarCq() {
		return morningStarCq;
	}
	
	public void setMorningStarCq(String morningStarCq) {
		this.morningStarCq = morningStarCq;
	}
	
	public String getRegionCq() {
		return regionCq;
	}
	
	public void setRegionCq(String regionCq) {
		this.regionCq = regionCq;
	}
	
	public String getInvestmentRiskCq() {
		return investmentRiskCq;
	}
	
	public void setInvestmentRiskCq(String investmentRiskCq) {
		this.investmentRiskCq = investmentRiskCq;
	}
	
	public String getKickbackOptionCq() {
		return kickbackOptionCq;
	}
	
	public void setKickbackOptionCq(String kickbackOptionCq) {
		this.kickbackOptionCq = kickbackOptionCq;
	}
	
	public String getInvestmentRuleCq() {
		return investmentRuleCq;
	}
	
	public void setInvestmentRuleCq(String investmentRuleCq) {
		this.investmentRuleCq = investmentRuleCq;
	}
	
	public FundVersionIdCq getFundVersionIdCq() {
		return fundVersionIdCq;
	}
	
	public void setFundVersionIdCq(FundVersionIdCq fundVersionIdCq) {
		this.fundVersionIdCq = fundVersionIdCq;
	}
	
	public String getFundProjectionGroupCq() {
		return fundProjectionGroupCq;
	}
	
	public void setFundProjectionGroupCq(String fundProjectionGroupCq) {
		this.fundProjectionGroupCq = fundProjectionGroupCq;
	}
	
	public String getFundInternalChargeGroupCq() {
		return fundInternalChargeGroupCq;
	}
	
	public void setFundInternalChargeGroupCq(String fundInternalChargeGroupCq) {
		this.fundInternalChargeGroupCq = fundInternalChargeGroupCq;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

