package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class GeneratePaymentSpecificationFileQueryGeneratePaymentSpecificationFileQueryResult implements Serializable {
  @JsonProperty("oiAccountItemIdCq")
  private OiAccountItemIdCq oiAccountItemIdCq = null;


  public OiAccountItemIdCq getOiAccountItemIdCq() {
    return oiAccountItemIdCq;
  }

  public void setOiAccountItemIdCq(OiAccountItemIdCq oiAccountItemIdCq) {
    this.oiAccountItemIdCq = oiAccountItemIdCq;
  }
}

