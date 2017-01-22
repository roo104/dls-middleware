package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementCostEntryIdCq implements Serializable {
  @JsonProperty("costUid")
  private String costUid = null;

  @JsonProperty("stepId")
  private String stepId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("scopeId")
  private ScopeIdCq scopeId = null;

  @JsonProperty("boundType")
  private String boundType = null;

  @JsonProperty("categoryType")
  private String categoryType = null;

  @JsonProperty("fixedType")
  private String fixedType = null;


  public String getCostUid() {
    return costUid;
  }

  public void setCostUid(String costUid) {
    this.costUid = costUid;
  }

  public String getStepId() {
    return stepId;
  }

  public void setStepId(String stepId) {
    this.stepId = stepId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScopeIdCq getScopeId() {
    return scopeId;
  }

  public void setScopeId(ScopeIdCq scopeId) {
    this.scopeId = scopeId;
  }

  public String getBoundType() {
    return boundType;
  }

  public void setBoundType(String boundType) {
    this.boundType = boundType;
  }

  public String getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }

  public String getFixedType() {
    return fixedType;
  }

  public void setFixedType(String fixedType) {
    this.fixedType = fixedType;
  }
}

