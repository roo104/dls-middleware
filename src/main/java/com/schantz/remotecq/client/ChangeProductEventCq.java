package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeProductEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("changeProductEventDataCqCollection")
  private List<ChangeProductEventDataCq> changeProductEventDataCqCollection = new ArrayList<ChangeProductEventDataCq>();

  @JsonProperty("toProduct")
  private AgreementIdCq toProduct = null;

  @JsonProperty("fromProduct")
  private AgreementIdCq fromProduct = null;


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
  public ChangeProductEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }
  public ChangeProductEventCq addChangeProductEventDataCqCollectionItem(ChangeProductEventDataCq changeProductEventDataCqCollectionItem) {
    this.changeProductEventDataCqCollection.add(changeProductEventDataCqCollectionItem);
    return this;
  }

  public List<ChangeProductEventDataCq> getChangeProductEventDataCqCollection() {
    return changeProductEventDataCqCollection;
  }

  public void setChangeProductEventDataCqCollection(List<ChangeProductEventDataCq> changeProductEventDataCqCollection) {
    this.changeProductEventDataCqCollection = changeProductEventDataCqCollection;
  }

  public AgreementIdCq getToProduct() {
    return toProduct;
  }

  public void setToProduct(AgreementIdCq toProduct) {
    this.toProduct = toProduct;
  }

  public AgreementIdCq getFromProduct() {
    return fromProduct;
  }

  public void setFromProduct(AgreementIdCq fromProduct) {
    this.fromProduct = fromProduct;
  }
}

