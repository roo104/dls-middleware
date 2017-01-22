package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateCq implements Serializable {
  @JsonProperty("printTemplateVersionCqCollection")
  private List<PrintTemplateVersionCq> printTemplateVersionCqCollection = new ArrayList<PrintTemplateVersionCq>();

  @JsonProperty("printTemplateInfoCq")
  private PrintTemplateInfoCq printTemplateInfoCq = null;

  public PrintTemplateCq addPrintTemplateVersionCqCollectionItem(PrintTemplateVersionCq printTemplateVersionCqCollectionItem) {
    this.printTemplateVersionCqCollection.add(printTemplateVersionCqCollectionItem);
    return this;
  }

  public List<PrintTemplateVersionCq> getPrintTemplateVersionCqCollection() {
    return printTemplateVersionCqCollection;
  }

  public void setPrintTemplateVersionCqCollection(List<PrintTemplateVersionCq> printTemplateVersionCqCollection) {
    this.printTemplateVersionCqCollection = printTemplateVersionCqCollection;
  }

  public PrintTemplateInfoCq getPrintTemplateInfoCq() {
    return printTemplateInfoCq;
  }

  public void setPrintTemplateInfoCq(PrintTemplateInfoCq printTemplateInfoCq) {
    this.printTemplateInfoCq = printTemplateInfoCq;
  }
}

