package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AddCommissionRuleCommand implements Serializable {
  @JsonProperty("commissionTypeCq")
  private String commissionTypeCq = null;

  @JsonProperty("draftId")
  private CommissionRegulationVersionIdCq draftId = null;


  public String getCommissionTypeCq() {
    return commissionTypeCq;
  }

  public void setCommissionTypeCq(String commissionTypeCq) {
    this.commissionTypeCq = commissionTypeCq;
  }

  public CommissionRegulationVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(CommissionRegulationVersionIdCq draftId) {
    this.draftId = draftId;
  }
}

