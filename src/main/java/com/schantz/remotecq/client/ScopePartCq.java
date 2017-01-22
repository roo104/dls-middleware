package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ScopePartCq implements Serializable {
  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("isDefaultOption")
  private Boolean isDefaultOption = false;


  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public Boolean getIsDefaultOption() {
    return isDefaultOption;
  }

  public void setIsDefaultOption(Boolean isDefaultOption) {
    this.isDefaultOption = isDefaultOption;
  }
}

