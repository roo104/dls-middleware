package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeRebalancingFrequencyPolicyQuoteCommand implements Serializable {
  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;

  @JsonProperty("switchDate")
  private LocalDate switchDate = null;

  @JsonProperty("coverId")
  private PolicyCoverIdCq coverId = null;

  @JsonProperty("packageId")
  private PolicyPackageIdCq packageId = null;

  @JsonProperty("periodLengthCq")
  private String periodLengthCq = null;

  @JsonProperty("isDoRebalance")
  private Boolean isDoRebalance = false;


  public QuoteIdCq getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteIdCq quoteId) {
    this.quoteId = quoteId;
  }

  public LocalDate getSwitchDate() {
    return switchDate;
  }

  public void setSwitchDate(LocalDate switchDate) {
    this.switchDate = switchDate;
  }

  public PolicyCoverIdCq getCoverId() {
    return coverId;
  }

  public void setCoverId(PolicyCoverIdCq coverId) {
    this.coverId = coverId;
  }

  public PolicyPackageIdCq getPackageId() {
    return packageId;
  }

  public void setPackageId(PolicyPackageIdCq packageId) {
    this.packageId = packageId;
  }

  public String getPeriodLengthCq() {
    return periodLengthCq;
  }

  public void setPeriodLengthCq(String periodLengthCq) {
    this.periodLengthCq = periodLengthCq;
  }

  public Boolean getIsDoRebalance() {
    return isDoRebalance;
  }

  public void setIsDoRebalance(Boolean isDoRebalance) {
    this.isDoRebalance = isDoRebalance;
  }
}

