package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CompanyPolicyEntry implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("lifePolicyStatusCq")
  private String lifePolicyStatusCq = null;

  @JsonProperty("lifeCoverStateCqCollection")
  private List<String> lifeCoverStateCqCollection = new ArrayList<String>();

  @JsonProperty("legalPartyRolesCq")
  private String legalPartyRolesCq = null;

  @JsonProperty("insuredPerson")
  private PersonIdCq insuredPerson = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public String getLifePolicyStatusCq() {
    return lifePolicyStatusCq;
  }

  public void setLifePolicyStatusCq(String lifePolicyStatusCq) {
    this.lifePolicyStatusCq = lifePolicyStatusCq;
  }
  public CompanyPolicyEntry addLifeCoverStateCqCollectionItem(String lifeCoverStateCqCollectionItem) {
    this.lifeCoverStateCqCollection.add(lifeCoverStateCqCollectionItem);
    return this;
  }

  public List<String> getLifeCoverStateCqCollection() {
    return lifeCoverStateCqCollection;
  }

  public void setLifeCoverStateCqCollection(List<String> lifeCoverStateCqCollection) {
    this.lifeCoverStateCqCollection = lifeCoverStateCqCollection;
  }

  public String getLegalPartyRolesCq() {
    return legalPartyRolesCq;
  }

  public void setLegalPartyRolesCq(String legalPartyRolesCq) {
    this.legalPartyRolesCq = legalPartyRolesCq;
  }

  public PersonIdCq getInsuredPerson() {
    return insuredPerson;
  }

  public void setInsuredPerson(PersonIdCq insuredPerson) {
    this.insuredPerson = insuredPerson;
  }
}

