package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsChangeContributionCommand implements Serializable {
  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("contributerParameterCq")
  private ContributerParameterCq contributerParameterCq = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;


  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public ContributerParameterCq getContributerParameterCq() {
    return contributerParameterCq;
  }

  public void setContributerParameterCq(ContributerParameterCq contributerParameterCq) {
    this.contributerParameterCq = contributerParameterCq;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }
}

