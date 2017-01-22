package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class FilterIdCq implements Serializable {
  @JsonProperty("filterId")
  private String filterId = null;


  public String getFilterId() {
    return filterId;
  }

  public void setFilterId(String filterId) {
    this.filterId = filterId;
  }
}

