package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementVersionIdCq implements Serializable {
  @JsonProperty("versionId")
  private String versionId = null;

  @JsonProperty("localVersionNumber")
  private String localVersionNumber = null;

  @JsonProperty("localVersionNote")
  private String localVersionNote = null;

  @JsonProperty("transTime")
  private OffsetDateTime transTime = null;

  @JsonProperty("localProductVersionUid")
  private String localProductVersionUid = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;


  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public String getLocalVersionNumber() {
    return localVersionNumber;
  }

  public void setLocalVersionNumber(String localVersionNumber) {
    this.localVersionNumber = localVersionNumber;
  }

  public String getLocalVersionNote() {
    return localVersionNote;
  }

  public void setLocalVersionNote(String localVersionNote) {
    this.localVersionNote = localVersionNote;
  }

  public OffsetDateTime getTransTime() {
    return transTime;
  }

  public void setTransTime(OffsetDateTime transTime) {
    this.transTime = transTime;
  }

  public String getLocalProductVersionUid() {
    return localProductVersionUid;
  }

  public void setLocalProductVersionUid(String localProductVersionUid) {
    this.localProductVersionUid = localProductVersionUid;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }
}

