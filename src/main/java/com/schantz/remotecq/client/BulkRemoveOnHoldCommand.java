package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BulkRemoveOnHoldCommand implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("onHoldIdsCollection")
  private List<String> onHoldIdsCollection = new ArrayList<String>();


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  public BulkRemoveOnHoldCommand addOnHoldIdsCollectionItem(String onHoldIdsCollectionItem) {
    this.onHoldIdsCollection.add(onHoldIdsCollectionItem);
    return this;
  }

  public List<String> getOnHoldIdsCollection() {
    return onHoldIdsCollection;
  }

  public void setOnHoldIdsCollection(List<String> onHoldIdsCollection) {
    this.onHoldIdsCollection = onHoldIdsCollection;
  }
}

