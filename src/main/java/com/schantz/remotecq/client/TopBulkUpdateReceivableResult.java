package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopBulkUpdateReceivableResult implements Serializable {
  @JsonProperty("errorMessage")
  private CqMessageKey errorMessage = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("contributorReceivable")
  private TopBulkContributorReceivableCq contributorReceivable = null;


  public CqMessageKey getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(CqMessageKey errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TopBulkContributorReceivableCq getContributorReceivable() {
    return contributorReceivable;
  }

  public void setContributorReceivable(TopBulkContributorReceivableCq contributorReceivable) {
    this.contributorReceivable = contributorReceivable;
  }
}

