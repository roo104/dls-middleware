package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BenefitInformationEventSpecCq implements Serializable {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("share")
  private Double share = null;

  @JsonProperty("inheritanceTaxTypeCq")
  private String inheritanceTaxTypeCq = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("isShareActive")
  private Boolean isShareActive = false;

  @JsonProperty("isConvertToLumpSum")
  private Boolean isConvertToLumpSum = false;

  @JsonProperty("isInsuredIsReciver")
  private Boolean isInsuredIsReciver = false;


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Double getShare() {
    return share;
  }

  public void setShare(Double share) {
    this.share = share;
  }

  public String getInheritanceTaxTypeCq() {
    return inheritanceTaxTypeCq;
  }

  public void setInheritanceTaxTypeCq(String inheritanceTaxTypeCq) {
    this.inheritanceTaxTypeCq = inheritanceTaxTypeCq;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public Boolean getIsShareActive() {
    return isShareActive;
  }

  public void setIsShareActive(Boolean isShareActive) {
    this.isShareActive = isShareActive;
  }

  public Boolean getIsConvertToLumpSum() {
    return isConvertToLumpSum;
  }

  public void setIsConvertToLumpSum(Boolean isConvertToLumpSum) {
    this.isConvertToLumpSum = isConvertToLumpSum;
  }

  public Boolean getIsInsuredIsReciver() {
    return isInsuredIsReciver;
  }

  public void setIsInsuredIsReciver(Boolean isInsuredIsReciver) {
    this.isInsuredIsReciver = isInsuredIsReciver;
  }
}

