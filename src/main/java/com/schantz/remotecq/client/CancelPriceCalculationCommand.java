package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CancelPriceCalculationCommand implements Serializable {
  @JsonProperty("priceCalculationIdCq")
  private PriceCalculationIdCq priceCalculationIdCq = null;


  public PriceCalculationIdCq getPriceCalculationIdCq() {
    return priceCalculationIdCq;
  }

  public void setPriceCalculationIdCq(PriceCalculationIdCq priceCalculationIdCq) {
    this.priceCalculationIdCq = priceCalculationIdCq;
  }
}

