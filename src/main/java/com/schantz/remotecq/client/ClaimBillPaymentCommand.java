package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimBillPaymentCommand implements Serializable {
  @JsonProperty("paymentDate")
  private LocalDate paymentDate = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("noMatchPayment")
  private NoMatchPayment noMatchPayment = null;

  @JsonProperty("healthCarePaymentCollection")
  private List<HealthCarePayment> healthCarePaymentCollection = new ArrayList<HealthCarePayment>();


  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public NoMatchPayment getNoMatchPayment() {
    return noMatchPayment;
  }

  public void setNoMatchPayment(NoMatchPayment noMatchPayment) {
    this.noMatchPayment = noMatchPayment;
  }
  public ClaimBillPaymentCommand addHealthCarePaymentCollectionItem(HealthCarePayment healthCarePaymentCollectionItem) {
    this.healthCarePaymentCollection.add(healthCarePaymentCollectionItem);
    return this;
  }

  public List<HealthCarePayment> getHealthCarePaymentCollection() {
    return healthCarePaymentCollection;
  }

  public void setHealthCarePaymentCollection(List<HealthCarePayment> healthCarePaymentCollection) {
    this.healthCarePaymentCollection = healthCarePaymentCollection;
  }
}

