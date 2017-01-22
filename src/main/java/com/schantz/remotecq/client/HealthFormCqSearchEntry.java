package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HealthFormCqSearchEntry implements Serializable {
  @JsonProperty("healthFormCq")
  private HealthFormCq healthFormCq = null;


  public HealthFormCq getHealthFormCq() {
    return healthFormCq;
  }

  public void setHealthFormCq(HealthFormCq healthFormCq) {
    this.healthFormCq = healthFormCq;
  }
}

