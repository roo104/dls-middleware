package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NewHealthGroupCommand implements Serializable {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("minNoOfEmployees")
  private Long minNoOfEmployees = null;

  @JsonProperty("maxNoOfEmployees")
  private Long maxNoOfEmployees = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("lockedToAgreementsCollection")
  private List<AgreementIdCq> lockedToAgreementsCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("isCreateAsCancelledDraft")
  private Boolean isCreateAsCancelledDraft = false;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Long getMinNoOfEmployees() {
    return minNoOfEmployees;
  }

  public void setMinNoOfEmployees(Long minNoOfEmployees) {
    this.minNoOfEmployees = minNoOfEmployees;
  }

  public Long getMaxNoOfEmployees() {
    return maxNoOfEmployees;
  }

  public void setMaxNoOfEmployees(Long maxNoOfEmployees) {
    this.maxNoOfEmployees = maxNoOfEmployees;
  }

  public String getVersionNote() {
    return versionNote;
  }

  public void setVersionNote(String versionNote) {
    this.versionNote = versionNote;
  }
  public NewHealthGroupCommand addLockedToAgreementsCollectionItem(AgreementIdCq lockedToAgreementsCollectionItem) {
    this.lockedToAgreementsCollection.add(lockedToAgreementsCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getLockedToAgreementsCollection() {
    return lockedToAgreementsCollection;
  }

  public void setLockedToAgreementsCollection(List<AgreementIdCq> lockedToAgreementsCollection) {
    this.lockedToAgreementsCollection = lockedToAgreementsCollection;
  }

  public Boolean getIsCreateAsCancelledDraft() {
    return isCreateAsCancelledDraft;
  }

  public void setIsCreateAsCancelledDraft(Boolean isCreateAsCancelledDraft) {
    this.isCreateAsCancelledDraft = isCreateAsCancelledDraft;
  }
}

