package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewQuoteQueryCustomerViewQuoteQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;

  @JsonProperty("useSubDivisions")
  private Boolean useSubDivisions = false;

  @JsonProperty("beforeEvent")
  private Boolean beforeEvent = false;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("customerViewPerspectiveType")
  private String customerViewPerspectiveType = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public QuoteIdCq getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteIdCq quoteId) {
    this.quoteId = quoteId;
  }

  public Boolean getUseSubDivisions() {
    return useSubDivisions;
  }

  public void setUseSubDivisions(Boolean useSubDivisions) {
    this.useSubDivisions = useSubDivisions;
  }

  public Boolean getBeforeEvent() {
    return beforeEvent;
  }

  public void setBeforeEvent(Boolean beforeEvent) {
    this.beforeEvent = beforeEvent;
  }

  public EventInclusionIdCq getInclusionId() {
    return inclusionId;
  }

  public void setInclusionId(EventInclusionIdCq inclusionId) {
    this.inclusionId = inclusionId;
  }

  public String getCustomerViewPerspectiveType() {
    return customerViewPerspectiveType;
  }

  public void setCustomerViewPerspectiveType(String customerViewPerspectiveType) {
    this.customerViewPerspectiveType = customerViewPerspectiveType;
  }
}

