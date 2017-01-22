package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionParameterHistoryCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("contributer")
  private String contributer = null;

  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("partTimePct")
  private Double partTimePct = null;

  @JsonProperty("employerSelectedAbs")
  private Double employerSelectedAbs = null;

  @JsonProperty("employerSelectedPct")
  private Double employerSelectedPct = null;

  @JsonProperty("employerUseLifeProductDefault")
  private Boolean employerUseLifeProductDefault = false;

  @JsonProperty("employerCoverDriven")
  private Boolean employerCoverDriven = false;

  @JsonProperty("employeeSelectedAbs")
  private Double employeeSelectedAbs = null;

  @JsonProperty("employeeSelectedPct")
  private Double employeeSelectedPct = null;

  @JsonProperty("employeeUseLIfeProductDefault")
  private Boolean employeeUseLIfeProductDefault = false;

  @JsonProperty("employeeCoverDriven")
  private Boolean employeeCoverDriven = false;

  @JsonProperty("privateSelectedAbs")
  private Double privateSelectedAbs = null;

  @JsonProperty("privateSelectedPct")
  private Double privateSelectedPct = null;

  @JsonProperty("privateUseLifeProductDefault")
  private Boolean privateUseLifeProductDefault = false;

  @JsonProperty("privateCoverDriven")
  private Boolean privateCoverDriven = false;

  @JsonProperty("salaryInArrears")
  private Boolean salaryInArrears = false;

  @JsonProperty("isEmployerPct")
  private Boolean isEmployerPct = false;

  @JsonProperty("isEmployeePct")
  private Boolean isEmployeePct = false;

  @JsonProperty("isPrivatePct")
  private Boolean isPrivatePct = false;

  @JsonProperty("totalAmount")
  private Double totalAmount = null;

  @JsonProperty("totalPct")
  private Double totalPct = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("employeeBillingTypeCq")
  private String employeeBillingTypeCq = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getContributer() {
    return contributer;
  }

  public void setContributer(String contributer) {
    this.contributer = contributer;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Double getPartTimePct() {
    return partTimePct;
  }

  public void setPartTimePct(Double partTimePct) {
    this.partTimePct = partTimePct;
  }

  public Double getEmployerSelectedAbs() {
    return employerSelectedAbs;
  }

  public void setEmployerSelectedAbs(Double employerSelectedAbs) {
    this.employerSelectedAbs = employerSelectedAbs;
  }

  public Double getEmployerSelectedPct() {
    return employerSelectedPct;
  }

  public void setEmployerSelectedPct(Double employerSelectedPct) {
    this.employerSelectedPct = employerSelectedPct;
  }

  public Boolean getEmployerUseLifeProductDefault() {
    return employerUseLifeProductDefault;
  }

  public void setEmployerUseLifeProductDefault(Boolean employerUseLifeProductDefault) {
    this.employerUseLifeProductDefault = employerUseLifeProductDefault;
  }

  public Boolean getEmployerCoverDriven() {
    return employerCoverDriven;
  }

  public void setEmployerCoverDriven(Boolean employerCoverDriven) {
    this.employerCoverDriven = employerCoverDriven;
  }

  public Double getEmployeeSelectedAbs() {
    return employeeSelectedAbs;
  }

  public void setEmployeeSelectedAbs(Double employeeSelectedAbs) {
    this.employeeSelectedAbs = employeeSelectedAbs;
  }

  public Double getEmployeeSelectedPct() {
    return employeeSelectedPct;
  }

  public void setEmployeeSelectedPct(Double employeeSelectedPct) {
    this.employeeSelectedPct = employeeSelectedPct;
  }

  public Boolean getEmployeeUseLIfeProductDefault() {
    return employeeUseLIfeProductDefault;
  }

  public void setEmployeeUseLIfeProductDefault(Boolean employeeUseLIfeProductDefault) {
    this.employeeUseLIfeProductDefault = employeeUseLIfeProductDefault;
  }

  public Boolean getEmployeeCoverDriven() {
    return employeeCoverDriven;
  }

  public void setEmployeeCoverDriven(Boolean employeeCoverDriven) {
    this.employeeCoverDriven = employeeCoverDriven;
  }

  public Double getPrivateSelectedAbs() {
    return privateSelectedAbs;
  }

  public void setPrivateSelectedAbs(Double privateSelectedAbs) {
    this.privateSelectedAbs = privateSelectedAbs;
  }

  public Double getPrivateSelectedPct() {
    return privateSelectedPct;
  }

  public void setPrivateSelectedPct(Double privateSelectedPct) {
    this.privateSelectedPct = privateSelectedPct;
  }

  public Boolean getPrivateUseLifeProductDefault() {
    return privateUseLifeProductDefault;
  }

  public void setPrivateUseLifeProductDefault(Boolean privateUseLifeProductDefault) {
    this.privateUseLifeProductDefault = privateUseLifeProductDefault;
  }

  public Boolean getPrivateCoverDriven() {
    return privateCoverDriven;
  }

  public void setPrivateCoverDriven(Boolean privateCoverDriven) {
    this.privateCoverDriven = privateCoverDriven;
  }

  public Boolean getSalaryInArrears() {
    return salaryInArrears;
  }

  public void setSalaryInArrears(Boolean salaryInArrears) {
    this.salaryInArrears = salaryInArrears;
  }

  public Boolean getIsEmployerPct() {
    return isEmployerPct;
  }

  public void setIsEmployerPct(Boolean isEmployerPct) {
    this.isEmployerPct = isEmployerPct;
  }

  public Boolean getIsEmployeePct() {
    return isEmployeePct;
  }

  public void setIsEmployeePct(Boolean isEmployeePct) {
    this.isEmployeePct = isEmployeePct;
  }

  public Boolean getIsPrivatePct() {
    return isPrivatePct;
  }

  public void setIsPrivatePct(Boolean isPrivatePct) {
    this.isPrivatePct = isPrivatePct;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Double getTotalPct() {
    return totalPct;
  }

  public void setTotalPct(Double totalPct) {
    this.totalPct = totalPct;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public String getEmployeeBillingTypeCq() {
    return employeeBillingTypeCq;
  }

  public void setEmployeeBillingTypeCq(String employeeBillingTypeCq) {
    this.employeeBillingTypeCq = employeeBillingTypeCq;
  }
}

