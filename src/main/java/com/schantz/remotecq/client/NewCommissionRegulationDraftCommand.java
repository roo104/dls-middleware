package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewCommissionRegulationDraftCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("basedOn")
  private CommissionRegulationVersionIdCq basedOn = null;

  @JsonProperty("isCreateAsCancelled")
  private Boolean isCreateAsCancelled = false;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getVersionNote() {
    return versionNote;
  }

  public void setVersionNote(String versionNote) {
    this.versionNote = versionNote;
  }

  public CommissionRegulationVersionIdCq getBasedOn() {
    return basedOn;
  }

  public void setBasedOn(CommissionRegulationVersionIdCq basedOn) {
    this.basedOn = basedOn;
  }

  public Boolean getIsCreateAsCancelled() {
    return isCreateAsCancelled;
  }

  public void setIsCreateAsCancelled(Boolean isCreateAsCancelled) {
    this.isCreateAsCancelled = isCreateAsCancelled;
  }
}

