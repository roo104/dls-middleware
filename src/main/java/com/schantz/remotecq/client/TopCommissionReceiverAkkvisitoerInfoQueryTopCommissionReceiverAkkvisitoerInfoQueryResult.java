package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopCommissionReceiverAkkvisitoerInfoQueryTopCommissionReceiverAkkvisitoerInfoQueryResult implements Serializable {
  @JsonProperty("akkvisitoerNumber")
  private String akkvisitoerNumber = null;


  public String getAkkvisitoerNumber() {
    return akkvisitoerNumber;
  }

  public void setAkkvisitoerNumber(String akkvisitoerNumber) {
    this.akkvisitoerNumber = akkvisitoerNumber;
  }
}

