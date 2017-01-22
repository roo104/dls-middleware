package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyStateCq implements Serializable {
  @JsonProperty("healthNeeded")
  private Boolean healthNeeded = false;

  @JsonProperty("healthWaiting")
  private Boolean healthWaiting = false;

  @JsonProperty("waitingPeriod")
  private Boolean waitingPeriod = false;

  @JsonProperty("importantWorkflow")
  private Boolean importantWorkflow = false;

  @JsonProperty("needsAdvance")
  private Boolean needsAdvance = false;

  @JsonProperty("onHoldCqCollection")
  private List<OnHoldCq> onHoldCqCollection = new ArrayList<OnHoldCq>();


  public Boolean getHealthNeeded() {
    return healthNeeded;
  }

  public void setHealthNeeded(Boolean healthNeeded) {
    this.healthNeeded = healthNeeded;
  }

  public Boolean getHealthWaiting() {
    return healthWaiting;
  }

  public void setHealthWaiting(Boolean healthWaiting) {
    this.healthWaiting = healthWaiting;
  }

  public Boolean getWaitingPeriod() {
    return waitingPeriod;
  }

  public void setWaitingPeriod(Boolean waitingPeriod) {
    this.waitingPeriod = waitingPeriod;
  }

  public Boolean getImportantWorkflow() {
    return importantWorkflow;
  }

  public void setImportantWorkflow(Boolean importantWorkflow) {
    this.importantWorkflow = importantWorkflow;
  }

  public Boolean getNeedsAdvance() {
    return needsAdvance;
  }

  public void setNeedsAdvance(Boolean needsAdvance) {
    this.needsAdvance = needsAdvance;
  }
  public PolicyStateCq addOnHoldCqCollectionItem(OnHoldCq onHoldCqCollectionItem) {
    this.onHoldCqCollection.add(onHoldCqCollectionItem);
    return this;
  }

  public List<OnHoldCq> getOnHoldCqCollection() {
    return onHoldCqCollection;
  }

  public void setOnHoldCqCollection(List<OnHoldCq> onHoldCqCollection) {
    this.onHoldCqCollection = onHoldCqCollection;
  }
}

