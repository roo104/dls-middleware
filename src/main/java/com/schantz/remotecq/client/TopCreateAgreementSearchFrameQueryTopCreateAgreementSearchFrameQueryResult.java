package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreateAgreementSearchFrameQueryTopCreateAgreementSearchFrameQueryResult implements Serializable {
  @JsonProperty("agreementSchemeSearchType")
  private String agreementSchemeSearchType = null;

  @JsonProperty("parentAgreement")
  private AgreementIdCq parentAgreement = null;


  public String getAgreementSchemeSearchType() {
    return agreementSchemeSearchType;
  }

  public void setAgreementSchemeSearchType(String agreementSchemeSearchType) {
    this.agreementSchemeSearchType = agreementSchemeSearchType;
  }

  public AgreementIdCq getParentAgreement() {
    return parentAgreement;
  }

  public void setParentAgreement(AgreementIdCq parentAgreement) {
    this.parentAgreement = parentAgreement;
  }
}

