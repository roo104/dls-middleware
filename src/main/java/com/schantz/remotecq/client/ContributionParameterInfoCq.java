package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionParameterInfoCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("namedStep")
  private String namedStep = null;

  @JsonProperty("totalAmount")
  private Double totalAmount = null;

  @JsonProperty("partTimePct")
  private Double partTimePct = null;

  @JsonProperty("totalPct")
  private Double totalPct = null;

  @JsonProperty("employeeBillingInfoCq")
  private EmployeeBillingInfoCq employeeBillingInfoCq = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("private_")
  private ContributerParameterCq private_ = null;

  @JsonProperty("employer")
  private ContributerParameterCq employer = null;

  @JsonProperty("employee")
  private ContributerParameterCq employee = null;

  @JsonProperty("isCoverDriven")
  private Boolean isCoverDriven = false;


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

  public String getNamedStep() {
    return namedStep;
  }

  public void setNamedStep(String namedStep) {
    this.namedStep = namedStep;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Double getPartTimePct() {
    return partTimePct;
  }

  public void setPartTimePct(Double partTimePct) {
    this.partTimePct = partTimePct;
  }

  public Double getTotalPct() {
    return totalPct;
  }

  public void setTotalPct(Double totalPct) {
    this.totalPct = totalPct;
  }

  public EmployeeBillingInfoCq getEmployeeBillingInfoCq() {
    return employeeBillingInfoCq;
  }

  public void setEmployeeBillingInfoCq(EmployeeBillingInfoCq employeeBillingInfoCq) {
    this.employeeBillingInfoCq = employeeBillingInfoCq;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public ContributerParameterCq getPrivate_() {
    return private_;
  }

  public void setPrivate_(ContributerParameterCq private_) {
    this.private_ = private_;
  }

  public ContributerParameterCq getEmployer() {
    return employer;
  }

  public void setEmployer(ContributerParameterCq employer) {
    this.employer = employer;
  }

  public ContributerParameterCq getEmployee() {
    return employee;
  }

  public void setEmployee(ContributerParameterCq employee) {
    this.employee = employee;
  }

  public Boolean getIsCoverDriven() {
    return isCoverDriven;
  }

  public void setIsCoverDriven(Boolean isCoverDriven) {
    this.isCoverDriven = isCoverDriven;
  }
}

