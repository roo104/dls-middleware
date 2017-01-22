package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class OiAccountItemDoubleEntryCq implements Serializable {
  @JsonProperty("oiAccountInfoCq")
  private OiAccountInfoCq oiAccountInfoCq = null;

  @JsonProperty("oiAccountItemDetailsCq")
  private OiAccountItemDetailsCq oiAccountItemDetailsCq = null;


  public OiAccountInfoCq getOiAccountInfoCq() {
    return oiAccountInfoCq;
  }

  public void setOiAccountInfoCq(OiAccountInfoCq oiAccountInfoCq) {
    this.oiAccountInfoCq = oiAccountInfoCq;
  }

  public OiAccountItemDetailsCq getOiAccountItemDetailsCq() {
    return oiAccountItemDetailsCq;
  }

  public void setOiAccountItemDetailsCq(OiAccountItemDetailsCq oiAccountItemDetailsCq) {
    this.oiAccountItemDetailsCq = oiAccountItemDetailsCq;
  }
}

