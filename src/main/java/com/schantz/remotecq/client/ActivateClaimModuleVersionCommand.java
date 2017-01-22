package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ActivateClaimModuleVersionCommand implements Serializable {
  @JsonProperty("versionToActivate")
  private ClaimModuleVersionIdCq versionToActivate = null;


  public ClaimModuleVersionIdCq getVersionToActivate() {
    return versionToActivate;
  }

  public void setVersionToActivate(ClaimModuleVersionIdCq versionToActivate) {
    this.versionToActivate = versionToActivate;
  }
}

