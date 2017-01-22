package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditClaimGrantOnTypeLevelCommand implements Serializable {
  @JsonProperty("claimGrantTypeLevelEditCollection")
  private List<ClaimGrantTypeLevelEdit> claimGrantTypeLevelEditCollection = new ArrayList<ClaimGrantTypeLevelEdit>();

  @JsonProperty("claimVersionIdCq")
  private ClaimVersionIdCq claimVersionIdCq = null;

  public EditClaimGrantOnTypeLevelCommand addClaimGrantTypeLevelEditCollectionItem(ClaimGrantTypeLevelEdit claimGrantTypeLevelEditCollectionItem) {
    this.claimGrantTypeLevelEditCollection.add(claimGrantTypeLevelEditCollectionItem);
    return this;
  }

  public List<ClaimGrantTypeLevelEdit> getClaimGrantTypeLevelEditCollection() {
    return claimGrantTypeLevelEditCollection;
  }

  public void setClaimGrantTypeLevelEditCollection(List<ClaimGrantTypeLevelEdit> claimGrantTypeLevelEditCollection) {
    this.claimGrantTypeLevelEditCollection = claimGrantTypeLevelEditCollection;
  }

  public ClaimVersionIdCq getClaimVersionIdCq() {
    return claimVersionIdCq;
  }

  public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
    this.claimVersionIdCq = claimVersionIdCq;
  }
}

