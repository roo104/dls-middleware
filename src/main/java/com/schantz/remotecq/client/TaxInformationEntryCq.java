package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TaxInformationEntryCq implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("refNo")
  private String refNo = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;


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

  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public String getRefNo() {
    return refNo;
  }

  public void setRefNo(String refNo) {
    this.refNo = refNo;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }
}

