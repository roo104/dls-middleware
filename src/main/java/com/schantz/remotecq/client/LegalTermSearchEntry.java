package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LegalTermSearchEntry implements Serializable {
  @JsonProperty("legalTermIdCq")
  private LegalTermIdCq legalTermIdCq = null;

  @JsonProperty("defaultToShow")
  private LegalTermVersionIdCq defaultToShow = null;


  public LegalTermIdCq getLegalTermIdCq() {
    return legalTermIdCq;
  }

  public void setLegalTermIdCq(LegalTermIdCq legalTermIdCq) {
    this.legalTermIdCq = legalTermIdCq;
  }

  public LegalTermVersionIdCq getDefaultToShow() {
    return defaultToShow;
  }

  public void setDefaultToShow(LegalTermVersionIdCq defaultToShow) {
    this.defaultToShow = defaultToShow;
  }
}

