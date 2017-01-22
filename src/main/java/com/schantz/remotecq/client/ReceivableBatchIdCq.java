package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ReceivableBatchIdCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("receivableChannelTypeCq")
  private String receivableChannelTypeCq = null;

  @JsonProperty("receivableSubChannelTypeCq")
  private String receivableSubChannelTypeCq = null;


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

  public String getReceivableChannelTypeCq() {
    return receivableChannelTypeCq;
  }

  public void setReceivableChannelTypeCq(String receivableChannelTypeCq) {
    this.receivableChannelTypeCq = receivableChannelTypeCq;
  }

  public String getReceivableSubChannelTypeCq() {
    return receivableSubChannelTypeCq;
  }

  public void setReceivableSubChannelTypeCq(String receivableSubChannelTypeCq) {
    this.receivableSubChannelTypeCq = receivableSubChannelTypeCq;
  }
}

