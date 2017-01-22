package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopBulkUpdateReceivableCommand implements Serializable {
  @JsonProperty("topBulkUpdateReceivableCq")
  private TopBulkUpdateReceivableCq topBulkUpdateReceivableCq = null;


  public TopBulkUpdateReceivableCq getTopBulkUpdateReceivableCq() {
    return topBulkUpdateReceivableCq;
  }

  public void setTopBulkUpdateReceivableCq(TopBulkUpdateReceivableCq topBulkUpdateReceivableCq) {
    this.topBulkUpdateReceivableCq = topBulkUpdateReceivableCq;
  }
}

