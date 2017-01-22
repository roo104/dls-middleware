package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyQuotePortfolioDataCq implements Serializable {
  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("investedTotalValue")
  private Double investedTotalValue = null;

  @JsonProperty("selectedRuleFrame")
  private PortfolioRuleFrameIdCq selectedRuleFrame = null;

  @JsonProperty("allowedRuleFramesCollection")
  private List<PortfolioRuleFrameIdCq> allowedRuleFramesCollection = new ArrayList<PortfolioRuleFrameIdCq>();

  @JsonProperty("fundDateSplitCqCollection")
  private List<FundDateSplitCq> fundDateSplitCqCollection = new ArrayList<FundDateSplitCq>();

  @JsonProperty("moneyAccountShareCq")
  private MoneyAccountShareCq moneyAccountShareCq = null;

  @JsonProperty("riskProfileFunctionCq")
  private String riskProfileFunctionCq = null;

  @JsonProperty("periodLengthCq")
  private String periodLengthCq = null;

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;

  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;

  @JsonProperty("isIsLifeCycle")
  private Boolean isIsLifeCycle = false;


  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Double getInvestedTotalValue() {
    return investedTotalValue;
  }

  public void setInvestedTotalValue(Double investedTotalValue) {
    this.investedTotalValue = investedTotalValue;
  }

  public PortfolioRuleFrameIdCq getSelectedRuleFrame() {
    return selectedRuleFrame;
  }

  public void setSelectedRuleFrame(PortfolioRuleFrameIdCq selectedRuleFrame) {
    this.selectedRuleFrame = selectedRuleFrame;
  }
  public PolicyQuotePortfolioDataCq addAllowedRuleFramesCollectionItem(PortfolioRuleFrameIdCq allowedRuleFramesCollectionItem) {
    this.allowedRuleFramesCollection.add(allowedRuleFramesCollectionItem);
    return this;
  }

  public List<PortfolioRuleFrameIdCq> getAllowedRuleFramesCollection() {
    return allowedRuleFramesCollection;
  }

  public void setAllowedRuleFramesCollection(List<PortfolioRuleFrameIdCq> allowedRuleFramesCollection) {
    this.allowedRuleFramesCollection = allowedRuleFramesCollection;
  }
  public PolicyQuotePortfolioDataCq addFundDateSplitCqCollectionItem(FundDateSplitCq fundDateSplitCqCollectionItem) {
    this.fundDateSplitCqCollection.add(fundDateSplitCqCollectionItem);
    return this;
  }

  public List<FundDateSplitCq> getFundDateSplitCqCollection() {
    return fundDateSplitCqCollection;
  }

  public void setFundDateSplitCqCollection(List<FundDateSplitCq> fundDateSplitCqCollection) {
    this.fundDateSplitCqCollection = fundDateSplitCqCollection;
  }

  public MoneyAccountShareCq getMoneyAccountShareCq() {
    return moneyAccountShareCq;
  }

  public void setMoneyAccountShareCq(MoneyAccountShareCq moneyAccountShareCq) {
    this.moneyAccountShareCq = moneyAccountShareCq;
  }

  public String getRiskProfileFunctionCq() {
    return riskProfileFunctionCq;
  }

  public void setRiskProfileFunctionCq(String riskProfileFunctionCq) {
    this.riskProfileFunctionCq = riskProfileFunctionCq;
  }

  public String getPeriodLengthCq() {
    return periodLengthCq;
  }

  public void setPeriodLengthCq(String periodLengthCq) {
    this.periodLengthCq = periodLengthCq;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }

  public PortfolioIdCq getPortfolioIdCq() {
    return portfolioIdCq;
  }

  public void setPortfolioIdCq(PortfolioIdCq portfolioIdCq) {
    this.portfolioIdCq = portfolioIdCq;
  }

  public Boolean getIsIsLifeCycle() {
    return isIsLifeCycle;
  }

  public void setIsIsLifeCycle(Boolean isIsLifeCycle) {
    this.isIsLifeCycle = isIsLifeCycle;
  }
}

