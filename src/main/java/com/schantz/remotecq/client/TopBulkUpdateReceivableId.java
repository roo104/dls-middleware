package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopBulkUpdateReceivableId implements Serializable {
  @JsonProperty("receivableId")
  private String receivableId = null;

  @JsonProperty("isMarkedForUpdate")
  private Boolean isMarkedForUpdate = false;


  public String getReceivableId() {
    return receivableId;
  }

  public void setReceivableId(String receivableId) {
    this.receivableId = receivableId;
  }

  public Boolean getIsMarkedForUpdate() {
    return isMarkedForUpdate;
  }

  public void setIsMarkedForUpdate(Boolean isMarkedForUpdate) {
    this.isMarkedForUpdate = isMarkedForUpdate;
  }
}

