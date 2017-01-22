package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CreatePrintPreviewQueryCreatePrintPreviewQueryResult implements Serializable {
  @JsonProperty("printContextCq")
  private PrintContextCq printContextCq = null;


  public PrintContextCq getPrintContextCq() {
    return printContextCq;
  }

  public void setPrintContextCq(PrintContextCq printContextCq) {
    this.printContextCq = printContextCq;
  }
}

