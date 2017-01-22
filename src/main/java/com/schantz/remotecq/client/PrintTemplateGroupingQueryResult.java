package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateGroupingQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("printTemplateGroupingCqCollection")
  private List<PrintTemplateGroupingCq> printTemplateGroupingCqCollection = new ArrayList<PrintTemplateGroupingCq>();

  public PrintTemplateGroupingQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public PrintTemplateGroupingQueryResult addPrintTemplateGroupingCqCollectionItem(PrintTemplateGroupingCq printTemplateGroupingCqCollectionItem) {
    this.printTemplateGroupingCqCollection.add(printTemplateGroupingCqCollectionItem);
    return this;
  }

  public List<PrintTemplateGroupingCq> getPrintTemplateGroupingCqCollection() {
    return printTemplateGroupingCqCollection;
  }

  public void setPrintTemplateGroupingCqCollection(List<PrintTemplateGroupingCq> printTemplateGroupingCqCollection) {
    this.printTemplateGroupingCqCollection = printTemplateGroupingCqCollection;
  }
}

