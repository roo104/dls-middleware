package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SurrenderEventPalCq implements Serializable {
  @JsonProperty("palTaxBase")
  private Double palTaxBase = null;

  @JsonProperty("pal")
  private Double pal = null;

  @JsonProperty("palFreeAmount")
  private Double palFreeAmount = null;


  public Double getPalTaxBase() {
    return palTaxBase;
  }

  public void setPalTaxBase(Double palTaxBase) {
    this.palTaxBase = palTaxBase;
  }

  public Double getPal() {
    return pal;
  }

  public void setPal(Double pal) {
    this.pal = pal;
  }

  public Double getPalFreeAmount() {
    return palFreeAmount;
  }

  public void setPalFreeAmount(Double palFreeAmount) {
    this.palFreeAmount = palFreeAmount;
  }
}

