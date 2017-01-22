package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementVariantDifferenceEntryCq implements Serializable {
  @JsonProperty("entryType")
  private CqMessageKey entryType = null;

  @JsonProperty("keyValueCollection")
  private List<CqSerializable> keyValueCollection = new ArrayList<CqSerializable>();

  @JsonProperty("valueCollection")
  private List<CqSerializable> valueCollection = new ArrayList<CqSerializable>();


  public CqMessageKey getEntryType() {
    return entryType;
  }

  public void setEntryType(CqMessageKey entryType) {
    this.entryType = entryType;
  }
  public AgreementVariantDifferenceEntryCq addKeyValueCollectionItem(CqSerializable keyValueCollectionItem) {
    this.keyValueCollection.add(keyValueCollectionItem);
    return this;
  }

  public List<CqSerializable> getKeyValueCollection() {
    return keyValueCollection;
  }

  public void setKeyValueCollection(List<CqSerializable> keyValueCollection) {
    this.keyValueCollection = keyValueCollection;
  }
  public AgreementVariantDifferenceEntryCq addValueCollectionItem(CqSerializable valueCollectionItem) {
    this.valueCollection.add(valueCollectionItem);
    return this;
  }

  public List<CqSerializable> getValueCollection() {
    return valueCollection;
  }

  public void setValueCollection(List<CqSerializable> valueCollection) {
    this.valueCollection = valueCollection;
  }
}

