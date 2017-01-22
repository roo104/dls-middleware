package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ReserveStatementBatchData implements Serializable {
  @JsonProperty("year")
  private Long year = null;


  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }
}

