package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementIdCq implements Serializable {
  @JsonProperty("lifeProductUid")
  private String lifeProductUid = null;

  @JsonProperty("agreementId")
  private String agreementId = null;

  @JsonProperty("agreementName")
  private String agreementName = null;


  public String getLifeProductUid() {
    return lifeProductUid;
  }

  public void setLifeProductUid(String lifeProductUid) {
    this.lifeProductUid = lifeProductUid;
  }

  public String getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  public String getAgreementName() {
    return agreementName;
  }

  public void setAgreementName(String agreementName) {
    this.agreementName = agreementName;
  }
}

