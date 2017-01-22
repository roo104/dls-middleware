package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ProcessIdCq implements Serializable {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("processUid")
  private String processUid = null;

  @JsonProperty("entityNameCq")
  private EntityNameCq entityNameCq = null;

  @JsonProperty("processIconCq")
  private String processIconCq = null;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProcessUid() {
    return processUid;
  }

  public void setProcessUid(String processUid) {
    this.processUid = processUid;
  }

  public EntityNameCq getEntityNameCq() {
    return entityNameCq;
  }

  public void setEntityNameCq(EntityNameCq entityNameCq) {
    this.entityNameCq = entityNameCq;
  }

  public String getProcessIconCq() {
    return processIconCq;
  }

  public void setProcessIconCq(String processIconCq) {
    this.processIconCq = processIconCq;
  }
}

