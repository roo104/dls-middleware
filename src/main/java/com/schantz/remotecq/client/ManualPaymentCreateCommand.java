package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ManualPaymentCreateCommand implements Serializable {
  @JsonProperty("id")
  private String id = null;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}

