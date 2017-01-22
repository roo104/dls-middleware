package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ContributerParameterCq implements Serializable {
  @JsonProperty("contributionAbs")
  private Double contributionAbs = null;

  @JsonProperty("contributionPct")
  private Double contributionPct = null;

  @JsonProperty("isPct")
  private Boolean isPct = false;


  public Double getContributionAbs() {
    return contributionAbs;
  }

  public void setContributionAbs(Double contributionAbs) {
    this.contributionAbs = contributionAbs;
  }

  public Double getContributionPct() {
    return contributionPct;
  }

  public void setContributionPct(Double contributionPct) {
    this.contributionPct = contributionPct;
  }

  public Boolean getIsPct() {
    return isPct;
  }

  public void setIsPct(Boolean isPct) {
    this.isPct = isPct;
  }
}

