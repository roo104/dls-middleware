package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class VersionDetailsPriceGroupQueryVersionDetailsPriceGroupQueryResult implements Serializable {
  @JsonProperty("priceGroupVersionIdCq")
  private PriceGroupVersionIdCq priceGroupVersionIdCq = null;


  public PriceGroupVersionIdCq getPriceGroupVersionIdCq() {
    return priceGroupVersionIdCq;
  }

  public void setPriceGroupVersionIdCq(PriceGroupVersionIdCq priceGroupVersionIdCq) {
    this.priceGroupVersionIdCq = priceGroupVersionIdCq;
  }
}

