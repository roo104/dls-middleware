package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusGroupCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("riskBonusGroupNameCq")
  private String riskBonusGroupNameCq = null;

  @JsonProperty("yearlyStatementCqCollection")
  private List<YearlyStatementCq> yearlyStatementCqCollection = new ArrayList<YearlyStatementCq>();

  @JsonProperty("riskBonusGroupIdCq")
  private RiskBonusGroupIdCq riskBonusGroupIdCq = null;

  @JsonProperty("currentVersionHistoryCollection")
  private List<RiskBonusGroupVersionInfoCq> currentVersionHistoryCollection = new ArrayList<RiskBonusGroupVersionInfoCq>();

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

  public String getRiskBonusGroupNameCq() {
    return riskBonusGroupNameCq;
  }

  public void setRiskBonusGroupNameCq(String riskBonusGroupNameCq) {
    this.riskBonusGroupNameCq = riskBonusGroupNameCq;
  }
  public RiskBonusGroupCq addYearlyStatementCqCollectionItem(YearlyStatementCq yearlyStatementCqCollectionItem) {
    this.yearlyStatementCqCollection.add(yearlyStatementCqCollectionItem);
    return this;
  }

  public List<YearlyStatementCq> getYearlyStatementCqCollection() {
    return yearlyStatementCqCollection;
  }

  public void setYearlyStatementCqCollection(List<YearlyStatementCq> yearlyStatementCqCollection) {
    this.yearlyStatementCqCollection = yearlyStatementCqCollection;
  }

  public RiskBonusGroupIdCq getRiskBonusGroupIdCq() {
    return riskBonusGroupIdCq;
  }

  public void setRiskBonusGroupIdCq(RiskBonusGroupIdCq riskBonusGroupIdCq) {
    this.riskBonusGroupIdCq = riskBonusGroupIdCq;
  }
  public RiskBonusGroupCq addCurrentVersionHistoryCollectionItem(RiskBonusGroupVersionInfoCq currentVersionHistoryCollectionItem) {
    this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
    return this;
  }

  public List<RiskBonusGroupVersionInfoCq> getCurrentVersionHistoryCollection() {
    return currentVersionHistoryCollection;
  }

  public void setCurrentVersionHistoryCollection(List<RiskBonusGroupVersionInfoCq> currentVersionHistoryCollection) {
    this.currentVersionHistoryCollection = currentVersionHistoryCollection;
  }
  public RiskBonusGroupCq addLockedToCollectionItem(AgreementIdCq lockedToCollectionItem) {
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

