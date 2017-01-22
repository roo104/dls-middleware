package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ManualPaymentEntryCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("companyRegistration")
  private String companyRegistration = null;

  @JsonProperty("personRegistration")
  private String personRegistration = null;

  @JsonProperty("personName")
  private String personName = null;

  @JsonProperty("period")
  private LocalDate period = null;

  @JsonProperty("paymentDate")
  private LocalDate paymentDate = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("employmentPct")
  private Double employmentPct = null;

  @JsonProperty("externalReference")
  private String externalReference = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("deliveryNumber")
  private String deliveryNumber = null;

  @JsonProperty("policyId")
  private String policyId = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("manualPaymentEntryIdCq")
  private ManualPaymentEntryIdCq manualPaymentEntryIdCq = null;

  @JsonProperty("matchingPersonId")
  private PersonIdCq matchingPersonId = null;

  @JsonProperty("matchingCompanyId")
  private CompanyIdCq matchingCompanyId = null;

  @JsonProperty("matchingPolicyId")
  private PolicyIdCq matchingPolicyId = null;


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public String getCompanyRegistration() {
    return companyRegistration;
  }

  public void setCompanyRegistration(String companyRegistration) {
    this.companyRegistration = companyRegistration;
  }

  public String getPersonRegistration() {
    return personRegistration;
  }

  public void setPersonRegistration(String personRegistration) {
    this.personRegistration = personRegistration;
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public LocalDate getPeriod() {
    return period;
  }

  public void setPeriod(LocalDate period) {
    this.period = period;
  }

  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Double getEmploymentPct() {
    return employmentPct;
  }

  public void setEmploymentPct(Double employmentPct) {
    this.employmentPct = employmentPct;
  }

  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getDeliveryNumber() {
    return deliveryNumber;
  }

  public void setDeliveryNumber(String deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
  }

  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ManualPaymentEntryIdCq getManualPaymentEntryIdCq() {
    return manualPaymentEntryIdCq;
  }

  public void setManualPaymentEntryIdCq(ManualPaymentEntryIdCq manualPaymentEntryIdCq) {
    this.manualPaymentEntryIdCq = manualPaymentEntryIdCq;
  }

  public PersonIdCq getMatchingPersonId() {
    return matchingPersonId;
  }

  public void setMatchingPersonId(PersonIdCq matchingPersonId) {
    this.matchingPersonId = matchingPersonId;
  }

  public CompanyIdCq getMatchingCompanyId() {
    return matchingCompanyId;
  }

  public void setMatchingCompanyId(CompanyIdCq matchingCompanyId) {
    this.matchingCompanyId = matchingCompanyId;
  }

  public PolicyIdCq getMatchingPolicyId() {
    return matchingPolicyId;
  }

  public void setMatchingPolicyId(PolicyIdCq matchingPolicyId) {
    this.matchingPolicyId = matchingPolicyId;
  }
}

