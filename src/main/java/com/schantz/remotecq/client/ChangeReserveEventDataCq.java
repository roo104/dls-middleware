package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeReserveEventDataCq implements Serializable {
  @JsonProperty("firstOrderAmount")
  private Double firstOrderAmount = null;

  @JsonProperty("secondOrderAmount")
  private Double secondOrderAmount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("reserveItemTypeCq")
  private String reserveItemTypeCq = null;

  @JsonProperty("calcFoundationId")
  private CalcFoundationIdCq calcFoundationId = null;

  @JsonProperty("coverId")
  private PolicyCoverIdCq coverId = null;


  public Double getFirstOrderAmount() {
    return firstOrderAmount;
  }

  public void setFirstOrderAmount(Double firstOrderAmount) {
    this.firstOrderAmount = firstOrderAmount;
  }

  public Double getSecondOrderAmount() {
    return secondOrderAmount;
  }

  public void setSecondOrderAmount(Double secondOrderAmount) {
    this.secondOrderAmount = secondOrderAmount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getReserveItemTypeCq() {
    return reserveItemTypeCq;
  }

  public void setReserveItemTypeCq(String reserveItemTypeCq) {
    this.reserveItemTypeCq = reserveItemTypeCq;
  }

  public CalcFoundationIdCq getCalcFoundationId() {
    return calcFoundationId;
  }

  public void setCalcFoundationId(CalcFoundationIdCq calcFoundationId) {
    this.calcFoundationId = calcFoundationId;
  }

  public PolicyCoverIdCq getCoverId() {
    return coverId;
  }

  public void setCoverId(PolicyCoverIdCq coverId) {
    this.coverId = coverId;
  }
}

