package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementSummaryInfoQueryTopAgreementSummaryInfoQueryResult implements Serializable {
  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("viewAt")
  private LocalDate viewAt = null;

  @JsonProperty("isIncludeChildren")
  private Boolean isIncludeChildren = false;


  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public LocalDate getViewAt() {
    return viewAt;
  }

  public void setViewAt(LocalDate viewAt) {
    this.viewAt = viewAt;
  }

  public Boolean getIsIncludeChildren() {
    return isIncludeChildren;
  }

  public void setIsIncludeChildren(Boolean isIncludeChildren) {
    this.isIncludeChildren = isIncludeChildren;
  }
}

