package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeContributionEventDataCq implements Serializable {
  @JsonProperty("referenceNo")
  private String referenceNo = null;

  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("partTimePct")
  private Double partTimePct = null;

  @JsonProperty("salaryInArrears")
  private Boolean salaryInArrears = false;

  @JsonProperty("leaveOfAbsence")
  private Boolean leaveOfAbsence = false;

  @JsonProperty("changeContributionEventContributerDataCqCollection")
  private List<ChangeContributionEventContributerDataCq> changeContributionEventContributerDataCqCollection = new ArrayList<ChangeContributionEventContributerDataCq>();

  @JsonProperty("changeContributionTypeCq")
  private String changeContributionTypeCq = null;

  @JsonProperty("employeeBillingTypeCq")
  private String employeeBillingTypeCq = null;


  public String getReferenceNo() {
    return referenceNo;
  }

  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
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

  public Boolean getSalaryInArrears() {
    return salaryInArrears;
  }

  public void setSalaryInArrears(Boolean salaryInArrears) {
    this.salaryInArrears = salaryInArrears;
  }

  public Boolean getLeaveOfAbsence() {
    return leaveOfAbsence;
  }

  public void setLeaveOfAbsence(Boolean leaveOfAbsence) {
    this.leaveOfAbsence = leaveOfAbsence;
  }
  public ChangeContributionEventDataCq addChangeContributionEventContributerDataCqCollectionItem(ChangeContributionEventContributerDataCq changeContributionEventContributerDataCqCollectionItem) {
    this.changeContributionEventContributerDataCqCollection.add(changeContributionEventContributerDataCqCollectionItem);
    return this;
  }

  public List<ChangeContributionEventContributerDataCq> getChangeContributionEventContributerDataCqCollection() {
    return changeContributionEventContributerDataCqCollection;
  }

  public void setChangeContributionEventContributerDataCqCollection(List<ChangeContributionEventContributerDataCq> changeContributionEventContributerDataCqCollection) {
    this.changeContributionEventContributerDataCqCollection = changeContributionEventContributerDataCqCollection;
  }

  public String getChangeContributionTypeCq() {
    return changeContributionTypeCq;
  }

  public void setChangeContributionTypeCq(String changeContributionTypeCq) {
    this.changeContributionTypeCq = changeContributionTypeCq;
  }

  public String getEmployeeBillingTypeCq() {
    return employeeBillingTypeCq;
  }

  public void setEmployeeBillingTypeCq(String employeeBillingTypeCq) {
    this.employeeBillingTypeCq = employeeBillingTypeCq;
  }
}

