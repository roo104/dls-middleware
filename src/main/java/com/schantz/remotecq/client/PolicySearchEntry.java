package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicySearchEntry implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("advanceDate")
  private LocalDate advanceDate = null;

  @JsonProperty("owner")
  private LegalPartyIdCq owner = null;

  @JsonProperty("lifeCoverStateCqCollection")
  private List<String> lifeCoverStateCqCollection = new ArrayList<String>();

  @JsonProperty("lifePolicyStatusCq")
  private String lifePolicyStatusCq = null;

  @JsonProperty("insuredPerson")
  private PersonIdCq insuredPerson = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("policyStateCq")
  private PolicyStateCq policyStateCq = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getAdvanceDate() {
    return advanceDate;
  }

  public void setAdvanceDate(LocalDate advanceDate) {
    this.advanceDate = advanceDate;
  }

  public LegalPartyIdCq getOwner() {
    return owner;
  }

  public void setOwner(LegalPartyIdCq owner) {
    this.owner = owner;
  }
  public PolicySearchEntry addLifeCoverStateCqCollectionItem(String lifeCoverStateCqCollectionItem) {
    this.lifeCoverStateCqCollection.add(lifeCoverStateCqCollectionItem);
    return this;
  }

  public List<String> getLifeCoverStateCqCollection() {
    return lifeCoverStateCqCollection;
  }

  public void setLifeCoverStateCqCollection(List<String> lifeCoverStateCqCollection) {
    this.lifeCoverStateCqCollection = lifeCoverStateCqCollection;
  }

  public String getLifePolicyStatusCq() {
    return lifePolicyStatusCq;
  }

  public void setLifePolicyStatusCq(String lifePolicyStatusCq) {
    this.lifePolicyStatusCq = lifePolicyStatusCq;
  }

  public PersonIdCq getInsuredPerson() {
    return insuredPerson;
  }

  public void setInsuredPerson(PersonIdCq insuredPerson) {
    this.insuredPerson = insuredPerson;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public PolicyStateCq getPolicyStateCq() {
    return policyStateCq;
  }

  public void setPolicyStateCq(PolicyStateCq policyStateCq) {
    this.policyStateCq = policyStateCq;
  }
}

