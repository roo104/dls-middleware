package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopCVRAgreementSearchDataCq implements Serializable {
  @JsonProperty("averageSalary")
  private Double averageSalary = null;

  @JsonProperty("employeesWithRiskWorkPct")
  private Double employeesWithRiskWorkPct = null;

  @JsonProperty("totalMandatoryContribution")
  private Double totalMandatoryContribution = null;

  @JsonProperty("numberOfEmployees")
  private Long numberOfEmployees = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("parentAgreement")
  private AgreementIdCq parentAgreement = null;

  @JsonProperty("schemeSearchType")
  private String schemeSearchType = null;

  @JsonProperty("agreement")
  private AgreementIdCq agreement = null;


  public Double getAverageSalary() {
    return averageSalary;
  }

  public void setAverageSalary(Double averageSalary) {
    this.averageSalary = averageSalary;
  }

  public Double getEmployeesWithRiskWorkPct() {
    return employeesWithRiskWorkPct;
  }

  public void setEmployeesWithRiskWorkPct(Double employeesWithRiskWorkPct) {
    this.employeesWithRiskWorkPct = employeesWithRiskWorkPct;
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

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public AgreementIdCq getParentAgreement() {
    return parentAgreement;
  }

  public void setParentAgreement(AgreementIdCq parentAgreement) {
    this.parentAgreement = parentAgreement;
  }

  public String getSchemeSearchType() {
    return schemeSearchType;
  }

  public void setSchemeSearchType(String schemeSearchType) {
    this.schemeSearchType = schemeSearchType;
  }

  public AgreementIdCq getAgreement() {
    return agreement;
  }

  public void setAgreement(AgreementIdCq agreement) {
    this.agreement = agreement;
  }
}

