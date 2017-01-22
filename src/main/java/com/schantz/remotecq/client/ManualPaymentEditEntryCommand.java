package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ManualPaymentEditEntryCommand implements Serializable {
  @JsonProperty("manualPaymentEntryCq")
  private ManualPaymentEntryCq manualPaymentEntryCq = null;


  public ManualPaymentEntryCq getManualPaymentEntryCq() {
    return manualPaymentEntryCq;
  }

  public void setManualPaymentEntryCq(ManualPaymentEntryCq manualPaymentEntryCq) {
    this.manualPaymentEntryCq = manualPaymentEntryCq;
  }
}

