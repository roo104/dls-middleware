package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CalculatePricesCommand implements Serializable {
  @JsonProperty("draftId")
  private PriceGroupVersionIdCq draftId = null;

  @JsonProperty("priceCalculationOrderTypeCq")
  private String priceCalculationOrderTypeCq = null;


  public PriceGroupVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(PriceGroupVersionIdCq draftId) {
    this.draftId = draftId;
  }

  public String getPriceCalculationOrderTypeCq() {
    return priceCalculationOrderTypeCq;
  }

  public void setPriceCalculationOrderTypeCq(String priceCalculationOrderTypeCq) {
    this.priceCalculationOrderTypeCq = priceCalculationOrderTypeCq;
  }
}

