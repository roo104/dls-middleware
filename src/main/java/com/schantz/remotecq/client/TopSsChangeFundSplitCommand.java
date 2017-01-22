package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsChangeFundSplitCommand implements Serializable {
  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;

  @JsonProperty("fundDateSplitCqCollection")
  private List<FundDateSplitCq> fundDateSplitCqCollection = new ArrayList<FundDateSplitCq>();

  @JsonProperty("isChangePaymentProfile")
  private Boolean isChangePaymentProfile = false;

  @JsonProperty("isRedistributeFunds")
  private Boolean isRedistributeFunds = false;


  public PortfolioIdCq getPortfolioIdCq() {
    return portfolioIdCq;
  }

  public void setPortfolioIdCq(PortfolioIdCq portfolioIdCq) {
    this.portfolioIdCq = portfolioIdCq;
  }
  public TopSsChangeFundSplitCommand addFundDateSplitCqCollectionItem(FundDateSplitCq fundDateSplitCqCollectionItem) {
    this.fundDateSplitCqCollection.add(fundDateSplitCqCollectionItem);
    return this;
  }

  public List<FundDateSplitCq> getFundDateSplitCqCollection() {
    return fundDateSplitCqCollection;
  }

  public void setFundDateSplitCqCollection(List<FundDateSplitCq> fundDateSplitCqCollection) {
    this.fundDateSplitCqCollection = fundDateSplitCqCollection;
  }

  public Boolean getIsChangePaymentProfile() {
    return isChangePaymentProfile;
  }

  public void setIsChangePaymentProfile(Boolean isChangePaymentProfile) {
    this.isChangePaymentProfile = isChangePaymentProfile;
  }

  public Boolean getIsRedistributeFunds() {
    return isRedistributeFunds;
  }

  public void setIsRedistributeFunds(Boolean isRedistributeFunds) {
    this.isRedistributeFunds = isRedistributeFunds;
  }
}

