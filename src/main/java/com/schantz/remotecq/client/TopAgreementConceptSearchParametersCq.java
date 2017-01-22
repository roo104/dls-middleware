package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementConceptSearchParametersCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("avarageSalary")
  private Long avarageSalary = null;

  @JsonProperty("highRiskEmployeeShare")
  private Double highRiskEmployeeShare = null;

  @JsonProperty("totalMandatoryContribution")
  private Double totalMandatoryContribution = null;

  @JsonProperty("numberOfEmployees")
  private Long numberOfEmployees = null;

  @JsonProperty("agreementNumber")
  private String agreementNumber = null;

  @JsonProperty("parentAgreement")
  private String parentAgreement = null;

  @JsonProperty("topAgreementSchemeSearchTypeCq")
  private String topAgreementSchemeSearchTypeCq = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Long getAvarageSalary() {
    return avarageSalary;
  }

  public void setAvarageSalary(Long avarageSalary) {
    this.avarageSalary = avarageSalary;
  }

  public Double getHighRiskEmployeeShare() {
    return highRiskEmployeeShare;
  }

  public void setHighRiskEmployeeShare(Double highRiskEmployeeShare) {
    this.highRiskEmployeeShare = highRiskEmployeeShare;
  }

  public Double getTotalMandatoryContribution() {
    return totalMandatoryContribution;
  }

  public void setTotalMandatoryContribution(Double totalMandatoryContribution) {
    this.totalMandatoryContribution = totalMandatoryContribution;
  }

  public Long getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Long numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  public String getAgreementNumber() {
    return agreementNumber;
  }

  public void setAgreementNumber(String agreementNumber) {
    this.agreementNumber = agreementNumber;
  }

  public String getParentAgreement() {
    return parentAgreement;
  }

  public void setParentAgreement(String parentAgreement) {
    this.parentAgreement = parentAgreement;
  }

  public String getTopAgreementSchemeSearchTypeCq() {
    return topAgreementSchemeSearchTypeCq;
  }

  public void setTopAgreementSchemeSearchTypeCq(String topAgreementSchemeSearchTypeCq) {
    this.topAgreementSchemeSearchTypeCq = topAgreementSchemeSearchTypeCq;
  }
}

