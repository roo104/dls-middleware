package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeReserveEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("changeReserveEventDataCqCollection")
  private List<ChangeReserveEventDataCq> changeReserveEventDataCqCollection = new ArrayList<ChangeReserveEventDataCq>();


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
  public ChangeReserveEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }
  public ChangeReserveEventCq addChangeReserveEventDataCqCollectionItem(ChangeReserveEventDataCq changeReserveEventDataCqCollectionItem) {
    this.changeReserveEventDataCqCollection.add(changeReserveEventDataCqCollectionItem);
    return this;
  }

  public List<ChangeReserveEventDataCq> getChangeReserveEventDataCqCollection() {
    return changeReserveEventDataCqCollection;
  }

  public void setChangeReserveEventDataCqCollection(List<ChangeReserveEventDataCq> changeReserveEventDataCqCollection) {
    this.changeReserveEventDataCqCollection = changeReserveEventDataCqCollection;
  }
}

