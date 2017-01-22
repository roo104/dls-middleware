package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ScopeCq implements Serializable {
  @JsonProperty("scopePartCqCollection")
  private List<ScopePartCq> scopePartCqCollection = new ArrayList<ScopePartCq>();

  @JsonProperty("scopeIdCq")
  private ScopeIdCq scopeIdCq = null;

  public ScopeCq addScopePartCqCollectionItem(ScopePartCq scopePartCqCollectionItem) {
    this.scopePartCqCollection.add(scopePartCqCollectionItem);
    return this;
  }

  public List<ScopePartCq> getScopePartCqCollection() {
    return scopePartCqCollection;
  }

  public void setScopePartCqCollection(List<ScopePartCq> scopePartCqCollection) {
    this.scopePartCqCollection = scopePartCqCollection;
  }

  public ScopeIdCq getScopeIdCq() {
    return scopeIdCq;
  }

  public void setScopeIdCq(ScopeIdCq scopeIdCq) {
    this.scopeIdCq = scopeIdCq;
  }
}

