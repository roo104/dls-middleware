package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateArgumentContextCq implements Serializable {
  @JsonProperty("highlight")
  private Boolean highlight = false;

  @JsonProperty("printTemplateArgumentIdCq")
  private PrintTemplateArgumentIdCq printTemplateArgumentIdCq = null;


  public Boolean getHighlight() {
    return highlight;
  }

  public void setHighlight(Boolean highlight) {
    this.highlight = highlight;
  }

  public PrintTemplateArgumentIdCq getPrintTemplateArgumentIdCq() {
    return printTemplateArgumentIdCq;
  }

  public void setPrintTemplateArgumentIdCq(PrintTemplateArgumentIdCq printTemplateArgumentIdCq) {
    this.printTemplateArgumentIdCq = printTemplateArgumentIdCq;
  }
}

