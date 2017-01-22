package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class GenerateReceiptFileQueryGenerateReceiptFileQueryResult implements Serializable {
  @JsonProperty("batchTypeCq")
  private String batchTypeCq = null;


  public String getBatchTypeCq() {
    return batchTypeCq;
  }

  public void setBatchTypeCq(String batchTypeCq) {
    this.batchTypeCq = batchTypeCq;
  }
}

