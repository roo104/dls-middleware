package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BasicInfoPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("originalStartDate")
  private LocalDate originalStartDate = null;

  @JsonProperty("quote")
  private Boolean quote = false;

  @JsonProperty("paidForLumpSum")
  private Double paidForLumpSum = null;

  @JsonProperty("paidForAnnuity")
  private Double paidForAnnuity = null;

  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("policyStateCq")
  private PolicyStateCq policyStateCq = null;

  @JsonProperty("lifePolicyStatusCq")
  private String lifePolicyStatusCq = null;

  @JsonProperty("lifeCoverStateCqCollection")
  private List<String> lifeCoverStateCqCollection = new ArrayList<String>();

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("lastEventTrans")
  private EventTransRefCq lastEventTrans = null;

  @JsonProperty("policyWarningTypeCqCollection")
  private List<String> policyWarningTypeCqCollection = new ArrayList<String>();

  @JsonProperty("companyIdCq")
  private CompanyIdCq companyIdCq = null;

  public BasicInfoPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getOriginalStartDate() {
    return originalStartDate;
  }

  public void setOriginalStartDate(LocalDate originalStartDate) {
    this.originalStartDate = originalStartDate;
  }

  public Boolean getQuote() {
    return quote;
  }

  public void setQuote(Boolean quote) {
    this.quote = quote;
  }

  public Double getPaidForLumpSum() {
    return paidForLumpSum;
  }

  public void setPaidForLumpSum(Double paidForLumpSum) {
    this.paidForLumpSum = paidForLumpSum;
  }

  public Double getPaidForAnnuity() {
    return paidForAnnuity;
  }

  public void setPaidForAnnuity(Double paidForAnnuity) {
    this.paidForAnnuity = paidForAnnuity;
  }

  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public PolicyStateCq getPolicyStateCq() {
    return policyStateCq;
  }

  public void setPolicyStateCq(PolicyStateCq policyStateCq) {
    this.policyStateCq = policyStateCq;
  }

  public String getLifePolicyStatusCq() {
    return lifePolicyStatusCq;
  }

  public void setLifePolicyStatusCq(String lifePolicyStatusCq) {
    this.lifePolicyStatusCq = lifePolicyStatusCq;
  }
  public BasicInfoPolicyQueryResult addLifeCoverStateCqCollectionItem(String lifeCoverStateCqCollectionItem) {
    this.lifeCoverStateCqCollection.add(lifeCoverStateCqCollectionItem);
    return this;
  }

  public List<String> getLifeCoverStateCqCollection() {
    return lifeCoverStateCqCollection;
  }

  public void setLifeCoverStateCqCollection(List<String> lifeCoverStateCqCollection) {
    this.lifeCoverStateCqCollection = lifeCoverStateCqCollection;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public EventTransRefCq getLastEventTrans() {
    return lastEventTrans;
  }

  public void setLastEventTrans(EventTransRefCq lastEventTrans) {
    this.lastEventTrans = lastEventTrans;
  }
  public BasicInfoPolicyQueryResult addPolicyWarningTypeCqCollectionItem(String policyWarningTypeCqCollectionItem) {
    this.policyWarningTypeCqCollection.add(policyWarningTypeCqCollectionItem);
    return this;
  }

  public List<String> getPolicyWarningTypeCqCollection() {
    return policyWarningTypeCqCollection;
  }

  public void setPolicyWarningTypeCqCollection(List<String> policyWarningTypeCqCollection) {
    this.policyWarningTypeCqCollection = policyWarningTypeCqCollection;
  }

  public CompanyIdCq getCompanyIdCq() {
    return companyIdCq;
  }

  public void setCompanyIdCq(CompanyIdCq companyIdCq) {
    this.companyIdCq = companyIdCq;
  }
}

