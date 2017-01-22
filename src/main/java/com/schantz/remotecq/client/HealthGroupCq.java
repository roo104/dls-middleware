package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("healthGroupIdCq")
  private HealthGroupIdCq healthGroupIdCq = null;

  @JsonProperty("currentVersionHistoryCollection")
  private List<HealthGroupVersionInfoCq> currentVersionHistoryCollection = new ArrayList<HealthGroupVersionInfoCq>();

  @JsonProperty("lockedToCollection")
  private List<AgreementIdCq> lockedToCollection = new ArrayList<AgreementIdCq>();


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public HealthGroupIdCq getHealthGroupIdCq() {
    return healthGroupIdCq;
  }

  public void setHealthGroupIdCq(HealthGroupIdCq healthGroupIdCq) {
    this.healthGroupIdCq = healthGroupIdCq;
  }
  public HealthGroupCq addCurrentVersionHistoryCollectionItem(HealthGroupVersionInfoCq currentVersionHistoryCollectionItem) {
    this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
    return this;
  }

  public List<HealthGroupVersionInfoCq> getCurrentVersionHistoryCollection() {
    return currentVersionHistoryCollection;
  }

  public void setCurrentVersionHistoryCollection(List<HealthGroupVersionInfoCq> currentVersionHistoryCollection) {
    this.currentVersionHistoryCollection = currentVersionHistoryCollection;
  }
  public HealthGroupCq addLockedToCollectionItem(AgreementIdCq lockedToCollectionItem) {
    this.lockedToCollection.add(lockedToCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getLockedToCollection() {
    return lockedToCollection;
  }

  public void setLockedToCollection(List<AgreementIdCq> lockedToCollection) {
    this.lockedToCollection = lockedToCollection;
  }
}

