package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionRuleDistributionCq implements Serializable {
  @JsonProperty("pct")
  private Double pct = null;

  @JsonProperty("commissionRoleTypeCq")
  private String commissionRoleTypeCq = null;


  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public String getCommissionRoleTypeCq() {
    return commissionRoleTypeCq;
  }

  public void setCommissionRoleTypeCq(String commissionRoleTypeCq) {
    this.commissionRoleTypeCq = commissionRoleTypeCq;
  }
}

