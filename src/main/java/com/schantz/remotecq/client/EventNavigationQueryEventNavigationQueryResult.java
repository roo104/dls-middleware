package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EventNavigationQueryEventNavigationQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("transId")
  private EventTransIdCq transId = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public EventTransIdCq getTransId() {
    return transId;
  }

  public void setTransId(EventTransIdCq transId) {
    this.transId = transId;
  }

  public EventInclusionIdCq getInclusionId() {
    return inclusionId;
  }

  public void setInclusionId(EventInclusionIdCq inclusionId) {
    this.inclusionId = inclusionId;
  }

  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public QuoteIdCq getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteIdCq quoteId) {
    this.quoteId = quoteId;
  }
}

