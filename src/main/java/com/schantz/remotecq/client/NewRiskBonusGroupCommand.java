package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NewRiskBonusGroupCommand implements Serializable {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("riskBonusGroupSpecCq")
  private RiskBonusGroupSpecCq riskBonusGroupSpecCq = null;

  @JsonProperty("lifeCoverTypeCqCollection")
  private List<LifeCoverTypeCq> lifeCoverTypeCqCollection = new ArrayList<LifeCoverTypeCq>();

  @JsonProperty("isCreateAsCancelledDraft")
  private Boolean isCreateAsCancelledDraft = false;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVersionNote() {
    return versionNote;
  }

  public void setVersionNote(String versionNote) {
    this.versionNote = versionNote;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public RiskBonusGroupSpecCq getRiskBonusGroupSpecCq() {
    return riskBonusGroupSpecCq;
  }

  public void setRiskBonusGroupSpecCq(RiskBonusGroupSpecCq riskBonusGroupSpecCq) {
    this.riskBonusGroupSpecCq = riskBonusGroupSpecCq;
  }
  public NewRiskBonusGroupCommand addLifeCoverTypeCqCollectionItem(LifeCoverTypeCq lifeCoverTypeCqCollectionItem) {
    this.lifeCoverTypeCqCollection.add(lifeCoverTypeCqCollectionItem);
    return this;
  }

  public List<LifeCoverTypeCq> getLifeCoverTypeCqCollection() {
    return lifeCoverTypeCqCollection;
  }

  public void setLifeCoverTypeCqCollection(List<LifeCoverTypeCq> lifeCoverTypeCqCollection) {
    this.lifeCoverTypeCqCollection = lifeCoverTypeCqCollection;
  }

  public Boolean getIsCreateAsCancelledDraft() {
    return isCreateAsCancelledDraft;
  }

  public void setIsCreateAsCancelledDraft(Boolean isCreateAsCancelledDraft) {
    this.isCreateAsCancelledDraft = isCreateAsCancelledDraft;
  }
}

