package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopCommissionReceiverAkkvisitoerInfoCq implements Serializable {
  @JsonProperty("akkvisitoerNumber")
  private String akkvisitoerNumber = null;

  @JsonProperty("akkvisitoerInteressentNumber")
  private String akkvisitoerInteressentNumber = null;

  @JsonProperty("akkvisitoerName")
  private String akkvisitoerName = null;

  @JsonProperty("akkvisitoerType")
  private String akkvisitoerType = null;


  public String getAkkvisitoerNumber() {
    return akkvisitoerNumber;
  }

  public void setAkkvisitoerNumber(String akkvisitoerNumber) {
    this.akkvisitoerNumber = akkvisitoerNumber;
  }

  public String getAkkvisitoerInteressentNumber() {
    return akkvisitoerInteressentNumber;
  }

  public void setAkkvisitoerInteressentNumber(String akkvisitoerInteressentNumber) {
    this.akkvisitoerInteressentNumber = akkvisitoerInteressentNumber;
  }

  public String getAkkvisitoerName() {
    return akkvisitoerName;
  }

  public void setAkkvisitoerName(String akkvisitoerName) {
    this.akkvisitoerName = akkvisitoerName;
  }

  public String getAkkvisitoerType() {
    return akkvisitoerType;
  }

  public void setAkkvisitoerType(String akkvisitoerType) {
    this.akkvisitoerType = akkvisitoerType;
  }
}

