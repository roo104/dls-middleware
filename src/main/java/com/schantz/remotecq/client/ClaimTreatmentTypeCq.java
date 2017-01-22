package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimTreatmentTypeCq implements Serializable {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("claimTreatmentTypeId")
  private ClaimTreatmentTypeIdCq claimTreatmentTypeId = null;

  @JsonProperty("claimProductTypeCqCollection")
  private List<String> claimProductTypeCqCollection = new ArrayList<String>();


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimTreatmentTypeIdCq getClaimTreatmentTypeId() {
    return claimTreatmentTypeId;
  }

  public void setClaimTreatmentTypeId(ClaimTreatmentTypeIdCq claimTreatmentTypeId) {
    this.claimTreatmentTypeId = claimTreatmentTypeId;
  }
  public ClaimTreatmentTypeCq addClaimProductTypeCqCollectionItem(String claimProductTypeCqCollectionItem) {
    this.claimProductTypeCqCollection.add(claimProductTypeCqCollectionItem);
    return this;
  }

  public List<String> getClaimProductTypeCqCollection() {
    return claimProductTypeCqCollection;
  }

  public void setClaimProductTypeCqCollection(List<String> claimProductTypeCqCollection) {
    this.claimProductTypeCqCollection = claimProductTypeCqCollection;
  }
}

