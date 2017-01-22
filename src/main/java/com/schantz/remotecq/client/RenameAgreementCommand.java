package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RenameAgreementCommand implements Serializable {
  @JsonProperty("newName")
  private String newName = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;


  public String getNewName() {
    return newName;
  }

  public void setNewName(String newName) {
    this.newName = newName;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }
}

