package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopCVRAgreementCommandData implements Serializable {
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

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("healthGroupIdCq")
  private HealthGroupIdCq healthGroupIdCq = null;

  @JsonProperty("topAgreementChoiceReasonCq")
  private String topAgreementChoiceReasonCq = null;

  @JsonProperty("schemeType")
  private String schemeType = null;

  @JsonProperty("companyIdCq")
  private CompanyIdCq companyIdCq = null;


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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HealthGroupIdCq getHealthGroupIdCq() {
    return healthGroupIdCq;
  }

  public void setHealthGroupIdCq(HealthGroupIdCq healthGroupIdCq) {
    this.healthGroupIdCq = healthGroupIdCq;
  }

  public String getTopAgreementChoiceReasonCq() {
    return topAgreementChoiceReasonCq;
  }

  public void setTopAgreementChoiceReasonCq(String topAgreementChoiceReasonCq) {
    this.topAgreementChoiceReasonCq = topAgreementChoiceReasonCq;
  }

  public String getSchemeType() {
    return schemeType;
  }

  public void setSchemeType(String schemeType) {
    this.schemeType = schemeType;
  }

  public CompanyIdCq getCompanyIdCq() {
    return companyIdCq;
  }

  public void setCompanyIdCq(CompanyIdCq companyIdCq) {
    this.companyIdCq = companyIdCq;
  }
}

