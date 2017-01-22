package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeBeneficiaryEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("changeBeneficiaryEventSpecCqCollection")
  private List<ChangeBeneficiaryEventSpecCq> changeBeneficiaryEventSpecCqCollection = new ArrayList<ChangeBeneficiaryEventSpecCq>();


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
  public ChangeBeneficiaryEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }
  public ChangeBeneficiaryEventCq addChangeBeneficiaryEventSpecCqCollectionItem(ChangeBeneficiaryEventSpecCq changeBeneficiaryEventSpecCqCollectionItem) {
    this.changeBeneficiaryEventSpecCqCollection.add(changeBeneficiaryEventSpecCqCollectionItem);
    return this;
  }

  public List<ChangeBeneficiaryEventSpecCq> getChangeBeneficiaryEventSpecCqCollection() {
    return changeBeneficiaryEventSpecCqCollection;
  }

  public void setChangeBeneficiaryEventSpecCqCollection(List<ChangeBeneficiaryEventSpecCq> changeBeneficiaryEventSpecCqCollection) {
    this.changeBeneficiaryEventSpecCqCollection = changeBeneficiaryEventSpecCqCollection;
  }
}

