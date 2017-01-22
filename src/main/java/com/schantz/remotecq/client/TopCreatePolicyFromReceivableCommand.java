package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreatePolicyFromReceivableCommand implements Serializable {
  @JsonProperty("personRegistration")
  private String personRegistration = null;

  @JsonProperty("policyStartDate")
  private LocalDate policyStartDate = null;

  @JsonProperty("policyPremium")
  private Double policyPremium = null;

  @JsonProperty("policySalary")
  private Double policySalary = null;

  @JsonProperty("quoteDescription")
  private String quoteDescription = null;

  @JsonProperty("oiAccountItemIdCq")
  private OiAccountItemIdCq oiAccountItemIdCq = null;

  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;

  @JsonProperty("topPersonCq")
  private TopPersonCq topPersonCq = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;

  @JsonProperty("companyIdCq")
  private CompanyIdCq companyIdCq = null;

  @JsonProperty("agreementSearchTypeCq")
  private String agreementSearchTypeCq = null;


  public String getPersonRegistration() {
    return personRegistration;
  }

  public void setPersonRegistration(String personRegistration) {
    this.personRegistration = personRegistration;
  }

  public LocalDate getPolicyStartDate() {
    return policyStartDate;
  }

  public void setPolicyStartDate(LocalDate policyStartDate) {
    this.policyStartDate = policyStartDate;
  }

  public Double getPolicyPremium() {
    return policyPremium;
  }

  public void setPolicyPremium(Double policyPremium) {
    this.policyPremium = policyPremium;
  }

  public Double getPolicySalary() {
    return policySalary;
  }

  public void setPolicySalary(Double policySalary) {
    this.policySalary = policySalary;
  }

  public String getQuoteDescription() {
    return quoteDescription;
  }

  public void setQuoteDescription(String quoteDescription) {
    this.quoteDescription = quoteDescription;
  }

  public OiAccountItemIdCq getOiAccountItemIdCq() {
    return oiAccountItemIdCq;
  }

  public void setOiAccountItemIdCq(OiAccountItemIdCq oiAccountItemIdCq) {
    this.oiAccountItemIdCq = oiAccountItemIdCq;
  }

  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }

  public TopPersonCq getTopPersonCq() {
    return topPersonCq;
  }

  public void setTopPersonCq(TopPersonCq topPersonCq) {
    this.topPersonCq = topPersonCq;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }

  public CompanyIdCq getCompanyIdCq() {
    return companyIdCq;
  }

  public void setCompanyIdCq(CompanyIdCq companyIdCq) {
    this.companyIdCq = companyIdCq;
  }

  public String getAgreementSearchTypeCq() {
    return agreementSearchTypeCq;
  }

  public void setAgreementSearchTypeCq(String agreementSearchTypeCq) {
    this.agreementSearchTypeCq = agreementSearchTypeCq;
  }
}

