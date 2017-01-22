package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ImpactEntityMessageCq implements Serializable {
  @JsonProperty("foundation")
  private String foundation = null;

  @JsonProperty("grouping")
  private KeyNoticeCq grouping = null;

  @JsonProperty("field")
  private KeyNoticeCq field = null;

  @JsonProperty("keyNoticeCq")
  private KeyNoticeCq keyNoticeCq = null;

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;


  public String getFoundation() {
    return foundation;
  }

  public void setFoundation(String foundation) {
    this.foundation = foundation;
  }

  public KeyNoticeCq getGrouping() {
    return grouping;
  }

  public void setGrouping(KeyNoticeCq grouping) {
    this.grouping = grouping;
  }

  public KeyNoticeCq getField() {
    return field;
  }

  public void setField(KeyNoticeCq field) {
    this.field = field;
  }

  public KeyNoticeCq getKeyNoticeCq() {
    return keyNoticeCq;
  }

  public void setKeyNoticeCq(KeyNoticeCq keyNoticeCq) {
    this.keyNoticeCq = keyNoticeCq;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }
}

