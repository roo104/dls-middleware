package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class PersonRoleCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("legalPartyRoleId")
  private String legalPartyRoleId = null;

  @JsonProperty("legalPartyRolesCq")
  private String legalPartyRolesCq = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;

  @JsonProperty("coherentPersonRoleCq")
  private PersonRoleCq coherentPersonRoleCq = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getLegalPartyRoleId() {
    return legalPartyRoleId;
  }

  public void setLegalPartyRoleId(String legalPartyRoleId) {
    this.legalPartyRoleId = legalPartyRoleId;
  }

  public String getLegalPartyRolesCq() {
    return legalPartyRolesCq;
  }

  public void setLegalPartyRolesCq(String legalPartyRolesCq) {
    this.legalPartyRolesCq = legalPartyRolesCq;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }

  public PersonRoleCq getCoherentPersonRoleCq() {
    return coherentPersonRoleCq;
  }

  public void setCoherentPersonRoleCq(PersonRoleCq coherentPersonRoleCq) {
    this.coherentPersonRoleCq = coherentPersonRoleCq;
  }
}

