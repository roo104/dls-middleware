package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TestAdvancePoliciesCommand implements Serializable {
  @JsonProperty("newSystemTime")
  private OffsetDateTime newSystemTime = null;

  @JsonProperty("primaryChannelType")
  private String primaryChannelType = null;

  @JsonProperty("includeCollection")
  private List<PolicyIdCq> includeCollection = new ArrayList<PolicyIdCq>();

  @JsonProperty("excludeCollection")
  private List<PolicyIdCq> excludeCollection = new ArrayList<PolicyIdCq>();

  @JsonProperty("secondaryChannelType")
  private String secondaryChannelType = null;

  @JsonProperty("isCreateReceivables")
  private Boolean isCreateReceivables = false;

  @JsonProperty("isCalculateCommission")
  private Boolean isCalculateCommission = false;


  public OffsetDateTime getNewSystemTime() {
    return newSystemTime;
  }

  public void setNewSystemTime(OffsetDateTime newSystemTime) {
    this.newSystemTime = newSystemTime;
  }

  public String getPrimaryChannelType() {
    return primaryChannelType;
  }

  public void setPrimaryChannelType(String primaryChannelType) {
    this.primaryChannelType = primaryChannelType;
  }
  public TestAdvancePoliciesCommand addIncludeCollectionItem(PolicyIdCq includeCollectionItem) {
    this.includeCollection.add(includeCollectionItem);
    return this;
  }

  public List<PolicyIdCq> getIncludeCollection() {
    return includeCollection;
  }

  public void setIncludeCollection(List<PolicyIdCq> includeCollection) {
    this.includeCollection = includeCollection;
  }
  public TestAdvancePoliciesCommand addExcludeCollectionItem(PolicyIdCq excludeCollectionItem) {
    this.excludeCollection.add(excludeCollectionItem);
    return this;
  }

  public List<PolicyIdCq> getExcludeCollection() {
    return excludeCollection;
  }

  public void setExcludeCollection(List<PolicyIdCq> excludeCollection) {
    this.excludeCollection = excludeCollection;
  }

  public String getSecondaryChannelType() {
    return secondaryChannelType;
  }

  public void setSecondaryChannelType(String secondaryChannelType) {
    this.secondaryChannelType = secondaryChannelType;
  }

  public Boolean getIsCreateReceivables() {
    return isCreateReceivables;
  }

  public void setIsCreateReceivables(Boolean isCreateReceivables) {
    this.isCreateReceivables = isCreateReceivables;
  }

  public Boolean getIsCalculateCommission() {
    return isCalculateCommission;
  }

  public void setIsCalculateCommission(Boolean isCalculateCommission) {
    this.isCalculateCommission = isCalculateCommission;
  }
}

