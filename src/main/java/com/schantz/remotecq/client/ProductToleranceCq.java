package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ProductToleranceCq implements Serializable {
  @JsonProperty("negativeTolerance")
  private Double negativeTolerance = null;

  @JsonProperty("positiveTolerance")
  private Double positiveTolerance = null;

  @JsonProperty("negativeTolerancePct")
  private Double negativeTolerancePct = null;

  @JsonProperty("positiveTolerancePct")
  private Double positiveTolerancePct = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;


  public Double getNegativeTolerance() {
    return negativeTolerance;
  }

  public void setNegativeTolerance(Double negativeTolerance) {
    this.negativeTolerance = negativeTolerance;
  }

  public Double getPositiveTolerance() {
    return positiveTolerance;
  }

  public void setPositiveTolerance(Double positiveTolerance) {
    this.positiveTolerance = positiveTolerance;
  }

  public Double getNegativeTolerancePct() {
    return negativeTolerancePct;
  }

  public void setNegativeTolerancePct(Double negativeTolerancePct) {
    this.negativeTolerancePct = negativeTolerancePct;
  }

  public Double getPositiveTolerancePct() {
    return positiveTolerancePct;
  }

  public void setPositiveTolerancePct(Double positiveTolerancePct) {
    this.positiveTolerancePct = positiveTolerancePct;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }
}

