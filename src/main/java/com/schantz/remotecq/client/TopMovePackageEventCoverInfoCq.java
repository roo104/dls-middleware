package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopMovePackageEventCoverInfoCq implements Serializable {
  @JsonProperty("reserveBefore")
  private Double reserveBefore = null;

  @JsonProperty("reserveAfter")
  private Double reserveAfter = null;

  @JsonProperty("reserveDiff")
  private Double reserveDiff = null;

  @JsonProperty("baseform")
  private String baseform = null;

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;


  public Double getReserveBefore() {
    return reserveBefore;
  }

  public void setReserveBefore(Double reserveBefore) {
    this.reserveBefore = reserveBefore;
  }

  public Double getReserveAfter() {
    return reserveAfter;
  }

  public void setReserveAfter(Double reserveAfter) {
    this.reserveAfter = reserveAfter;
  }

  public Double getReserveDiff() {
    return reserveDiff;
  }

  public void setReserveDiff(Double reserveDiff) {
    this.reserveDiff = reserveDiff;
  }

  public String getBaseform() {
    return baseform;
  }

  public void setBaseform(String baseform) {
    this.baseform = baseform;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }
}

