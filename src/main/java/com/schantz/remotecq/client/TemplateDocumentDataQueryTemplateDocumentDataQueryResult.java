package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TemplateDocumentDataQueryTemplateDocumentDataQueryResult implements Serializable {
  @JsonProperty("printTemplateVersionIdCq")
  private PrintTemplateVersionIdCq printTemplateVersionIdCq = null;


  public PrintTemplateVersionIdCq getPrintTemplateVersionIdCq() {
    return printTemplateVersionIdCq;
  }

  public void setPrintTemplateVersionIdCq(PrintTemplateVersionIdCq printTemplateVersionIdCq) {
    this.printTemplateVersionIdCq = printTemplateVersionIdCq;
  }
}

