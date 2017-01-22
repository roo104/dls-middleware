package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterValueSeriesQueryParameterValueSeriesQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("keyCollection")
  private List<ParameterFieldCqObject> keyCollection = new ArrayList<ParameterFieldCqObject>();

  @JsonProperty("seriesId")
  private ParameterSeriesIdCq seriesId = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }
  public ParameterValueSeriesQueryParameterValueSeriesQueryResult addKeyCollectionItem(ParameterFieldCqObject keyCollectionItem) {
    this.keyCollection.add(keyCollectionItem);
    return this;
  }

  public List<ParameterFieldCqObject> getKeyCollection() {
    return keyCollection;
  }

  public void setKeyCollection(List<ParameterFieldCqObject> keyCollection) {
    this.keyCollection = keyCollection;
  }

  public ParameterSeriesIdCq getSeriesId() {
    return seriesId;
  }

  public void setSeriesId(ParameterSeriesIdCq seriesId) {
    this.seriesId = seriesId;
  }
}

