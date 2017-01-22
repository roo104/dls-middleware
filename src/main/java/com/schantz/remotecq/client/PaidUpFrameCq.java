package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PaidUpFrameCq implements Serializable {
  @JsonProperty("doubleFrameCq")
  private DoubleFrameCq doubleFrameCq = null;


  public DoubleFrameCq getDoubleFrameCq() {
    return doubleFrameCq;
  }

  public void setDoubleFrameCq(DoubleFrameCq doubleFrameCq) {
    this.doubleFrameCq = doubleFrameCq;
  }
}

