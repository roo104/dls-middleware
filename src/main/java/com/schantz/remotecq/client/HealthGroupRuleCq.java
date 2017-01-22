package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupRuleCq implements Serializable {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("healthEvaluationRuleCheckCq")
  private String healthEvaluationRuleCheckCq = null;

  @JsonProperty("healthGroupRuleConditionCq")
  private HealthGroupRuleConditionCq healthGroupRuleConditionCq = null;

  @JsonProperty("healthGroupConditionContextCq")
  private HealthGroupConditionContextCq healthGroupConditionContextCq = null;

  @JsonProperty("healthGroupRuleConsequenceCq")
  private HealthGroupRuleConsequenceCq healthGroupRuleConsequenceCq = null;

  @JsonProperty("healthGroupRuleIdCq")
  private HealthGroupRuleIdCq healthGroupRuleIdCq = null;


  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getHealthEvaluationRuleCheckCq() {
    return healthEvaluationRuleCheckCq;
  }

  public void setHealthEvaluationRuleCheckCq(String healthEvaluationRuleCheckCq) {
    this.healthEvaluationRuleCheckCq = healthEvaluationRuleCheckCq;
  }

  public HealthGroupRuleConditionCq getHealthGroupRuleConditionCq() {
    return healthGroupRuleConditionCq;
  }

  public void setHealthGroupRuleConditionCq(HealthGroupRuleConditionCq healthGroupRuleConditionCq) {
    this.healthGroupRuleConditionCq = healthGroupRuleConditionCq;
  }

  public HealthGroupConditionContextCq getHealthGroupConditionContextCq() {
    return healthGroupConditionContextCq;
  }

  public void setHealthGroupConditionContextCq(HealthGroupConditionContextCq healthGroupConditionContextCq) {
    this.healthGroupConditionContextCq = healthGroupConditionContextCq;
  }

  public HealthGroupRuleConsequenceCq getHealthGroupRuleConsequenceCq() {
    return healthGroupRuleConsequenceCq;
  }

  public void setHealthGroupRuleConsequenceCq(HealthGroupRuleConsequenceCq healthGroupRuleConsequenceCq) {
    this.healthGroupRuleConsequenceCq = healthGroupRuleConsequenceCq;
  }

  public HealthGroupRuleIdCq getHealthGroupRuleIdCq() {
    return healthGroupRuleIdCq;
  }

  public void setHealthGroupRuleIdCq(HealthGroupRuleIdCq healthGroupRuleIdCq) {
    this.healthGroupRuleIdCq = healthGroupRuleIdCq;
  }
}

