package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopDetailsCompanyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("primaryPhone")
  private String primaryPhone = null;

  @JsonProperty("primaryEmail")
  private String primaryEmail = null;

  @JsonProperty("primaryAddress")
  private AddressCq primaryAddress = null;

  @JsonProperty("companyTypeCq")
  private String companyTypeCq = null;

  @JsonProperty("agreementIdCollection")
  private List<AgreementIdCq> agreementIdCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;

  @JsonProperty("defaultOutputChannelType")
  private String defaultOutputChannelType = null;

  @JsonProperty("workPhone")
  private String workPhone = null;

  @JsonProperty("email2")
  private String email2 = null;

  @JsonProperty("localNumber")
  private String localNumber = null;

  @JsonProperty("mobilPhone")
  private String mobilPhone = null;

  @JsonProperty("headcount")
  private Long headcount = null;

  @JsonProperty("activePoliciesCount")
  private Long activePoliciesCount = null;

  @JsonProperty("eboksSubscriptionCq")
  private EboksSubscriptionCq eboksSubscriptionCq = null;

  @JsonProperty("companyContactCollection")
  private List<TopCompanyContactCq> companyContactCollection = new ArrayList<TopCompanyContactCq>();

  public TopDetailsCompanyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public String getPrimaryPhone() {
    return primaryPhone;
  }

  public void setPrimaryPhone(String primaryPhone) {
    this.primaryPhone = primaryPhone;
  }

  public String getPrimaryEmail() {
    return primaryEmail;
  }

  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  public AddressCq getPrimaryAddress() {
    return primaryAddress;
  }

  public void setPrimaryAddress(AddressCq primaryAddress) {
    this.primaryAddress = primaryAddress;
  }

  public String getCompanyTypeCq() {
    return companyTypeCq;
  }

  public void setCompanyTypeCq(String companyTypeCq) {
    this.companyTypeCq = companyTypeCq;
  }
  public TopDetailsCompanyQueryResult addAgreementIdCollectionItem(AgreementIdCq agreementIdCollectionItem) {
    this.agreementIdCollection.add(agreementIdCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getAgreementIdCollection() {
    return agreementIdCollection;
  }

  public void setAgreementIdCollection(List<AgreementIdCq> agreementIdCollection) {
    this.agreementIdCollection = agreementIdCollection;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }

  public String getDefaultOutputChannelType() {
    return defaultOutputChannelType;
  }

  public void setDefaultOutputChannelType(String defaultOutputChannelType) {
    this.defaultOutputChannelType = defaultOutputChannelType;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getEmail2() {
    return email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }

  public String getLocalNumber() {
    return localNumber;
  }

  public void setLocalNumber(String localNumber) {
    this.localNumber = localNumber;
  }

  public String getMobilPhone() {
    return mobilPhone;
  }

  public void setMobilPhone(String mobilPhone) {
    this.mobilPhone = mobilPhone;
  }

  public Long getHeadcount() {
    return headcount;
  }

  public void setHeadcount(Long headcount) {
    this.headcount = headcount;
  }

  public Long getActivePoliciesCount() {
    return activePoliciesCount;
  }

  public void setActivePoliciesCount(Long activePoliciesCount) {
    this.activePoliciesCount = activePoliciesCount;
  }

  public EboksSubscriptionCq getEboksSubscriptionCq() {
    return eboksSubscriptionCq;
  }

  public void setEboksSubscriptionCq(EboksSubscriptionCq eboksSubscriptionCq) {
    this.eboksSubscriptionCq = eboksSubscriptionCq;
  }
  public TopDetailsCompanyQueryResult addCompanyContactCollectionItem(TopCompanyContactCq companyContactCollectionItem) {
    this.companyContactCollection.add(companyContactCollectionItem);
    return this;
  }

  public List<TopCompanyContactCq> getCompanyContactCollection() {
    return companyContactCollection;
  }

  public void setCompanyContactCollection(List<TopCompanyContactCq> companyContactCollection) {
    this.companyContactCollection = companyContactCollection;
  }
}

