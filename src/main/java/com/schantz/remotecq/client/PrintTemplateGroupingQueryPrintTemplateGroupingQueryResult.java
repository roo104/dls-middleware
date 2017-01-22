package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateGroupingQueryPrintTemplateGroupingQueryResult implements Serializable {
  @JsonProperty("printTemplateGroupingIdCqCollection")
  private List<PrintTemplateGroupingIdCq> printTemplateGroupingIdCqCollection = new ArrayList<PrintTemplateGroupingIdCq>();

  public PrintTemplateGroupingQueryPrintTemplateGroupingQueryResult addPrintTemplateGroupingIdCqCollectionItem(PrintTemplateGroupingIdCq printTemplateGroupingIdCqCollectionItem) {
    this.printTemplateGroupingIdCqCollection.add(printTemplateGroupingIdCqCollectionItem);
    return this;
  }

  public List<PrintTemplateGroupingIdCq> getPrintTemplateGroupingIdCqCollection() {
    return printTemplateGroupingIdCqCollection;
  }

  public void setPrintTemplateGroupingIdCqCollection(List<PrintTemplateGroupingIdCq> printTemplateGroupingIdCqCollection) {
    this.printTemplateGroupingIdCqCollection = printTemplateGroupingIdCqCollection;
  }
}

