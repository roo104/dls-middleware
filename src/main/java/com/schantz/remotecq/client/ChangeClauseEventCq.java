package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeClauseEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("clauseEntryCqCollection")
  private List<ClauseEntryCq> clauseEntryCqCollection = new ArrayList<ClauseEntryCq>();


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
  public ChangeClauseEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }
  public ChangeClauseEventCq addClauseEntryCqCollectionItem(ClauseEntryCq clauseEntryCqCollectionItem) {
    this.clauseEntryCqCollection.add(clauseEntryCqCollectionItem);
    return this;
  }

  public List<ClauseEntryCq> getClauseEntryCqCollection() {
    return clauseEntryCqCollection;
  }

  public void setClauseEntryCqCollection(List<ClauseEntryCq> clauseEntryCqCollection) {
    this.clauseEntryCqCollection = clauseEntryCqCollection;
  }
}

