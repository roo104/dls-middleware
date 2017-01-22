package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LegalTermVersionDetailsQueryLegalTermVersionDetailsQueryResult implements Serializable {
  @JsonProperty("legalTermVersionIdCq")
  private LegalTermVersionIdCq legalTermVersionIdCq = null;


  public LegalTermVersionIdCq getLegalTermVersionIdCq() {
    return legalTermVersionIdCq;
  }

  public void setLegalTermVersionIdCq(LegalTermVersionIdCq legalTermVersionIdCq) {
    this.legalTermVersionIdCq = legalTermVersionIdCq;
  }
}

