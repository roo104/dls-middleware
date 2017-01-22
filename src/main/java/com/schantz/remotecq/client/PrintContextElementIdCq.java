package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PrintContextElementIdCq implements Serializable {
  @JsonProperty("idCq")
  private IdCq idCq = null;


  public IdCq getIdCq() {
    return idCq;
  }

  public void setIdCq(IdCq idCq) {
    this.idCq = idCq;
  }
}

