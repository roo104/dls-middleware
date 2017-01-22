package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewTemplateVersionPrintCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("cloneSource")
  private PrintTemplateVersionIdCq cloneSource = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public PrintTemplateVersionIdCq getCloneSource() {
    return cloneSource;
  }

  public void setCloneSource(PrintTemplateVersionIdCq cloneSource) {
    this.cloneSource = cloneSource;
  }
}

