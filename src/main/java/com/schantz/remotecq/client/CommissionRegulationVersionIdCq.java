package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionRegulationVersionIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("baseId")
  private CommissionRegulationIdCq baseId = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public CommissionRegulationIdCq getBaseId() {
    return baseId;
  }

  public void setBaseId(CommissionRegulationIdCq baseId) {
    this.baseId = baseId;
  }
}

