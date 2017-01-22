package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionPaymentidCq implements Serializable {
  @JsonProperty("uniqueId")
  private String uniqueId = null;

  @JsonProperty("postingId")
  private Long postingId = null;


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public Long getPostingId() {
    return postingId;
  }

  public void setPostingId(Long postingId) {
    this.postingId = postingId;
  }
}

