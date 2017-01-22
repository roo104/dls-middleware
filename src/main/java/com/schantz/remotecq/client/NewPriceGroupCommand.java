package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NewPriceGroupCommand implements Serializable {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("lockedToAgreementCollection")
  private List<AgreementIdCq> lockedToAgreementCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("priceGroupRenewalCycleEntryCqCollection")
  private List<PriceGroupRenewalCycleEntryCq> priceGroupRenewalCycleEntryCqCollection = new ArrayList<PriceGroupRenewalCycleEntryCq>();

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
  public NewPriceGroupCommand addLockedToAgreementCollectionItem(AgreementIdCq lockedToAgreementCollectionItem) {
    this.lockedToAgreementCollection.add(lockedToAgreementCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getLockedToAgreementCollection() {
    return lockedToAgreementCollection;
  }

  public void setLockedToAgreementCollection(List<AgreementIdCq> lockedToAgreementCollection) {
    this.lockedToAgreementCollection = lockedToAgreementCollection;
  }
  public NewPriceGroupCommand addPriceGroupRenewalCycleEntryCqCollectionItem(PriceGroupRenewalCycleEntryCq priceGroupRenewalCycleEntryCqCollectionItem) {
    this.priceGroupRenewalCycleEntryCqCollection.add(priceGroupRenewalCycleEntryCqCollectionItem);
    return this;
  }

  public List<PriceGroupRenewalCycleEntryCq> getPriceGroupRenewalCycleEntryCqCollection() {
    return priceGroupRenewalCycleEntryCqCollection;
  }

  public void setPriceGroupRenewalCycleEntryCqCollection(List<PriceGroupRenewalCycleEntryCq> priceGroupRenewalCycleEntryCqCollection) {
    this.priceGroupRenewalCycleEntryCqCollection = priceGroupRenewalCycleEntryCqCollection;
  }

  public Boolean getIsCreateAsCancelledDraft() {
    return isCreateAsCancelledDraft;
  }

  public void setIsCreateAsCancelledDraft(Boolean isCreateAsCancelledDraft) {
    this.isCreateAsCancelledDraft = isCreateAsCancelledDraft;
  }
}

