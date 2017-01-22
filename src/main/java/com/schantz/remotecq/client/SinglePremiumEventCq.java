package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class SinglePremiumEventCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;

  @JsonProperty("inclusionId")
  private EventInclusionIdCq inclusionId = null;

  @JsonProperty("validationOverrideCqCollection")
  private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();

  @JsonProperty("charge")
  private Double charge = null;

  @JsonProperty("grossAmount")
  private Double grossAmount = null;

  @JsonProperty("netAmount")
  private Double netAmount = null;

  @JsonProperty("contributerReferenceNo")
  private String contributerReferenceNo = null;

  @JsonProperty("oiAccountReceivableRefCq")
  private OiAccountReceivableRefCq oiAccountReceivableRefCq = null;

  @JsonProperty("amountSpecCqCollection")
  private List<AmountSpecCq> amountSpecCqCollection = new ArrayList<AmountSpecCq>();

  @JsonProperty("contributerTypeCq")
  private String contributerTypeCq = null;

  @JsonProperty("quoteSinglePremiumRef")
  private OiAccountReceivableRefCq quoteSinglePremiumRef = null;


  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public String getLifeEventIdCq() {
    return lifeEventIdCq;
  }

  public void setLifeEventIdCq(String lifeEventIdCq) {
    this.lifeEventIdCq = lifeEventIdCq;
  }

  public EventInclusionIdCq getInclusionId() {
    return inclusionId;
  }

  public void setInclusionId(EventInclusionIdCq inclusionId) {
    this.inclusionId = inclusionId;
  }
  public SinglePremiumEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
    this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
    return this;
  }

  public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
    return validationOverrideCqCollection;
  }

  public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
    this.validationOverrideCqCollection = validationOverrideCqCollection;
  }

  public Double getCharge() {
    return charge;
  }

  public void setCharge(Double charge) {
    this.charge = charge;
  }

  public Double getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(Double grossAmount) {
    this.grossAmount = grossAmount;
  }

  public Double getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(Double netAmount) {
    this.netAmount = netAmount;
  }

  public String getContributerReferenceNo() {
    return contributerReferenceNo;
  }

  public void setContributerReferenceNo(String contributerReferenceNo) {
    this.contributerReferenceNo = contributerReferenceNo;
  }

  public OiAccountReceivableRefCq getOiAccountReceivableRefCq() {
    return oiAccountReceivableRefCq;
  }

  public void setOiAccountReceivableRefCq(OiAccountReceivableRefCq oiAccountReceivableRefCq) {
    this.oiAccountReceivableRefCq = oiAccountReceivableRefCq;
  }
  public SinglePremiumEventCq addAmountSpecCqCollectionItem(AmountSpecCq amountSpecCqCollectionItem) {
    this.amountSpecCqCollection.add(amountSpecCqCollectionItem);
    return this;
  }

  public List<AmountSpecCq> getAmountSpecCqCollection() {
    return amountSpecCqCollection;
  }

  public void setAmountSpecCqCollection(List<AmountSpecCq> amountSpecCqCollection) {
    this.amountSpecCqCollection = amountSpecCqCollection;
  }

  public String getContributerTypeCq() {
    return contributerTypeCq;
  }

  public void setContributerTypeCq(String contributerTypeCq) {
    this.contributerTypeCq = contributerTypeCq;
  }

  public OiAccountReceivableRefCq getQuoteSinglePremiumRef() {
    return quoteSinglePremiumRef;
  }

  public void setQuoteSinglePremiumRef(OiAccountReceivableRefCq quoteSinglePremiumRef) {
    this.quoteSinglePremiumRef = quoteSinglePremiumRef;
  }
}

