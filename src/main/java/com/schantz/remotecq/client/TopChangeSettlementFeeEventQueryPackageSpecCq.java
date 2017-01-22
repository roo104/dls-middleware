package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopChangeSettlementFeeEventQueryPackageSpecCq implements Serializable {
  @JsonProperty("settlementFee")
  private Double settlementFee = null;

  @JsonProperty("settlementFeeRate")
  private Double settlementFeeRate = null;

  @JsonProperty("settlementFeeOptionDate")
  private LocalDate settlementFeeOptionDate = null;

  @JsonProperty("settlementFeeOptionValue")
  private Double settlementFeeOptionValue = null;

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;

  @JsonProperty("settlementFeeOptionCq")
  private String settlementFeeOptionCq = null;


  public Double getSettlementFee() {
    return settlementFee;
  }

  public void setSettlementFee(Double settlementFee) {
    this.settlementFee = settlementFee;
  }

  public Double getSettlementFeeRate() {
    return settlementFeeRate;
  }

  public void setSettlementFeeRate(Double settlementFeeRate) {
    this.settlementFeeRate = settlementFeeRate;
  }

  public LocalDate getSettlementFeeOptionDate() {
    return settlementFeeOptionDate;
  }

  public void setSettlementFeeOptionDate(LocalDate settlementFeeOptionDate) {
    this.settlementFeeOptionDate = settlementFeeOptionDate;
  }

  public Double getSettlementFeeOptionValue() {
    return settlementFeeOptionValue;
  }

  public void setSettlementFeeOptionValue(Double settlementFeeOptionValue) {
    this.settlementFeeOptionValue = settlementFeeOptionValue;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }

  public String getSettlementFeeOptionCq() {
    return settlementFeeOptionCq;
  }

  public void setSettlementFeeOptionCq(String settlementFeeOptionCq) {
    this.settlementFeeOptionCq = settlementFeeOptionCq;
  }
}

