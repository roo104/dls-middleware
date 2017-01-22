package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HealthEvaluationNeededEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("healthEvaluationNeededEntryCqCollection")
  private List<HealthEvaluationNeededEntryCq> healthEvaluationNeededEntryCqCollection = new ArrayList<HealthEvaluationNeededEntryCq>();


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
  public HealthEvaluationNeededEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }
  public HealthEvaluationNeededEventCq addHealthEvaluationNeededEntryCqCollectionItem(HealthEvaluationNeededEntryCq healthEvaluationNeededEntryCqCollectionItem) {
    this.healthEvaluationNeededEntryCqCollection.add(healthEvaluationNeededEntryCqCollectionItem);
    return this;
  }

  public List<HealthEvaluationNeededEntryCq> getHealthEvaluationNeededEntryCqCollection() {
    return healthEvaluationNeededEntryCqCollection;
  }

  public void setHealthEvaluationNeededEntryCqCollection(List<HealthEvaluationNeededEntryCq> healthEvaluationNeededEntryCqCollection) {
    this.healthEvaluationNeededEntryCqCollection = healthEvaluationNeededEntryCqCollection;
  }
}

