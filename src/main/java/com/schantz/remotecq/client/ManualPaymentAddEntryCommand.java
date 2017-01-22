package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ManualPaymentAddEntryCommand implements Serializable {
  @JsonProperty("manualPaymentEntryCq")
  private ManualPaymentEntryCq manualPaymentEntryCq = null;

  @JsonProperty("receivableBatchIdCq")
  private ReceivableBatchIdCq receivableBatchIdCq = null;


  public ManualPaymentEntryCq getManualPaymentEntryCq() {
    return manualPaymentEntryCq;
  }

  public void setManualPaymentEntryCq(ManualPaymentEntryCq manualPaymentEntryCq) {
    this.manualPaymentEntryCq = manualPaymentEntryCq;
  }

  public ReceivableBatchIdCq getReceivableBatchIdCq() {
    return receivableBatchIdCq;
  }

  public void setReceivableBatchIdCq(ReceivableBatchIdCq receivableBatchIdCq) {
    this.receivableBatchIdCq = receivableBatchIdCq;
  }
}

