package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class NotAddedQuoteLifeCaseCq implements Serializable {
  @JsonProperty("quoteCq")
  private QuoteCq quoteCq = null;


  public QuoteCq getQuoteCq() {
    return quoteCq;
  }

  public void setQuoteCq(QuoteCq quoteCq) {
    this.quoteCq = quoteCq;
  }
}

