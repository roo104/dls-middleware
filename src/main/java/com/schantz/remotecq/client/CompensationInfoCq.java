package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CompensationInfoCq implements Serializable {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("valueDate")
  private LocalDate valueDate = null;

  @JsonProperty("tradeIdCq")
  private TradeIdCq tradeIdCq = null;

  @JsonProperty("compensationIntermediateResultCqCollection")
  private List<CompensationIntermediateResultCq> compensationIntermediateResultCqCollection = new ArrayList<CompensationIntermediateResultCq>();

  @JsonProperty("portfolioIdCq")
  private PortfolioIdCq portfolioIdCq = null;

  @JsonProperty("portfolioUnitsCqCollection")
  private List<PortfolioUnitsCq> portfolioUnitsCqCollection = new ArrayList<PortfolioUnitsCq>();

  @JsonProperty("portfolioQuoteIdCq")
  private PortfolioIdCq portfolioQuoteIdCq = null;


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  public TradeIdCq getTradeIdCq() {
    return tradeIdCq;
  }

  public void setTradeIdCq(TradeIdCq tradeIdCq) {
    this.tradeIdCq = tradeIdCq;
  }
  public CompensationInfoCq addCompensationIntermediateResultCqCollectionItem(CompensationIntermediateResultCq compensationIntermediateResultCqCollectionItem) {
    this.compensationIntermediateResultCqCollection.add(compensationIntermediateResultCqCollectionItem);
    return this;
  }

  public List<CompensationIntermediateResultCq> getCompensationIntermediateResultCqCollection() {
    return compensationIntermediateResultCqCollection;
  }

  public void setCompensationIntermediateResultCqCollection(List<CompensationIntermediateResultCq> compensationIntermediateResultCqCollection) {
    this.compensationIntermediateResultCqCollection = compensationIntermediateResultCqCollection;
  }

  public PortfolioIdCq getPortfolioIdCq() {
    return portfolioIdCq;
  }

  public void setPortfolioIdCq(PortfolioIdCq portfolioIdCq) {
    this.portfolioIdCq = portfolioIdCq;
  }
  public CompensationInfoCq addPortfolioUnitsCqCollectionItem(PortfolioUnitsCq portfolioUnitsCqCollectionItem) {
    this.portfolioUnitsCqCollection.add(portfolioUnitsCqCollectionItem);
    return this;
  }

  public List<PortfolioUnitsCq> getPortfolioUnitsCqCollection() {
    return portfolioUnitsCqCollection;
  }

  public void setPortfolioUnitsCqCollection(List<PortfolioUnitsCq> portfolioUnitsCqCollection) {
    this.portfolioUnitsCqCollection = portfolioUnitsCqCollection;
  }

  public PortfolioIdCq getPortfolioQuoteIdCq() {
    return portfolioQuoteIdCq;
  }

  public void setPortfolioQuoteIdCq(PortfolioIdCq portfolioQuoteIdCq) {
    this.portfolioQuoteIdCq = portfolioQuoteIdCq;
  }
}

