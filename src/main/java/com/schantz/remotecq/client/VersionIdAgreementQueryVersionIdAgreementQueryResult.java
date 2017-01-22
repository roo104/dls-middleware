package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class VersionIdAgreementQueryVersionIdAgreementQueryResult implements Serializable {
  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("logicalViewAtDate")
  private LocalDate logicalViewAtDate = null;


  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public LocalDate getLogicalViewAtDate() {
    return logicalViewAtDate;
  }

  public void setLogicalViewAtDate(LocalDate logicalViewAtDate) {
    this.logicalViewAtDate = logicalViewAtDate;
  }
}

