package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditClaimModuleVersionCommand implements Serializable {
  @JsonProperty("claimModuleEditCollection")
  private List<ClaimModuleEdit> claimModuleEditCollection = new ArrayList<ClaimModuleEdit>();

  @JsonProperty("claimModuleVersionIdCq")
  private ClaimModuleVersionIdCq claimModuleVersionIdCq = null;

  public EditClaimModuleVersionCommand addClaimModuleEditCollectionItem(ClaimModuleEdit claimModuleEditCollectionItem) {
    this.claimModuleEditCollection.add(claimModuleEditCollectionItem);
    return this;
  }

  public List<ClaimModuleEdit> getClaimModuleEditCollection() {
    return claimModuleEditCollection;
  }

  public void setClaimModuleEditCollection(List<ClaimModuleEdit> claimModuleEditCollection) {
    this.claimModuleEditCollection = claimModuleEditCollection;
  }

  public ClaimModuleVersionIdCq getClaimModuleVersionIdCq() {
    return claimModuleVersionIdCq;
  }

  public void setClaimModuleVersionIdCq(ClaimModuleVersionIdCq claimModuleVersionIdCq) {
    this.claimModuleVersionIdCq = claimModuleVersionIdCq;
  }
}

