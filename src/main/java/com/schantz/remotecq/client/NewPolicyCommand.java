package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class NewPolicyCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("agreementId")
  private AgreementIdCq agreementId = null;

  @JsonProperty("legalPartyId")
  private LegalPartyIdCq legalPartyId = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public AgreementIdCq getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(AgreementIdCq agreementId) {
    this.agreementId = agreementId;
  }

  public LegalPartyIdCq getLegalPartyId() {
    return legalPartyId;
  }

  public void setLegalPartyId(LegalPartyIdCq legalPartyId) {
    this.legalPartyId = legalPartyId;
  }
}

