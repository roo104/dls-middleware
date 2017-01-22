package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterValueCq implements Serializable {
  @JsonProperty("projected")
  private Boolean projected = false;

  @JsonProperty("seriesId")
  private ParameterSeriesIdCq seriesId = null;

  @JsonProperty("type")
  private ParameterValueTypeCq type = null;

  @JsonProperty("keyCollection")
  private List<ParameterFieldCqObject> keyCollection = new ArrayList<ParameterFieldCqObject>();

  @JsonProperty("valueCollection")
  private List<ParameterFieldCqObject> valueCollection = new ArrayList<ParameterFieldCqObject>();


  public Boolean getProjected() {
    return projected;
  }

  public void setProjected(Boolean projected) {
    this.projected = projected;
  }

  public ParameterSeriesIdCq getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(ParameterSeriesIdCq seriesId) {
    this.seriesId = seriesId;
  }

  public ParameterValueTypeCq getType() {
    return type;
  }

  public void setType(ParameterValueTypeCq type) {
    this.type = type;
  }
  public ParameterValueCq addKeyCollectionItem(ParameterFieldCqObject keyCollectionItem) {
    this.keyCollection.add(keyCollectionItem);
    return this;
  }

  public List<ParameterFieldCqObject> getKeyCollection() {
    return keyCollection;
  }

  public void setKeyCollection(List<ParameterFieldCqObject> keyCollection) {
    this.keyCollection = keyCollection;
  }
  public ParameterValueCq addValueCollectionItem(ParameterFieldCqObject valueCollectionItem) {
    this.valueCollection.add(valueCollectionItem);
    return this;
  }

  public List<ParameterFieldCqObject> getValueCollection() {
    return valueCollection;
  }

  public void setValueCollection(List<ParameterFieldCqObject> valueCollection) {
    this.valueCollection = valueCollection;
  }
}

