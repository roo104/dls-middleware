package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HumanTaskInstanceFilterDeleteCommand implements Serializable {
  @JsonProperty("filterIdCq")
  private FilterIdCq filterIdCq = null;


  public FilterIdCq getFilterIdCq() {
    return filterIdCq;
  }

  public void setFilterIdCq(FilterIdCq filterIdCq) {
    this.filterIdCq = filterIdCq;
  }
}

