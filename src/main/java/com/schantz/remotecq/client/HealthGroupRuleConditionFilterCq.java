package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupRuleConditionFilterCq implements Serializable {
  @JsonProperty("fromNoOfPeriods")
  private Long fromNoOfPeriods = null;

  @JsonProperty("toNoOfPeriods")
  private Long toNoOfPeriods = null;

  @JsonProperty("periodLengthCq")
  private String periodLengthCq = null;

  @JsonProperty("healthGroupRuleConditionFilterTypeCq")
  private String healthGroupRuleConditionFilterTypeCq = null;


  public Long getFromNoOfPeriods() {
    return fromNoOfPeriods;
  }

  public void setFromNoOfPeriods(Long fromNoOfPeriods) {
    this.fromNoOfPeriods = fromNoOfPeriods;
  }

  public Long getToNoOfPeriods() {
    return toNoOfPeriods;
  }

  public void setToNoOfPeriods(Long toNoOfPeriods) {
    this.toNoOfPeriods = toNoOfPeriods;
  }

  public String getPeriodLengthCq() {
    return periodLengthCq;
  }

  public void setPeriodLengthCq(String periodLengthCq) {
    this.periodLengthCq = periodLengthCq;
  }

  public String getHealthGroupRuleConditionFilterTypeCq() {
    return healthGroupRuleConditionFilterTypeCq;
  }

  public void setHealthGroupRuleConditionFilterTypeCq(String healthGroupRuleConditionFilterTypeCq) {
    this.healthGroupRuleConditionFilterTypeCq = healthGroupRuleConditionFilterTypeCq;
  }
}

