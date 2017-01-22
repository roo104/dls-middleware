package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DisabilityAnnexSpecCq implements Serializable {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("stateTax")
  private Double stateTax = null;

  @JsonProperty("total")
  private Double total = null;

  @JsonProperty("paymentTaxTypeCq")
  private String paymentTaxTypeCq = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;

  @JsonProperty("benefitTypeCq")
  private String benefitTypeCq = null;

  @JsonProperty("isInsuredIsReceiver")
  private Boolean isInsuredIsReceiver = false;


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Double getStateTax() {
    return stateTax;
  }

  public void setStateTax(Double stateTax) {
    this.stateTax = stateTax;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public String getPaymentTaxTypeCq() {
    return paymentTaxTypeCq;
  }

  public void setPaymentTaxTypeCq(String paymentTaxTypeCq) {
    this.paymentTaxTypeCq = paymentTaxTypeCq;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }

  public String getBenefitTypeCq() {
    return benefitTypeCq;
  }

  public void setBenefitTypeCq(String benefitTypeCq) {
    this.benefitTypeCq = benefitTypeCq;
  }

  public Boolean getIsInsuredIsReceiver() {
    return isInsuredIsReceiver;
  }

  public void setIsInsuredIsReceiver(Boolean isInsuredIsReceiver) {
    this.isInsuredIsReceiver = isInsuredIsReceiver;
  }
}

