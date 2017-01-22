package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ManualPaymentDeleteCommand implements Serializable {
  @JsonProperty("receivableBatchIdCq")
  private ReceivableBatchIdCq receivableBatchIdCq = null;


  public ReceivableBatchIdCq getReceivableBatchIdCq() {
    return receivableBatchIdCq;
  }

  public void setReceivableBatchIdCq(ReceivableBatchIdCq receivableBatchIdCq) {
    this.receivableBatchIdCq = receivableBatchIdCq;
  }
}

