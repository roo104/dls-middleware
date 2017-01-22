package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ContributerShareCq implements Serializable {
  @JsonProperty("share")
  private Double share = null;

  @JsonProperty("contributerTypeCq")
  private String contributerTypeCq = null;


  public Double getShare() {
    return share;
  }

  public void setShare(Double share) {
    this.share = share;
  }

  public String getContributerTypeCq() {
    return contributerTypeCq;
  }

  public void setContributerTypeCq(String contributerTypeCq) {
    this.contributerTypeCq = contributerTypeCq;
  }
}

