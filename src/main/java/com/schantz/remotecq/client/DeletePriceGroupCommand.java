package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DeletePriceGroupCommand implements Serializable {
  @JsonProperty("priceGroupIdCq")
  private PriceGroupIdCq priceGroupIdCq = null;


  public PriceGroupIdCq getPriceGroupIdCq() {
    return priceGroupIdCq;
  }

  public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
    this.priceGroupIdCq = priceGroupIdCq;
  }
}

