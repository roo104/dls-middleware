package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BenefitReceiverChangeInfoEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("lifeCoverBenefitReceiverInfoCqCollection")
  private List<LifeCoverBenefitReceiverInfoCq> lifeCoverBenefitReceiverInfoCqCollection = new ArrayList<LifeCoverBenefitReceiverInfoCq>();


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
  public BenefitReceiverChangeInfoEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }
  public BenefitReceiverChangeInfoEventCq addLifeCoverBenefitReceiverInfoCqCollectionItem(LifeCoverBenefitReceiverInfoCq lifeCoverBenefitReceiverInfoCqCollectionItem) {
    this.lifeCoverBenefitReceiverInfoCqCollection.add(lifeCoverBenefitReceiverInfoCqCollectionItem);
    return this;
  }

  public List<LifeCoverBenefitReceiverInfoCq> getLifeCoverBenefitReceiverInfoCqCollection() {
    return lifeCoverBenefitReceiverInfoCqCollection;
  }

  public void setLifeCoverBenefitReceiverInfoCqCollection(List<LifeCoverBenefitReceiverInfoCq> lifeCoverBenefitReceiverInfoCqCollection) {
    this.lifeCoverBenefitReceiverInfoCqCollection = lifeCoverBenefitReceiverInfoCqCollection;
  }
}

