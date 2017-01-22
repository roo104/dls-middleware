package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeTargetSplitPortfolioCommand implements Serializable {
  @JsonProperty("portfolioId")
  private PortfolioIdCq portfolioId = null;

  @JsonProperty("switchDate")
  private LocalDate switchDate = null;

  @JsonProperty("riskProfileFunctionCq")
  private String riskProfileFunctionCq = null;

  @JsonProperty("fundDateSplitCqCollection")
  private List<FundDateSplitCq> fundDateSplitCqCollection = new ArrayList<FundDateSplitCq>();

  @JsonProperty("moneyAccountShareCq")
  private MoneyAccountShareCq moneyAccountShareCq = null;

  @JsonProperty("isEmptyMoneyAccount")
  private Boolean isEmptyMoneyAccount = false;

  @JsonProperty("isDoRebalance")
  private Boolean isDoRebalance = false;

  @JsonProperty("isDoSplit")
  private Boolean isDoSplit = false;


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

  public String getRiskProfileFunctionCq() {
    return riskProfileFunctionCq;
  }

  public void setRiskProfileFunctionCq(String riskProfileFunctionCq) {
    this.riskProfileFunctionCq = riskProfileFunctionCq;
  }
  public ChangeTargetSplitPortfolioCommand addFundDateSplitCqCollectionItem(FundDateSplitCq fundDateSplitCqCollectionItem) {
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

  public Boolean getIsEmptyMoneyAccount() {
    return isEmptyMoneyAccount;
  }

  public void setIsEmptyMoneyAccount(Boolean isEmptyMoneyAccount) {
    this.isEmptyMoneyAccount = isEmptyMoneyAccount;
  }

  public Boolean getIsDoRebalance() {
    return isDoRebalance;
  }

  public void setIsDoRebalance(Boolean isDoRebalance) {
    this.isDoRebalance = isDoRebalance;
  }

  public Boolean getIsDoSplit() {
    return isDoSplit;
  }

  public void setIsDoSplit(Boolean isDoSplit) {
    this.isDoSplit = isDoSplit;
  }
}

