package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreateConceptAgreementDraftCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("versionNote")
  private String versionNote = null;

  @JsonProperty("draftName")
  private String draftName = null;

  @JsonProperty("agreementVersionIdCq")
  private AgreementVersionIdCq agreementVersionIdCq = null;

  @JsonProperty("isCancelDraft")
  private Boolean isCancelDraft = false;


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

  public String getDraftName() {
    return draftName;
  }

  public void setDraftName(String draftName) {
    this.draftName = draftName;
  }

  public AgreementVersionIdCq getAgreementVersionIdCq() {
    return agreementVersionIdCq;
  }

  public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
    this.agreementVersionIdCq = agreementVersionIdCq;
  }

  public Boolean getIsCancelDraft() {
    return isCancelDraft;
  }

  public void setIsCancelDraft(Boolean isCancelDraft) {
    this.isCancelDraft = isCancelDraft;
  }
}

