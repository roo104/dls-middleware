package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SurrenderEventDataCq implements Serializable {
  @JsonProperty("surrenderPct")
  private Double surrenderPct = null;

  @JsonProperty("amountBeforeCharges")
  private Double amountBeforeCharges = null;

  @JsonProperty("totalAmountBeforeCharges")
  private Double totalAmountBeforeCharges = null;

  @JsonProperty("surrenderCharge")
  private Double surrenderCharge = null;

  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;

  @JsonProperty("subTaxCodeCq")
  private String subTaxCodeCq = null;

  @JsonProperty("isToSurrender")
  private Boolean isToSurrender = false;


  public Double getSurrenderPct() {
    return surrenderPct;
  }

  public void setSurrenderPct(Double surrenderPct) {
    this.surrenderPct = surrenderPct;
  }

  public Double getAmountBeforeCharges() {
    return amountBeforeCharges;
  }

  public void setAmountBeforeCharges(Double amountBeforeCharges) {
    this.amountBeforeCharges = amountBeforeCharges;
  }

  public Double getTotalAmountBeforeCharges() {
    return totalAmountBeforeCharges;
  }

  public void setTotalAmountBeforeCharges(Double totalAmountBeforeCharges) {
    this.totalAmountBeforeCharges = totalAmountBeforeCharges;
  }

  public Double getSurrenderCharge() {
    return surrenderCharge;
  }

  public void setSurrenderCharge(Double surrenderCharge) {
    this.surrenderCharge = surrenderCharge;
  }

  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }

  public String getSubTaxCodeCq() {
    return subTaxCodeCq;
  }

  public void setSubTaxCodeCq(String subTaxCodeCq) {
    this.subTaxCodeCq = subTaxCodeCq;
  }

  public Boolean getIsToSurrender() {
    return isToSurrender;
  }

  public void setIsToSurrender(Boolean isToSurrender) {
    this.isToSurrender = isToSurrender;
  }
}

