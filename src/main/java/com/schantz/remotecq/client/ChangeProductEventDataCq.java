package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeProductEventDataCq implements Serializable {
  @JsonProperty("fromCover")
  private PolicyCoverIdCq fromCover = null;

  @JsonProperty("toCover")
  private AgreementCoverVariantIdCq toCover = null;

  @JsonProperty("reserveToCover")
  private AgreementCoverVariantIdCq reserveToCover = null;


  public PolicyCoverIdCq getFromCover() {
    return fromCover;
  }

  public void setFromCover(PolicyCoverIdCq fromCover) {
    this.fromCover = fromCover;
  }

  public AgreementCoverVariantIdCq getToCover() {
    return toCover;
  }

  public void setToCover(AgreementCoverVariantIdCq toCover) {
    this.toCover = toCover;
  }

  public AgreementCoverVariantIdCq getReserveToCover() {
    return reserveToCover;
  }

  public void setReserveToCover(AgreementCoverVariantIdCq reserveToCover) {
    this.reserveToCover = reserveToCover;
  }
}

