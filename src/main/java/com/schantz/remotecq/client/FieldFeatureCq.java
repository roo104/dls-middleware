package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class FieldFeatureCq implements Serializable {
  @JsonProperty("isConditionTrue")
  private Boolean isConditionTrue = false;


  public Boolean getIsConditionTrue() {
    return isConditionTrue;
  }

  public void setIsConditionTrue(Boolean isConditionTrue) {
    this.isConditionTrue = isConditionTrue;
  }
}

