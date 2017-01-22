package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementFieldCq implements Serializable {
  @JsonProperty("fieldKey")
  private CqMessageKey fieldKey = null;


  public CqMessageKey getFieldKey() {
    return fieldKey;
  }

  public void setFieldKey(CqMessageKey fieldKey) {
    this.fieldKey = fieldKey;
  }
}

