package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopSaveCompanyCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("organisationName")
  private String organisationName = null;

  @JsonProperty("registrationNumber")
  private String registrationNumber = null;

  @JsonProperty("primaryPhone")
  private String primaryPhone = null;

  @JsonProperty("primaryEmail")
  private String primaryEmail = null;

  @JsonProperty("primaryAddress")
  private AddressCq primaryAddress = null;

  @JsonProperty("companyTypeCq")
  private String companyTypeCq = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;

  @JsonProperty("defaultOutputChannelType")
  private String defaultOutputChannelType = null;

  @JsonProperty("gtiInteressentNr")
  private String gtiInteressentNr = null;

  @JsonProperty("email2")
  private String email2 = null;

  @JsonProperty("workPhone")
  private String workPhone = null;

  @JsonProperty("mobilePhone")
  private String mobilePhone = null;

  @JsonProperty("localNumber")
  private String localNumber = null;

  @JsonProperty("isSubscribeToEboks")
  private Boolean isSubscribeToEboks = false;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getOrganisationName() {
    return organisationName;
  }

  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
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

  public String getGtiInteressentNr() {
    return gtiInteressentNr;
  }

  public void setGtiInteressentNr(String gtiInteressentNr) {
    this.gtiInteressentNr = gtiInteressentNr;
  }

  public String getEmail2() {
    return email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getLocalNumber() {
    return localNumber;
  }

  public void setLocalNumber(String localNumber) {
    this.localNumber = localNumber;
  }

  public Boolean getIsSubscribeToEboks() {
    return isSubscribeToEboks;
  }

  public void setIsSubscribeToEboks(Boolean isSubscribeToEboks) {
    this.isSubscribeToEboks = isSubscribeToEboks;
  }
}

