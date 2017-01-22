package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessVersionIdCq implements Serializable {
  @JsonProperty("processVersionUid")
  private String processVersionUid = null;

  @JsonProperty("versionNumber")
  private String versionNumber = null;

  @JsonProperty("processIdCq")
  private ProcessIdCq processIdCq = null;


  public String getProcessVersionUid() {
    return processVersionUid;
  }

  public void setProcessVersionUid(String processVersionUid) {
    this.processVersionUid = processVersionUid;
  }

  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }

  public ProcessIdCq getProcessIdCq() {
    return processIdCq;
  }

  public void setProcessIdCq(ProcessIdCq processIdCq) {
    this.processIdCq = processIdCq;
  }
}

