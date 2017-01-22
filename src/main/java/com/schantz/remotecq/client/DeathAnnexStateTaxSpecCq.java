package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DeathAnnexStateTaxSpecCq implements Serializable {
  @JsonProperty("pct")
  private Double pct = null;

  @JsonProperty("taxable")
  private Double taxable = null;

  @JsonProperty("tax")
  private Double tax = null;


  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public Double getTaxable() {
    return taxable;
  }

  public void setTaxable(Double taxable) {
    this.taxable = taxable;
  }

  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }
}

