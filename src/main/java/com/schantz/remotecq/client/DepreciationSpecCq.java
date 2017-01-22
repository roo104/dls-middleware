package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DepreciationSpecCq implements Serializable {
  @JsonProperty("pct")
  private Double pct = null;

  @JsonProperty("depreciationMethodCq")
  private String depreciationMethodCq = null;


  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public String getDepreciationMethodCq() {
    return depreciationMethodCq;
  }

  public void setDepreciationMethodCq(String depreciationMethodCq) {
    this.depreciationMethodCq = depreciationMethodCq;
  }
}

