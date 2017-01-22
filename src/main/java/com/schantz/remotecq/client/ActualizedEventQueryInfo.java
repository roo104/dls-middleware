package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ActualizedEventQueryInfo implements Serializable {
  @JsonProperty("benefit")
  private Double benefit = null;

  @JsonProperty("baseForm")
  private String baseForm = null;

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;

  @JsonProperty("benefitTypeCq")
  private String benefitTypeCq = null;


  public Double getBenefit() {
    return benefit;
  }

  public void setBenefit(Double benefit) {
    this.benefit = benefit;
  }

  public String getBaseForm() {
    return baseForm;
  }

  public void setBaseForm(String baseForm) {
    this.baseForm = baseForm;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }

  public String getBenefitTypeCq() {
    return benefitTypeCq;
  }

  public void setBenefitTypeCq(String benefitTypeCq) {
    this.benefitTypeCq = benefitTypeCq;
  }
}

