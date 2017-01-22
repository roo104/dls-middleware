package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CreateCreditNoteCommand implements Serializable {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("valueDate")
  private LocalDate valueDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("accountItemId")
  private Long accountItemId = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getAccountItemId() {
    return accountItemId;
  }

  public void setAccountItemId(Long accountItemId) {
    this.accountItemId = accountItemId;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }
}

