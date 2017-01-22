package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementExtraDetailsQueryTopAgreementExtraDetailsQueryResult implements Serializable {
  @JsonProperty("agreementVersionIdCq")
  private AgreementVersionIdCq agreementVersionIdCq = null;


  public AgreementVersionIdCq getAgreementVersionIdCq() {
    return agreementVersionIdCq;
  }

  public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
    this.agreementVersionIdCq = agreementVersionIdCq;
  }
}

