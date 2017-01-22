package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewDraftClaimVersionCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("cloneSource")
  private ClaimVersionIdCq cloneSource = null;

  @JsonProperty("isCreateAsCancelled")
  private Boolean isCreateAsCancelled = false;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimVersionIdCq getCloneSource() {
    return cloneSource;
  }

  public void setCloneSource(ClaimVersionIdCq cloneSource) {
    this.cloneSource = cloneSource;
  }

  public Boolean getIsCreateAsCancelled() {
    return isCreateAsCancelled;
  }

  public void setIsCreateAsCancelled(Boolean isCreateAsCancelled) {
    this.isCreateAsCancelled = isCreateAsCancelled;
  }
}

