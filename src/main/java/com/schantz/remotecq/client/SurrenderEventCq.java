package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class SurrenderEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("surrenderCharge")
  private Double surrenderCharge = null;

  @JsonProperty("surrenderEventTypeCq")
  private String surrenderEventTypeCq = null;

  @JsonProperty("surrenderEventDataCqCollection")
  private List<SurrenderEventDataCq> surrenderEventDataCqCollection = new ArrayList<SurrenderEventDataCq>();

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;


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
  public SurrenderEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }

  public Double getSurrenderCharge() {
    return surrenderCharge;
  }

  public void setSurrenderCharge(Double surrenderCharge) {
    this.surrenderCharge = surrenderCharge;
  }

  public String getSurrenderEventTypeCq() {
    return surrenderEventTypeCq;
  }

  public void setSurrenderEventTypeCq(String surrenderEventTypeCq) {
    this.surrenderEventTypeCq = surrenderEventTypeCq;
  }
  public SurrenderEventCq addSurrenderEventDataCqCollectionItem(SurrenderEventDataCq surrenderEventDataCqCollectionItem) {
    this.surrenderEventDataCqCollection.add(surrenderEventDataCqCollectionItem);
    return this;
  }

  public List<SurrenderEventDataCq> getSurrenderEventDataCqCollection() {
    return surrenderEventDataCqCollection;
  }

  public void setSurrenderEventDataCqCollection(List<SurrenderEventDataCq> surrenderEventDataCqCollection) {
    this.surrenderEventDataCqCollection = surrenderEventDataCqCollection;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }
}

