package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopRenameAgreementCommand implements Serializable {
  @JsonProperty("newName")
  private String newName = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;

  @JsonProperty("topAgreementCounselingTypeCq")
  private String topAgreementCounselingTypeCq = null;


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

  public String getTopAgreementCounselingTypeCq() {
    return topAgreementCounselingTypeCq;
  }

  public void setTopAgreementCounselingTypeCq(String topAgreementCounselingTypeCq) {
    this.topAgreementCounselingTypeCq = topAgreementCounselingTypeCq;
  }
}

