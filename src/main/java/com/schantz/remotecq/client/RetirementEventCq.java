package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RetirementEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("coverRetirementSpecCqCollection")
  private List<CoverRetirementSpecCq> coverRetirementSpecCqCollection = new ArrayList<CoverRetirementSpecCq>();


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
  public RetirementEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }
  public RetirementEventCq addCoverRetirementSpecCqCollectionItem(CoverRetirementSpecCq coverRetirementSpecCqCollectionItem) {
    this.coverRetirementSpecCqCollection.add(coverRetirementSpecCqCollectionItem);
    return this;
  }

  public List<CoverRetirementSpecCq> getCoverRetirementSpecCqCollection() {
    return coverRetirementSpecCqCollection;
  }

  public void setCoverRetirementSpecCqCollection(List<CoverRetirementSpecCq> coverRetirementSpecCqCollection) {
    this.coverRetirementSpecCqCollection = coverRetirementSpecCqCollection;
  }
}

