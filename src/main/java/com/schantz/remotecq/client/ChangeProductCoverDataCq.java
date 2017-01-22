package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeProductCoverDataCq implements Serializable {
  @JsonProperty("toCover")
  private PolicyCoverIdCq toCover = null;

  @JsonProperty("fromCover")
  private PolicyCoverIdCq fromCover = null;

  @JsonProperty("reserveFromCover")
  private PolicyCoverIdCq reserveFromCover = null;


  public PolicyCoverIdCq getToCover() {
    return toCover;
  }

  public void setToCover(PolicyCoverIdCq toCover) {
    this.toCover = toCover;
  }

  public PolicyCoverIdCq getFromCover() {
    return fromCover;
  }

  public void setFromCover(PolicyCoverIdCq fromCover) {
    this.fromCover = fromCover;
  }

  public PolicyCoverIdCq getReserveFromCover() {
    return reserveFromCover;
  }

  public void setReserveFromCover(PolicyCoverIdCq reserveFromCover) {
    this.reserveFromCover = reserveFromCover;
  }
}

