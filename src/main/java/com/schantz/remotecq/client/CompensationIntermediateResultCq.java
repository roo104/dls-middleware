package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CompensationIntermediateResultCq implements Serializable {
  @JsonProperty("itemId")
  private Long itemId = null;

  @JsonProperty("amount")
  private Double amount = null;


  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
}

