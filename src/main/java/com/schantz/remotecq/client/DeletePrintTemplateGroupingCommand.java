package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DeletePrintTemplateGroupingCommand implements Serializable {
  @JsonProperty("printTemplateGroupingIdCq")
  private PrintTemplateGroupingIdCq printTemplateGroupingIdCq = null;


  public PrintTemplateGroupingIdCq getPrintTemplateGroupingIdCq() {
    return printTemplateGroupingIdCq;
  }

  public void setPrintTemplateGroupingIdCq(PrintTemplateGroupingIdCq printTemplateGroupingIdCq) {
    this.printTemplateGroupingIdCq = printTemplateGroupingIdCq;
  }
}

