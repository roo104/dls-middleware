package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeContributionEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("nextBillingDate")
  private LocalDate nextBillingDate = null;

  @JsonProperty("changeContributionEventContributionFrameCollection")
  private List<ChangeContributionEventContributionFrame> changeContributionEventContributionFrameCollection = new ArrayList<ChangeContributionEventContributionFrame>();

  @JsonProperty("periodLengthCq")
  private String periodLengthCq = null;

  @JsonProperty("changeContributionEventDataCqCollection")
  private List<ChangeContributionEventDataCq> changeContributionEventDataCqCollection = new ArrayList<ChangeContributionEventDataCq>();

  @JsonProperty("primaryBillingMonth")
  private String primaryBillingMonth = null;


  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public String getLifeEventIdCq() {
    return lifeEventIdCq;
  }

  public void setLifeEventIdCq(String lifeEventIdCq) {
    this.lifeEventIdCq = lifeEventIdCq;
  }

  public EventInclusionIdCq getInclusionId() {
    return inclusionId;
  }

  public void setInclusionId(EventInclusionIdCq inclusionId) {
    this.inclusionId = inclusionId;
  }
  public ChangeContributionEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }

  public LocalDate getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(LocalDate nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }
  public ChangeContributionEventCq addChangeContributionEventContributionFrameCollectionItem(ChangeContributionEventContributionFrame changeContributionEventContributionFrameCollectionItem) {
    this.changeContributionEventContributionFrameCollection.add(changeContributionEventContributionFrameCollectionItem);
    return this;
  }

  public List<ChangeContributionEventContributionFrame> getChangeContributionEventContributionFrameCollection() {
    return changeContributionEventContributionFrameCollection;
  }

  public void setChangeContributionEventContributionFrameCollection(List<ChangeContributionEventContributionFrame> changeContributionEventContributionFrameCollection) {
    this.changeContributionEventContributionFrameCollection = changeContributionEventContributionFrameCollection;
  }

  public String getPeriodLengthCq() {
    return periodLengthCq;
  }

  public void setPeriodLengthCq(String periodLengthCq) {
    this.periodLengthCq = periodLengthCq;
  }
  public ChangeContributionEventCq addChangeContributionEventDataCqCollectionItem(ChangeContributionEventDataCq changeContributionEventDataCqCollectionItem) {
    this.changeContributionEventDataCqCollection.add(changeContributionEventDataCqCollectionItem);
    return this;
  }

  public List<ChangeContributionEventDataCq> getChangeContributionEventDataCqCollection() {
    return changeContributionEventDataCqCollection;
  }

  public void setChangeContributionEventDataCqCollection(List<ChangeContributionEventDataCq> changeContributionEventDataCqCollection) {
    this.changeContributionEventDataCqCollection = changeContributionEventDataCqCollection;
  }

  public String getPrimaryBillingMonth() {
    return primaryBillingMonth;
  }

  public void setPrimaryBillingMonth(String primaryBillingMonth) {
    this.primaryBillingMonth = primaryBillingMonth;
  }
}

