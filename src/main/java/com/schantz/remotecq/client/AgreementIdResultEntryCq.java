package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementIdResultEntryCq implements Serializable {
  @JsonProperty("lifeProductUid")
  private String lifeProductUid = null;

  @JsonProperty("name")
  private String name = null;


  public String getLifeProductUid() {
    return lifeProductUid;
  }

  public void setLifeProductUid(String lifeProductUid) {
    this.lifeProductUid = lifeProductUid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

