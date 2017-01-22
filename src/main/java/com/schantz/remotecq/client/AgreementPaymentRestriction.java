package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementPaymentRestriction implements Serializable {
  @JsonProperty("amountMinLimit")
  private Double amountMinLimit = null;

  @JsonProperty("amountMaxLimit")
  private Double amountMaxLimit = null;

  @JsonProperty("restrictionName")
  private EntityNameCq restrictionName = null;


  public Double getAmountMinLimit() {
    return amountMinLimit;
  }

  public void setAmountMinLimit(Double amountMinLimit) {
    this.amountMinLimit = amountMinLimit;
  }

  public Double getAmountMaxLimit() {
    return amountMaxLimit;
  }

  public void setAmountMaxLimit(Double amountMaxLimit) {
    this.amountMaxLimit = amountMaxLimit;
  }

  public EntityNameCq getRestrictionName() {
    return restrictionName;
  }

  public void setRestrictionName(EntityNameCq restrictionName) {
    this.restrictionName = restrictionName;
  }
}

