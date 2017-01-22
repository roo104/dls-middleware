package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SurrenderAnnexSpecCq implements Serializable {
  @JsonProperty("surrenderAmount")
  private Double surrenderAmount = null;

  @JsonProperty("surrenderCharges")
  private Double surrenderCharges = null;

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;

  @JsonProperty("subTaxCodeCq")
  private String subTaxCodeCq = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;


  public Double getSurrenderAmount() {
    return surrenderAmount;
  }

  public void setSurrenderAmount(Double surrenderAmount) {
    this.surrenderAmount = surrenderAmount;
  }

  public Double getSurrenderCharges() {
    return surrenderCharges;
  }

  public void setSurrenderCharges(Double surrenderCharges) {
    this.surrenderCharges = surrenderCharges;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }

  public String getSubTaxCodeCq() {
    return subTaxCodeCq;
  }

  public void setSubTaxCodeCq(String subTaxCodeCq) {
    this.subTaxCodeCq = subTaxCodeCq;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }
}

