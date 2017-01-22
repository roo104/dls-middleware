package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopPersonCq implements Serializable {
  @JsonProperty("changeDate")
  private LocalDate changeDate = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("deathDate")
  private LocalDate deathDate = null;

  @JsonProperty("education")
  private String education = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("workNumber")
  private String workNumber = null;

  @JsonProperty("age")
  private AgeCq age = null;

  @JsonProperty("addressCollection")
  private List<AddressCq> addressCollection = new ArrayList<AddressCq>();

  @JsonProperty("primaryAddress")
  private AddressCq primaryAddress = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("name")
  private PersonNameCq name = null;

  @JsonProperty("defaultOutputChannelType")
  private String defaultOutputChannelType = null;

  @JsonProperty("cprStatusDate")
  private LocalDate cprStatusDate = null;

  @JsonProperty("maritalStatusDate")
  private LocalDate maritalStatusDate = null;

  @JsonProperty("cprStatus")
  private String cprStatus = null;

  @JsonProperty("cprInfo")
  private CprInfoCq cprInfo = null;

  @JsonProperty("maritalStatus")
  private String maritalStatus = null;

  @JsonProperty("propateCourt")
  private CompanyIdCq propateCourt = null;

  @JsonProperty("gtiInteressentNr")
  private String gtiInteressentNr = null;

  @JsonProperty("workPhoneNumber")
  private String workPhoneNumber = null;

  @JsonProperty("emailAddress2")
  private String emailAddress2 = null;

  @JsonProperty("localNumber")
  private String localNumber = null;

  @JsonProperty("taxObligation")
  private Boolean taxObligation = false;

  @JsonProperty("topRescueAttemptTypeCq")
  private String topRescueAttemptTypeCq = null;

  @JsonProperty("eboksSubscriptionCq")
  private EboksSubscriptionCq eboksSubscriptionCq = null;

  @JsonProperty("isFictitousCpr")
  private Boolean isFictitousCpr = false;


  public LocalDate getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(LocalDate changeDate) {
    this.changeDate = changeDate;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public LocalDate getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(LocalDate deathDate) {
    this.deathDate = deathDate;
  }

  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getWorkNumber() {
    return workNumber;
  }

  public void setWorkNumber(String workNumber) {
    this.workNumber = workNumber;
  }

  public AgeCq getAge() {
    return age;
  }

  public void setAge(AgeCq age) {
    this.age = age;
  }
  public TopPersonCq addAddressCollectionItem(AddressCq addressCollectionItem) {
    this.addressCollection.add(addressCollectionItem);
    return this;
  }

  public List<AddressCq> getAddressCollection() {
    return addressCollection;
  }

  public void setAddressCollection(List<AddressCq> addressCollection) {
    this.addressCollection = addressCollection;
  }

  public AddressCq getPrimaryAddress() {
    return primaryAddress;
  }

  public void setPrimaryAddress(AddressCq primaryAddress) {
    this.primaryAddress = primaryAddress;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public PersonNameCq getName() {
    return name;
  }

  public void setName(PersonNameCq name) {
    this.name = name;
  }

  public String getDefaultOutputChannelType() {
    return defaultOutputChannelType;
  }

  public void setDefaultOutputChannelType(String defaultOutputChannelType) {
    this.defaultOutputChannelType = defaultOutputChannelType;
  }

  public LocalDate getCprStatusDate() {
    return cprStatusDate;
  }

  public void setCprStatusDate(LocalDate cprStatusDate) {
    this.cprStatusDate = cprStatusDate;
  }

  public LocalDate getMaritalStatusDate() {
    return maritalStatusDate;
  }

  public void setMaritalStatusDate(LocalDate maritalStatusDate) {
    this.maritalStatusDate = maritalStatusDate;
  }

  public String getCprStatus() {
    return cprStatus;
  }

  public void setCprStatus(String cprStatus) {
    this.cprStatus = cprStatus;
  }

  public CprInfoCq getCprInfo() {
    return cprInfo;
  }

  public void setCprInfo(CprInfoCq cprInfo) {
    this.cprInfo = cprInfo;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public CompanyIdCq getPropateCourt() {
    return propateCourt;
  }

  public void setPropateCourt(CompanyIdCq propateCourt) {
    this.propateCourt = propateCourt;
  }

  public String getGtiInteressentNr() {
    return gtiInteressentNr;
  }

  public void setGtiInteressentNr(String gtiInteressentNr) {
    this.gtiInteressentNr = gtiInteressentNr;
  }

  public String getWorkPhoneNumber() {
    return workPhoneNumber;
  }

  public void setWorkPhoneNumber(String workPhoneNumber) {
    this.workPhoneNumber = workPhoneNumber;
  }

  public String getEmailAddress2() {
    return emailAddress2;
  }

  public void setEmailAddress2(String emailAddress2) {
    this.emailAddress2 = emailAddress2;
  }

  public String getLocalNumber() {
    return localNumber;
  }

  public void setLocalNumber(String localNumber) {
    this.localNumber = localNumber;
  }

  public Boolean getTaxObligation() {
    return taxObligation;
  }

  public void setTaxObligation(Boolean taxObligation) {
    this.taxObligation = taxObligation;
  }

  public String getTopRescueAttemptTypeCq() {
    return topRescueAttemptTypeCq;
  }

  public void setTopRescueAttemptTypeCq(String topRescueAttemptTypeCq) {
    this.topRescueAttemptTypeCq = topRescueAttemptTypeCq;
  }

  public EboksSubscriptionCq getEboksSubscriptionCq() {
    return eboksSubscriptionCq;
  }

  public void setEboksSubscriptionCq(EboksSubscriptionCq eboksSubscriptionCq) {
    this.eboksSubscriptionCq = eboksSubscriptionCq;
  }

  public Boolean getIsFictitousCpr() {
    return isFictitousCpr;
  }

  public void setIsFictitousCpr(Boolean isFictitousCpr) {
    this.isFictitousCpr = isFictitousCpr;
  }
}

