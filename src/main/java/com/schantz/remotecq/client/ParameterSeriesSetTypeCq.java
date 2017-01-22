package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterSeriesSetTypeCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private ParameterTypeIdCq id = null;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ParameterTypeIdCq getId() {
    return id;
  }

  public void setId(ParameterTypeIdCq id) {
    this.id = id;
  }
}

