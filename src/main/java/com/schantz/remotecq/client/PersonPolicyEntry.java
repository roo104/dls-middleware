package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PersonPolicyEntry implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("legalPartyRolesCq")
  private String legalPartyRolesCq = null;

  @JsonProperty("lifePolicyStatusCq")
  private String lifePolicyStatusCq = null;

  @JsonProperty("lifeCoverStateCqCollection")
  private List<String> lifeCoverStateCqCollection = new ArrayList<String>();


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

  public String getLegalPartyRolesCq() {
    return legalPartyRolesCq;
  }

  public void setLegalPartyRolesCq(String legalPartyRolesCq) {
    this.legalPartyRolesCq = legalPartyRolesCq;
  }

  public String getLifePolicyStatusCq() {
    return lifePolicyStatusCq;
  }

  public void setLifePolicyStatusCq(String lifePolicyStatusCq) {
    this.lifePolicyStatusCq = lifePolicyStatusCq;
  }
  public PersonPolicyEntry addLifeCoverStateCqCollectionItem(String lifeCoverStateCqCollectionItem) {
    this.lifeCoverStateCqCollection.add(lifeCoverStateCqCollectionItem);
    return this;
  }

  public List<String> getLifeCoverStateCqCollection() {
    return lifeCoverStateCqCollection;
  }

  public void setLifeCoverStateCqCollection(List<String> lifeCoverStateCqCollection) {
    this.lifeCoverStateCqCollection = lifeCoverStateCqCollection;
  }
}

