package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ContributorReceivableIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("receivableBatchIdCq")
  private ReceivableBatchIdCq receivableBatchIdCq = null;

  @JsonProperty("originalBatchId")
  private ReceivableBatchIdCq originalBatchId = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public ReceivableBatchIdCq getReceivableBatchIdCq() {
    return receivableBatchIdCq;
  }

  public void setReceivableBatchIdCq(ReceivableBatchIdCq receivableBatchIdCq) {
    this.receivableBatchIdCq = receivableBatchIdCq;
  }

  public ReceivableBatchIdCq getOriginalBatchId() {
    return originalBatchId;
  }

  public void setOriginalBatchId(ReceivableBatchIdCq originalBatchId) {
    this.originalBatchId = originalBatchId;
  }
}

