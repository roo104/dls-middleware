package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsEmployeesCompanyQueryTopSsEmployeesCompanyQueryResult implements Serializable {
  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;


  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }
}

