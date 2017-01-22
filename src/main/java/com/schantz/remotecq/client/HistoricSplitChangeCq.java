package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class HistoricSplitChangeCq implements Serializable {
  @JsonProperty("switchDate")
  private LocalDate switchDate = null;

  @JsonProperty("doRebalance")
  private Boolean doRebalance = false;

  @JsonProperty("targetFundSplitCqCollection")
  private List<TargetFundSplitCq> targetFundSplitCqCollection = new ArrayList<TargetFundSplitCq>();


  public LocalDate getSwitchDate() {
    return switchDate;
  }

  public void setSwitchDate(LocalDate switchDate) {
    this.switchDate = switchDate;
  }

  public Boolean getDoRebalance() {
    return doRebalance;
  }

  public void setDoRebalance(Boolean doRebalance) {
    this.doRebalance = doRebalance;
  }
  public HistoricSplitChangeCq addTargetFundSplitCqCollectionItem(TargetFundSplitCq targetFundSplitCqCollectionItem) {
    this.targetFundSplitCqCollection.add(targetFundSplitCqCollectionItem);
    return this;
  }

  public List<TargetFundSplitCq> getTargetFundSplitCqCollection() {
    return targetFundSplitCqCollection;
  }

  public void setTargetFundSplitCqCollection(List<TargetFundSplitCq> targetFundSplitCqCollection) {
    this.targetFundSplitCqCollection = targetFundSplitCqCollection;
  }
}

