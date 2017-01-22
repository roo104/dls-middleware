package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterValueSeriesSetQueryParameterValueSeriesSetQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("keyCollection")
  private List<ParameterFieldCqObject> keyCollection = new ArrayList<ParameterFieldCqObject>();

  @JsonProperty("seriesSetId")
  private ParameterSeriesSetIdCq seriesSetId = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }
  public ParameterValueSeriesSetQueryParameterValueSeriesSetQueryResult addKeyCollectionItem(ParameterFieldCqObject keyCollectionItem) {
    this.keyCollection.add(keyCollectionItem);
    return this;
  }

  public List<ParameterFieldCqObject> getKeyCollection() {
    return keyCollection;
  }

  public void setKeyCollection(List<ParameterFieldCqObject> keyCollection) {
    this.keyCollection = keyCollection;
  }

  public ParameterSeriesSetIdCq getSeriesSetId() {
    return seriesSetId;
  }

  public void setSeriesSetId(ParameterSeriesSetIdCq seriesSetId) {
    this.seriesSetId = seriesSetId;
  }
}

