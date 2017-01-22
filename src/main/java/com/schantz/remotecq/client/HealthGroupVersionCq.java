package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HealthGroupVersionCq implements Serializable {
  @JsonProperty("minNoOfEmployees")
  private Long minNoOfEmployees = null;

  @JsonProperty("maxNoOfEmployees")
  private Long maxNoOfEmployees = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("terminationDate")
  private LocalDate terminationDate = null;

  @JsonProperty("healthGroupValidationMessageCqCollection")
  private List<HealthGroupValidationMessageCq> healthGroupValidationMessageCqCollection = new ArrayList<HealthGroupValidationMessageCq>();

  @JsonProperty("healthGroupRuleCqCollection")
  private List<HealthGroupRuleCq> healthGroupRuleCqCollection = new ArrayList<HealthGroupRuleCq>();

  @JsonProperty("healthGroupVersionIdCq")
  private HealthGroupVersionIdCq healthGroupVersionIdCq = null;

  @JsonProperty("healthGroupCq")
  private HealthGroupCq healthGroupCq = null;

  @JsonProperty("healthGroupVersionInfoCq")
  private HealthGroupVersionInfoCq healthGroupVersionInfoCq = null;


  public Long getMinNoOfEmployees() {
    return minNoOfEmployees;
  }

  public void setMinNoOfEmployees(Long minNoOfEmployees) {
    this.minNoOfEmployees = minNoOfEmployees;
  }

  public Long getMaxNoOfEmployees() {
    return maxNoOfEmployees;
  }

  public void setMaxNoOfEmployees(Long maxNoOfEmployees) {
    this.maxNoOfEmployees = maxNoOfEmployees;
  }

  public String getVersionNote() {
    return versionNote;
  }

  public void setVersionNote(String versionNote) {
    this.versionNote = versionNote;
  }

  public LocalDate getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(LocalDate terminationDate) {
    this.terminationDate = terminationDate;
  }
  public HealthGroupVersionCq addHealthGroupValidationMessageCqCollectionItem(HealthGroupValidationMessageCq healthGroupValidationMessageCqCollectionItem) {
    this.healthGroupValidationMessageCqCollection.add(healthGroupValidationMessageCqCollectionItem);
    return this;
  }

  public List<HealthGroupValidationMessageCq> getHealthGroupValidationMessageCqCollection() {
    return healthGroupValidationMessageCqCollection;
  }

  public void setHealthGroupValidationMessageCqCollection(List<HealthGroupValidationMessageCq> healthGroupValidationMessageCqCollection) {
    this.healthGroupValidationMessageCqCollection = healthGroupValidationMessageCqCollection;
  }
  public HealthGroupVersionCq addHealthGroupRuleCqCollectionItem(HealthGroupRuleCq healthGroupRuleCqCollectionItem) {
    this.healthGroupRuleCqCollection.add(healthGroupRuleCqCollectionItem);
    return this;
  }

  public List<HealthGroupRuleCq> getHealthGroupRuleCqCollection() {
    return healthGroupRuleCqCollection;
  }

  public void setHealthGroupRuleCqCollection(List<HealthGroupRuleCq> healthGroupRuleCqCollection) {
    this.healthGroupRuleCqCollection = healthGroupRuleCqCollection;
  }

  public HealthGroupVersionIdCq getHealthGroupVersionIdCq() {
    return healthGroupVersionIdCq;
  }

  public void setHealthGroupVersionIdCq(HealthGroupVersionIdCq healthGroupVersionIdCq) {
    this.healthGroupVersionIdCq = healthGroupVersionIdCq;
  }

  public HealthGroupCq getHealthGroupCq() {
    return healthGroupCq;
  }

  public void setHealthGroupCq(HealthGroupCq healthGroupCq) {
    this.healthGroupCq = healthGroupCq;
  }

  public HealthGroupVersionInfoCq getHealthGroupVersionInfoCq() {
    return healthGroupVersionInfoCq;
  }

  public void setHealthGroupVersionInfoCq(HealthGroupVersionInfoCq healthGroupVersionInfoCq) {
    this.healthGroupVersionInfoCq = healthGroupVersionInfoCq;
  }
}

