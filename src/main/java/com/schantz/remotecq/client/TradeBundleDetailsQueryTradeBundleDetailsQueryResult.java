package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TradeBundleDetailsQueryTradeBundleDetailsQueryResult implements Serializable {
  @JsonProperty("tradeBundleId")
  private TradeBundleIdCq tradeBundleId = null;


  public TradeBundleIdCq getTradeBundleId() {
    return tradeBundleId;
  }

  public void setTradeBundleId(TradeBundleIdCq tradeBundleId) {
    this.tradeBundleId = tradeBundleId;
  }
}

