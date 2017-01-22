package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EmployeesCompanyQueryEmployeesCompanyQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }
}

