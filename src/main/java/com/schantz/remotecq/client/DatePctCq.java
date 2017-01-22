package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class DatePctCq implements Serializable {
  @JsonProperty("pct")
  private Double pct = null;

  @JsonProperty("splitDate")
  private LocalDate splitDate = null;


  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public LocalDate getSplitDate() {
    return splitDate;
  }

  public void setSplitDate(LocalDate splitDate) {
    this.splitDate = splitDate;
  }
}

