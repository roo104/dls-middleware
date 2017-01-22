package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewDraftHealthGroupCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("basedOn")
  private HealthGroupVersionIdCq basedOn = null;

  @JsonProperty("isCreateAsCancelled")
  private Boolean isCreateAsCancelled = false;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public HealthGroupVersionIdCq getBasedOn() {
    return basedOn;
  }

  public void setBasedOn(HealthGroupVersionIdCq basedOn) {
    this.basedOn = basedOn;
  }

  public Boolean getIsCreateAsCancelled() {
    return isCreateAsCancelled;
  }

  public void setIsCreateAsCancelled(Boolean isCreateAsCancelled) {
    this.isCreateAsCancelled = isCreateAsCancelled;
  }
}

