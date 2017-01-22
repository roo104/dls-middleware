package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyBalanceQueryPolicyBalanceQueryResult implements Serializable {
  @JsonProperty("lifeEventTransUid")
  private String lifeEventTransUid = null;


  public String getLifeEventTransUid() {
    return lifeEventTransUid;
  }

  public void setLifeEventTransUid(String lifeEventTransUid) {
    this.lifeEventTransUid = lifeEventTransUid;
  }
}

