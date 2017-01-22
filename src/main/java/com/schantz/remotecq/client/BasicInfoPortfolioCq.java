package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BasicInfoPortfolioCq implements Serializable {
  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("investedTotalValue")
  private Double investedTotalValue = null;

  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("portfolioOwnerCq")
  private PortfolioOwnerCq portfolioOwnerCq = null;

  @JsonProperty("historicDetailsCollection")
  private List<BasicInfoPortfolioDetailsCq> historicDetailsCollection = new ArrayList<BasicInfoPortfolioDetailsCq>();

  @JsonProperty("currentDetails")
  private BasicInfoPortfolioDetailsCq currentDetails = null;


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

  public PortfolioIdCq getPortfolioIdCq() {
    return portfolioIdCq;
  }

  public void setPortfolioIdCq(PortfolioIdCq portfolioIdCq) {
    this.portfolioIdCq = portfolioIdCq;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public PortfolioOwnerCq getPortfolioOwnerCq() {
    return portfolioOwnerCq;
  }

  public void setPortfolioOwnerCq(PortfolioOwnerCq portfolioOwnerCq) {
    this.portfolioOwnerCq = portfolioOwnerCq;
  }
  public BasicInfoPortfolioCq addHistoricDetailsCollectionItem(BasicInfoPortfolioDetailsCq historicDetailsCollectionItem) {
    this.historicDetailsCollection.add(historicDetailsCollectionItem);
    return this;
  }

  public List<BasicInfoPortfolioDetailsCq> getHistoricDetailsCollection() {
    return historicDetailsCollection;
  }

  public void setHistoricDetailsCollection(List<BasicInfoPortfolioDetailsCq> historicDetailsCollection) {
    this.historicDetailsCollection = historicDetailsCollection;
  }

  public BasicInfoPortfolioDetailsCq getCurrentDetails() {
    return currentDetails;
  }

  public void setCurrentDetails(BasicInfoPortfolioDetailsCq currentDetails) {
    this.currentDetails = currentDetails;
  }
}

