package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsCreateEmployeeCommand implements Serializable {
  @JsonProperty("gtiInteressentNr")
  private String gtiInteressentNr = null;

  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("salaryType")
  private String salaryType = null;

  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("periodLength")
  private String periodLength = null;

  @JsonProperty("validFrom")
  private LocalDate validFrom = null;


  public String getGtiInteressentNr() {
    return gtiInteressentNr;
  }

  public void setGtiInteressentNr(String gtiInteressentNr) {
    this.gtiInteressentNr = gtiInteressentNr;
  }

  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public String getSalaryType() {
    return salaryType;
  }

  public void setSalaryType(String salaryType) {
    this.salaryType = salaryType;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public String getPeriodLength() {
    return periodLength;
  }

  public void setPeriodLength(String periodLength) {
    this.periodLength = periodLength;
  }

  public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }
}

