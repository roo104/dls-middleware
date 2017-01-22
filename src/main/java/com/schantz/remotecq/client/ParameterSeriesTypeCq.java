package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterSeriesTypeCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("keyFieldTypeCollection")
  private List<ParameterFieldTypeCqObject> keyFieldTypeCollection = new ArrayList<ParameterFieldTypeCqObject>();

  @JsonProperty("valueTypeCollection")
  private List<ParameterValueTypeCq> valueTypeCollection = new ArrayList<ParameterValueTypeCq>();

  @JsonProperty("defaultValueType")
  private ParameterValueTypeCq defaultValueType = null;

  @JsonProperty("id")
  private ParameterTypeIdCq id = null;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  public ParameterSeriesTypeCq addKeyFieldTypeCollectionItem(ParameterFieldTypeCqObject keyFieldTypeCollectionItem) {
    this.keyFieldTypeCollection.add(keyFieldTypeCollectionItem);
    return this;
  }

  public List<ParameterFieldTypeCqObject> getKeyFieldTypeCollection() {
    return keyFieldTypeCollection;
  }

  public void setKeyFieldTypeCollection(List<ParameterFieldTypeCqObject> keyFieldTypeCollection) {
    this.keyFieldTypeCollection = keyFieldTypeCollection;
  }
  public ParameterSeriesTypeCq addValueTypeCollectionItem(ParameterValueTypeCq valueTypeCollectionItem) {
    this.valueTypeCollection.add(valueTypeCollectionItem);
    return this;
  }

  public List<ParameterValueTypeCq> getValueTypeCollection() {
    return valueTypeCollection;
  }

  public void setValueTypeCollection(List<ParameterValueTypeCq> valueTypeCollection) {
    this.valueTypeCollection = valueTypeCollection;
  }

  public ParameterValueTypeCq getDefaultValueType() {
    return defaultValueType;
  }

  public void setDefaultValueType(ParameterValueTypeCq defaultValueType) {
    this.defaultValueType = defaultValueType;
  }

  public ParameterTypeIdCq getId() {
    return id;
  }

  public void setId(ParameterTypeIdCq id) {
    this.id = id;
  }
}

