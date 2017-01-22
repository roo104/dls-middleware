package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ImpactAssessmentIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("orderId")
  private String orderId = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }
}

