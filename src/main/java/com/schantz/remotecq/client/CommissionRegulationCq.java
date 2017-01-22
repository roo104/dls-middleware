package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionRegulationCq implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("commissionRegulationIdCq")
  private CommissionRegulationIdCq commissionRegulationIdCq = null;

  @JsonProperty("name")
  private EntityNameCq name = null;

  @JsonProperty("currentVersionHistoryCollection")
  private List<CommissionRegulationVersionInfoCq> currentVersionHistoryCollection = new ArrayList<CommissionRegulationVersionInfoCq>();

  @JsonProperty("isCancelled")
  private Boolean isCancelled = false;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommissionRegulationIdCq getCommissionRegulationIdCq() {
    return commissionRegulationIdCq;
  }

  public void setCommissionRegulationIdCq(CommissionRegulationIdCq commissionRegulationIdCq) {
    this.commissionRegulationIdCq = commissionRegulationIdCq;
  }

  public EntityNameCq getName() {
    return name;
  }

  public void setName(EntityNameCq name) {
    this.name = name;
  }
  public CommissionRegulationCq addCurrentVersionHistoryCollectionItem(CommissionRegulationVersionInfoCq currentVersionHistoryCollectionItem) {
    this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
    return this;
  }

  public List<CommissionRegulationVersionInfoCq> getCurrentVersionHistoryCollection() {
    return currentVersionHistoryCollection;
  }

  public void setCurrentVersionHistoryCollection(List<CommissionRegulationVersionInfoCq> currentVersionHistoryCollection) {
    this.currentVersionHistoryCollection = currentVersionHistoryCollection;
  }

  public Boolean getIsCancelled() {
    return isCancelled;
  }

  public void setIsCancelled(Boolean isCancelled) {
    this.isCancelled = isCancelled;
  }
}

