package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopMoveReserveSpecCq implements Serializable {
  @JsonProperty("pct")
  private Double pct = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("isUseOldTerms")
  private Boolean isUseOldTerms = false;

  @JsonProperty("isCloseCover")
  private Boolean isCloseCover = false;


  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Boolean getIsUseOldTerms() {
    return isUseOldTerms;
  }

  public void setIsUseOldTerms(Boolean isUseOldTerms) {
    this.isUseOldTerms = isUseOldTerms;
  }

  public Boolean getIsCloseCover() {
    return isCloseCover;
  }

  public void setIsCloseCover(Boolean isCloseCover) {
    this.isCloseCover = isCloseCover;
  }
}

