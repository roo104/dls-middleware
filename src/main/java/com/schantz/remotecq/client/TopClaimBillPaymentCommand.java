package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopClaimBillPaymentCommand implements Serializable {
  @JsonProperty("paymentDate")
  private LocalDate paymentDate = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("noMatchPayment")
  private NoMatchPayment noMatchPayment = null;

  @JsonProperty("healthCarePaymentCollection")
  private List<HealthCarePayment> healthCarePaymentCollection = new ArrayList<HealthCarePayment>();

  @JsonProperty("invoiceId")
  private String invoiceId = null;

  @JsonProperty("penalInterest")
  private Double penalInterest = null;

  @JsonProperty("isFeePayment")
  private Boolean isFeePayment = false;


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
  public TopClaimBillPaymentCommand addHealthCarePaymentCollectionItem(HealthCarePayment healthCarePaymentCollectionItem) {
    this.healthCarePaymentCollection.add(healthCarePaymentCollectionItem);
    return this;
  }

  public List<HealthCarePayment> getHealthCarePaymentCollection() {
    return healthCarePaymentCollection;
  }

  public void setHealthCarePaymentCollection(List<HealthCarePayment> healthCarePaymentCollection) {
    this.healthCarePaymentCollection = healthCarePaymentCollection;
  }

  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Double getPenalInterest() {
    return penalInterest;
  }

  public void setPenalInterest(Double penalInterest) {
    this.penalInterest = penalInterest;
  }

  public Boolean getIsFeePayment() {
    return isFeePayment;
  }

  public void setIsFeePayment(Boolean isFeePayment) {
    this.isFeePayment = isFeePayment;
  }
}

