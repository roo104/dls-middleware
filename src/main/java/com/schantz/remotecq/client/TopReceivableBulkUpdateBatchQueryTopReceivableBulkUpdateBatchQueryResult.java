package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopReceivableBulkUpdateBatchQueryTopReceivableBulkUpdateBatchQueryResult implements Serializable {
  @JsonProperty("batchId")
  private TopReceivableBulkUpdateBatchIdCq batchId = null;


  public TopReceivableBulkUpdateBatchIdCq getBatchId() {
    return batchId;
  }

  public void setBatchId(TopReceivableBulkUpdateBatchIdCq batchId) {
    this.batchId = batchId;
  }
}

