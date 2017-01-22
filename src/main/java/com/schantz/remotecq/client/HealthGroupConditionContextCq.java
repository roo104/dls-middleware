package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupConditionContextCq implements Serializable {
  @JsonProperty("conditionContextTypeEnumCq")
  private String conditionContextTypeEnumCq = null;


  public String getConditionContextTypeEnumCq() {
    return conditionContextTypeEnumCq;
  }

  public void setConditionContextTypeEnumCq(String conditionContextTypeEnumCq) {
    this.conditionContextTypeEnumCq = conditionContextTypeEnumCq;
  }
}

