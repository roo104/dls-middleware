package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RenamePriceGroupCommand implements Serializable {
  @JsonProperty("priceGroupIdCq")
  private PriceGroupIdCq priceGroupIdCq = null;

  @JsonProperty("name")
  private String name = null;


  public PriceGroupIdCq getPriceGroupIdCq() {
    return priceGroupIdCq;
  }

  public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
    this.priceGroupIdCq = priceGroupIdCq;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

