package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RawPolicyEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("convertedPolicyDataCq")
  private ConvertedPolicyDataCq convertedPolicyDataCq = null;

  @JsonProperty("convertedCoverCollection")
  private List<ConvertedCoverCq> convertedCoverCollection = new ArrayList<ConvertedCoverCq>();

  @JsonProperty("convertedPackageCollection")
  private List<ConvertedPackageCq> convertedPackageCollection = new ArrayList<ConvertedPackageCq>();


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
  public RawPolicyEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }

  public ConvertedPolicyDataCq getConvertedPolicyDataCq() {
    return convertedPolicyDataCq;
  }

  public void setConvertedPolicyDataCq(ConvertedPolicyDataCq convertedPolicyDataCq) {
    this.convertedPolicyDataCq = convertedPolicyDataCq;
  }
  public RawPolicyEventCq addConvertedCoverCollectionItem(ConvertedCoverCq convertedCoverCollectionItem) {
    this.convertedCoverCollection.add(convertedCoverCollectionItem);
    return this;
  }

  public List<ConvertedCoverCq> getConvertedCoverCollection() {
    return convertedCoverCollection;
  }

  public void setConvertedCoverCollection(List<ConvertedCoverCq> convertedCoverCollection) {
    this.convertedCoverCollection = convertedCoverCollection;
  }
  public RawPolicyEventCq addConvertedPackageCollectionItem(ConvertedPackageCq convertedPackageCollectionItem) {
    this.convertedPackageCollection.add(convertedPackageCollectionItem);
    return this;
  }

  public List<ConvertedPackageCq> getConvertedPackageCollection() {
    return convertedPackageCollection;
  }

  public void setConvertedPackageCollection(List<ConvertedPackageCq> convertedPackageCollection) {
    this.convertedPackageCollection = convertedPackageCollection;
  }
}

