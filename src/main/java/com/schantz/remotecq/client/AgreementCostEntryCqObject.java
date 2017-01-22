package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementCostEntryCqObject implements Serializable {
  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("entryId")
  private AgreementCostEntryIdCq entryId = null;

  @JsonProperty("globalValue")
  private ParameterSeriesIdCq globalValue = null;


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public AgreementCostEntryIdCq getEntryId() {
    return entryId;
  }

  public void setEntryId(AgreementCostEntryIdCq entryId) {
    this.entryId = entryId;
  }

  public ParameterSeriesIdCq getGlobalValue() {
    return globalValue;
  }

  public void setGlobalValue(ParameterSeriesIdCq globalValue) {
    this.globalValue = globalValue;
  }
}

