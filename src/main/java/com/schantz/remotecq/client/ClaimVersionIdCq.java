package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimVersionIdCq implements Serializable {
  @JsonProperty("versionUid")
  private String versionUid = null;

  @JsonProperty("versionNumber")
  private String versionNumber = null;


  public String getVersionUid() {
    return versionUid;
  }

  public void setVersionUid(String versionUid) {
    this.versionUid = versionUid;
  }

  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }
}

