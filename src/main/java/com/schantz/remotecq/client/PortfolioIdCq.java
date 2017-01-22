package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("entityNameCq")
  private EntityNameCq entityNameCq = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntityNameCq getEntityNameCq() {
    return entityNameCq;
  }

  public void setEntityNameCq(EntityNameCq entityNameCq) {
    this.entityNameCq = entityNameCq;
  }
}

