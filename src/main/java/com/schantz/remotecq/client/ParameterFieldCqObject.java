package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterFieldCqObject implements Serializable {
  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("type")
  private ParameterFieldTypeCqObject type = null;


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public ParameterFieldTypeCqObject getType() {
    return type;
  }

  public void setType(ParameterFieldTypeCqObject type) {
    this.type = type;
  }
}

