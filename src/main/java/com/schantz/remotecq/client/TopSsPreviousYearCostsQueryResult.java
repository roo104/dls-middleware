package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPreviousYearCostsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("yearlyCostsDKK")
  private Double yearlyCostsDKK = null;

  @JsonProperty("yearlyCostsPercent")
  private Double yearlyCostsPercent = null;

  @JsonProperty("directInvestmentCosts")
  private Double directInvestmentCosts = null;

  @JsonProperty("indirectInvestmentCosts")
  private Double indirectInvestmentCosts = null;

  @JsonProperty("directAdministrationCosts")
  private Double directAdministrationCosts = null;

  @JsonProperty("indirectAdministrationCosts")
  private Double indirectAdministrationCosts = null;

  @JsonProperty("yield")
  private Double yield = null;

  public TopSsPreviousYearCostsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Double getYearlyCostsDKK() {
    return yearlyCostsDKK;
  }

  public void setYearlyCostsDKK(Double yearlyCostsDKK) {
    this.yearlyCostsDKK = yearlyCostsDKK;
  }

  public Double getYearlyCostsPercent() {
    return yearlyCostsPercent;
  }

  public void setYearlyCostsPercent(Double yearlyCostsPercent) {
    this.yearlyCostsPercent = yearlyCostsPercent;
  }

  public Double getDirectInvestmentCosts() {
    return directInvestmentCosts;
  }

  public void setDirectInvestmentCosts(Double directInvestmentCosts) {
    this.directInvestmentCosts = directInvestmentCosts;
  }

  public Double getIndirectInvestmentCosts() {
    return indirectInvestmentCosts;
  }

  public void setIndirectInvestmentCosts(Double indirectInvestmentCosts) {
    this.indirectInvestmentCosts = indirectInvestmentCosts;
  }

  public Double getDirectAdministrationCosts() {
    return directAdministrationCosts;
  }

  public void setDirectAdministrationCosts(Double directAdministrationCosts) {
    this.directAdministrationCosts = directAdministrationCosts;
  }

  public Double getIndirectAdministrationCosts() {
    return indirectAdministrationCosts;
  }

  public void setIndirectAdministrationCosts(Double indirectAdministrationCosts) {
    this.indirectAdministrationCosts = indirectAdministrationCosts;
  }

  public Double getYield() {
    return yield;
  }

  public void setYield(Double yield) {
    this.yield = yield;
  }
}

