package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PriceGroupValidationMessageCq implements Serializable {
  @JsonProperty("validationMessage")
  private CqMessageKey validationMessage = null;

  @JsonProperty("priceGroupPriceIdCq")
  private PriceGroupPriceIdCq priceGroupPriceIdCq = null;

  @JsonProperty("isBlockedsCalculation")
  private Boolean isBlockedsCalculation = false;

  @JsonProperty("isBlockesActivation")
  private Boolean isBlockesActivation = false;


  public CqMessageKey getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(CqMessageKey validationMessage) {
    this.validationMessage = validationMessage;
  }

  public PriceGroupPriceIdCq getPriceGroupPriceIdCq() {
    return priceGroupPriceIdCq;
  }

  public void setPriceGroupPriceIdCq(PriceGroupPriceIdCq priceGroupPriceIdCq) {
    this.priceGroupPriceIdCq = priceGroupPriceIdCq;
  }

  public Boolean getIsBlockedsCalculation() {
    return isBlockedsCalculation;
  }

  public void setIsBlockedsCalculation(Boolean isBlockedsCalculation) {
    this.isBlockedsCalculation = isBlockedsCalculation;
  }

  public Boolean getIsBlockesActivation() {
    return isBlockesActivation;
  }

  public void setIsBlockesActivation(Boolean isBlockesActivation) {
    this.isBlockesActivation = isBlockesActivation;
  }
}

