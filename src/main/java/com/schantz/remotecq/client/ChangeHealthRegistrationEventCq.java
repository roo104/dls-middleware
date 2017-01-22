package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeHealthRegistrationEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("healthRegistrationId")
  private HealthRegistrationIdCq healthRegistrationId = null;

  @JsonProperty("updateCoversWithHealthCq")
  private String updateCoversWithHealthCq = null;


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
  public ChangeHealthRegistrationEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }

  public HealthRegistrationIdCq getHealthRegistrationId() {
    return healthRegistrationId;
  }

  public void setHealthRegistrationId(HealthRegistrationIdCq healthRegistrationId) {
    this.healthRegistrationId = healthRegistrationId;
  }

  public String getUpdateCoversWithHealthCq() {
    return updateCoversWithHealthCq;
  }

  public void setUpdateCoversWithHealthCq(String updateCoversWithHealthCq) {
    this.updateCoversWithHealthCq = updateCoversWithHealthCq;
  }
}

