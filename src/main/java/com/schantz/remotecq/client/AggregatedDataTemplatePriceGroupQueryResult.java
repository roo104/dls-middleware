package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AggregatedDataTemplatePriceGroupQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("documentIdCq")
  private DocumentIdCq documentIdCq = null;

  public AggregatedDataTemplatePriceGroupQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public DocumentIdCq getDocumentIdCq() {
    return documentIdCq;
  }

  public void setDocumentIdCq(DocumentIdCq documentIdCq) {
    this.documentIdCq = documentIdCq;
  }
}

