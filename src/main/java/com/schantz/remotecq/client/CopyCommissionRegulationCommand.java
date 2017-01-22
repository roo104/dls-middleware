package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CopyCommissionRegulationCommand implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("copyFromVersionId")
  private CommissionRegulationVersionIdCq copyFromVersionId = null;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

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

  public CommissionRegulationVersionIdCq getCopyFromVersionId() {
    return copyFromVersionId;
  }

  public void setCopyFromVersionId(CommissionRegulationVersionIdCq copyFromVersionId) {
    this.copyFromVersionId = copyFromVersionId;
  }
}

