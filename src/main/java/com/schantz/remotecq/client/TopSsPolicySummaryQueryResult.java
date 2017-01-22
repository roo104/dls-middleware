package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPolicySummaryQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("originalStartDate")
  private LocalDate originalStartDate = null;

  @JsonProperty("pensionDate")
  private LocalDate pensionDate = null;

  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("premium")
  private Double premium = null;

  @JsonProperty("amb")
  private Double amb = null;

  @JsonProperty("premiumEndDate")
  private LocalDate premiumEndDate = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;

  @JsonProperty("agreement")
  private AgreementIdCq agreement = null;

  @JsonProperty("owner")
  private PersonIdCq owner = null;

  public TopSsPolicySummaryQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public LocalDate getOriginalStartDate() {
    return originalStartDate;
  }

  public void setOriginalStartDate(LocalDate originalStartDate) {
    this.originalStartDate = originalStartDate;
  }

  public LocalDate getPensionDate() {
    return pensionDate;
  }

  public void setPensionDate(LocalDate pensionDate) {
    this.pensionDate = pensionDate;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Double getPremium() {
    return premium;
  }

  public void setPremium(Double premium) {
    this.premium = premium;
  }

  public Double getAmb() {
    return amb;
  }

  public void setAmb(Double amb) {
    this.amb = amb;
  }

  public LocalDate getPremiumEndDate() {
    return premiumEndDate;
  }

  public void setPremiumEndDate(LocalDate premiumEndDate) {
    this.premiumEndDate = premiumEndDate;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }

  public AgreementIdCq getAgreement() {
    return agreement;
  }

  public void setAgreement(AgreementIdCq agreement) {
    this.agreement = agreement;
  }

  public PersonIdCq getOwner() {
    return owner;
  }

  public void setOwner(PersonIdCq owner) {
    this.owner = owner;
  }
}

