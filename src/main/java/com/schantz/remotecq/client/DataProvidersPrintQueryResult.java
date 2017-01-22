package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DataProvidersPrintQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("printDataProviderCqCollection")
  private List<PrintDataProviderCq> printDataProviderCqCollection = new ArrayList<PrintDataProviderCq>();

  public DataProvidersPrintQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public DataProvidersPrintQueryResult addPrintDataProviderCqCollectionItem(PrintDataProviderCq printDataProviderCqCollectionItem) {
    this.printDataProviderCqCollection.add(printDataProviderCqCollectionItem);
    return this;
  }

  public List<PrintDataProviderCq> getPrintDataProviderCqCollection() {
    return printDataProviderCqCollection;
  }

  public void setPrintDataProviderCqCollection(List<PrintDataProviderCq> printDataProviderCqCollection) {
    this.printDataProviderCqCollection = printDataProviderCqCollection;
  }
}

