package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BonusSpecCq implements Serializable {
  @JsonProperty("groupPriority")
  private Long groupPriority = null;

  @JsonProperty("specifiedSourceGroup")
  private String specifiedSourceGroup = null;

  @JsonProperty("specifiedTargetGroup")
  private String specifiedTargetGroup = null;

  @JsonProperty("sourceGroupRule")
  private String sourceGroupRule = null;

  @JsonProperty("preDistributionRule")
  private String preDistributionRule = null;

  @JsonProperty("negativeBonusRule")
  private String negativeBonusRule = null;

  @JsonProperty("distributionRule")
  private String distributionRule = null;


  public Long getGroupPriority() {
    return groupPriority;
  }

  public void setGroupPriority(Long groupPriority) {
    this.groupPriority = groupPriority;
  }

  public String getSpecifiedSourceGroup() {
    return specifiedSourceGroup;
  }

  public void setSpecifiedSourceGroup(String specifiedSourceGroup) {
    this.specifiedSourceGroup = specifiedSourceGroup;
  }

  public String getSpecifiedTargetGroup() {
    return specifiedTargetGroup;
  }

  public void setSpecifiedTargetGroup(String specifiedTargetGroup) {
    this.specifiedTargetGroup = specifiedTargetGroup;
  }

  public String getSourceGroupRule() {
    return sourceGroupRule;
  }

  public void setSourceGroupRule(String sourceGroupRule) {
    this.sourceGroupRule = sourceGroupRule;
  }

  public String getPreDistributionRule() {
    return preDistributionRule;
  }

  public void setPreDistributionRule(String preDistributionRule) {
    this.preDistributionRule = preDistributionRule;
  }

  public String getNegativeBonusRule() {
    return negativeBonusRule;
  }

  public void setNegativeBonusRule(String negativeBonusRule) {
    this.negativeBonusRule = negativeBonusRule;
  }

  public String getDistributionRule() {
    return distributionRule;
  }

  public void setDistributionRule(String distributionRule) {
    this.distributionRule = distributionRule;
  }
}

