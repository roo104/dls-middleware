package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateGroupingIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parent")
  private PrintTemplateGroupingIdCq parent = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PrintTemplateGroupingIdCq getParent() {
    return parent;
  }

  public void setParent(PrintTemplateGroupingIdCq parent) {
    this.parent = parent;
  }
}

