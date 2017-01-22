package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewDraftAgreementCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("createAsCancelledDraft")
  private Boolean createAsCancelledDraft = false;

  @JsonProperty("draftName")
  private String draftName = null;

  @JsonProperty("draftSouce")
  private AgreementVersionIdCq draftSouce = null;


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

  public Boolean getCreateAsCancelledDraft() {
    return createAsCancelledDraft;
  }

  public void setCreateAsCancelledDraft(Boolean createAsCancelledDraft) {
    this.createAsCancelledDraft = createAsCancelledDraft;
  }

  public String getDraftName() {
    return draftName;
  }

  public void setDraftName(String draftName) {
    this.draftName = draftName;
  }

  public AgreementVersionIdCq getDraftSouce() {
    return draftSouce;
  }

  public void setDraftSouce(AgreementVersionIdCq draftSouce) {
    this.draftSouce = draftSouce;
  }
}

