package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewEventDiffQueryCustomerViewDiffQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;

  @JsonProperty("customerViewPerspectiveType")
  private String customerViewPerspectiveType = null;

  @JsonProperty("customerViewPerspectiveGroupingType")
  private String customerViewPerspectiveGroupingType = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public EventInclusionIdCq getInclusionId() {
    return inclusionId;
  }

  public void setInclusionId(EventInclusionIdCq inclusionId) {
    this.inclusionId = inclusionId;
  }

  public QuoteIdCq getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteIdCq quoteId) {
    this.quoteId = quoteId;
  }

  public String getCustomerViewPerspectiveType() {
    return customerViewPerspectiveType;
  }

  public void setCustomerViewPerspectiveType(String customerViewPerspectiveType) {
    this.customerViewPerspectiveType = customerViewPerspectiveType;
  }

  public String getCustomerViewPerspectiveGroupingType() {
    return customerViewPerspectiveGroupingType;
  }

  public void setCustomerViewPerspectiveGroupingType(String customerViewPerspectiveGroupingType) {
    this.customerViewPerspectiveGroupingType = customerViewPerspectiveGroupingType;
  }
}

