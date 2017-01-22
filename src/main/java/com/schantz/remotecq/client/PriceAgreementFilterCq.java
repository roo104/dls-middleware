package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PriceAgreementFilterCq implements Serializable {
  @JsonProperty("entityNameCq")
  private EntityNameCq entityNameCq = null;


  public EntityNameCq getEntityNameCq() {
    return entityNameCq;
  }

  public void setEntityNameCq(EntityNameCq entityNameCq) {
    this.entityNameCq = entityNameCq;
  }
}

