package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopBulkUpdateReceivableCq implements Serializable {
  @JsonProperty("batchId")
  private String batchId = null;

  @JsonProperty("receivablesCollection")
  private List<TopBulkUpdateReceivableId> receivablesCollection = new ArrayList<TopBulkUpdateReceivableId>();

  @JsonProperty("isLoadReceivablesWhenAllOk")
  private Boolean isLoadReceivablesWhenAllOk = false;


  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }
  public TopBulkUpdateReceivableCq addReceivablesCollectionItem(TopBulkUpdateReceivableId receivablesCollectionItem) {
    this.receivablesCollection.add(receivablesCollectionItem);
    return this;
  }

  public List<TopBulkUpdateReceivableId> getReceivablesCollection() {
    return receivablesCollection;
  }

  public void setReceivablesCollection(List<TopBulkUpdateReceivableId> receivablesCollection) {
    this.receivablesCollection = receivablesCollection;
  }

  public Boolean getIsLoadReceivablesWhenAllOk() {
    return isLoadReceivablesWhenAllOk;
  }

  public void setIsLoadReceivablesWhenAllOk(Boolean isLoadReceivablesWhenAllOk) {
    this.isLoadReceivablesWhenAllOk = isLoadReceivablesWhenAllOk;
  }
}

