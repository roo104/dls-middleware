package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementRuleIdCq implements Serializable {
  @JsonProperty("ruleUid")
  private String ruleUid = null;


  public String getRuleUid() {
    return ruleUid;
  }

  public void setRuleUid(String ruleUid) {
    this.ruleUid = ruleUid;
  }
}

