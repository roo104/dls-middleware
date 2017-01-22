package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CloneQuoteCommand implements Serializable {
  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;

  @JsonProperty("handleReceivables")
  private Boolean handleReceivables = false;


  public QuoteIdCq getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteIdCq quoteId) {
    this.quoteId = quoteId;
  }

  public Boolean getHandleReceivables() {
    return handleReceivables;
  }

  public void setHandleReceivables(Boolean handleReceivables) {
    this.handleReceivables = handleReceivables;
  }
}

