package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LegalTermIdCq implements Serializable {
  @JsonProperty("legalTermUid")
  private String legalTermUid = null;

  @JsonProperty("legalTermId")
  private String legalTermId = null;


  public String getLegalTermUid() {
    return legalTermUid;
  }

  public void setLegalTermUid(String legalTermUid) {
    this.legalTermUid = legalTermUid;
  }

  public String getLegalTermId() {
    return legalTermId;
  }

  public void setLegalTermId(String legalTermId) {
    this.legalTermId = legalTermId;
  }
}

