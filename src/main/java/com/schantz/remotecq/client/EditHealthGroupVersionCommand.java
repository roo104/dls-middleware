package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditHealthGroupVersionCommand implements Serializable {
  @JsonProperty("healthGroupVersionIdCq")
  private HealthGroupVersionIdCq healthGroupVersionIdCq = null;

  @JsonProperty("healthGroupDeltaCqCollection")
  private List<HealthGroupDeltaCq> healthGroupDeltaCqCollection = new ArrayList<HealthGroupDeltaCq>();


  public HealthGroupVersionIdCq getHealthGroupVersionIdCq() {
    return healthGroupVersionIdCq;
  }

  public void setHealthGroupVersionIdCq(HealthGroupVersionIdCq healthGroupVersionIdCq) {
    this.healthGroupVersionIdCq = healthGroupVersionIdCq;
  }
  public EditHealthGroupVersionCommand addHealthGroupDeltaCqCollectionItem(HealthGroupDeltaCq healthGroupDeltaCqCollectionItem) {
    this.healthGroupDeltaCqCollection.add(healthGroupDeltaCqCollectionItem);
    return this;
  }

  public List<HealthGroupDeltaCq> getHealthGroupDeltaCqCollection() {
    return healthGroupDeltaCqCollection;
  }

  public void setHealthGroupDeltaCqCollection(List<HealthGroupDeltaCq> healthGroupDeltaCqCollection) {
    this.healthGroupDeltaCqCollection = healthGroupDeltaCqCollection;
  }
}

