package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LegalTermCq implements Serializable {
  @JsonProperty("legalTermIdCq")
  private LegalTermIdCq legalTermIdCq = null;


  public LegalTermIdCq getLegalTermIdCq() {
    return legalTermIdCq;
  }

  public void setLegalTermIdCq(LegalTermIdCq legalTermIdCq) {
    this.legalTermIdCq = legalTermIdCq;
  }
}

