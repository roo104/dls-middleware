package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusStatementAgreementQueryRiskBonusStatementAgreementQueryResult implements Serializable {
  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;


  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }
}

