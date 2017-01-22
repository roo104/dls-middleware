package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EventOrderingQuoteQueryEventOrderingQuoteQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;

  @JsonProperty("fromEventDate")
  private LocalDate fromEventDate = null;

  @JsonProperty("toEventDate")
  private LocalDate toEventDate = null;


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

  public LocalDate getFromEventDate() {
    return fromEventDate;
  }

  public void setFromEventDate(LocalDate fromEventDate) {
    this.fromEventDate = fromEventDate;
  }

  public LocalDate getToEventDate() {
    return toEventDate;
  }

  public void setToEventDate(LocalDate toEventDate) {
    this.toEventDate = toEventDate;
  }
}

