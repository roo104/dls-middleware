package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPolicySearchQueryTopSsPolicySearchQueryResult implements Serializable {
  @JsonProperty("cprNummer")
  private String cprNummer = null;


  public String getCprNummer() {
    return cprNummer;
  }

  public void setCprNummer(String cprNummer) {
    this.cprNummer = cprNummer;
  }
}

