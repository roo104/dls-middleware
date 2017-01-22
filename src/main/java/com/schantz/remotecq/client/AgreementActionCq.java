package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementActionCq implements Serializable {
  @JsonProperty("actionKey")
  private CqMessageKey actionKey = null;


  public CqMessageKey getActionKey() {
    return actionKey;
  }

  public void setActionKey(CqMessageKey actionKey) {
    this.actionKey = actionKey;
  }
}

