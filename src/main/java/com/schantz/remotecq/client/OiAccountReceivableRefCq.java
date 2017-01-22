package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class OiAccountReceivableRefCq implements Serializable {
  @JsonProperty("postingRef")
  private String postingRef = null;

  @JsonProperty("itemId")
  private Long itemId = null;


  public String getPostingRef() {
    return postingRef;
  }

  public void setPostingRef(String postingRef) {
    this.postingRef = postingRef;
  }

  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
}

