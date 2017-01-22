package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PrivilegeCq implements Serializable {
  @JsonProperty("privilegeIdCq")
  private PrivilegeIdCq privilegeIdCq = null;


  public PrivilegeIdCq getPrivilegeIdCq() {
    return privilegeIdCq;
  }

  public void setPrivilegeIdCq(PrivilegeIdCq privilegeIdCq) {
    this.privilegeIdCq = privilegeIdCq;
  }
}

