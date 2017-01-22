package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupValidationMessageCq implements Serializable {
  @JsonProperty("validationMessage")
  private CqMessageKey validationMessage = null;

  @JsonProperty("healthGroupRuleIdCq")
  private HealthGroupRuleIdCq healthGroupRuleIdCq = null;

  @JsonProperty("isBlocksActivation")
  private Boolean isBlocksActivation = false;


  public CqMessageKey getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(CqMessageKey validationMessage) {
    this.validationMessage = validationMessage;
  }

  public HealthGroupRuleIdCq getHealthGroupRuleIdCq() {
    return healthGroupRuleIdCq;
  }

  public void setHealthGroupRuleIdCq(HealthGroupRuleIdCq healthGroupRuleIdCq) {
    this.healthGroupRuleIdCq = healthGroupRuleIdCq;
  }

  public Boolean getIsBlocksActivation() {
    return isBlocksActivation;
  }

  public void setIsBlocksActivation(Boolean isBlocksActivation) {
    this.isBlocksActivation = isBlocksActivation;
  }
}

