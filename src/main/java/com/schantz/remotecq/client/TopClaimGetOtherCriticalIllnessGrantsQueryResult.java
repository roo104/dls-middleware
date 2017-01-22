package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopClaimGetOtherCriticalIllnessGrantsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("topClaimGetOtherCriticalIllnessGrantsQueryEntryCollection")
  private List<TopClaimGetOtherCriticalIllnessGrantsQueryEntry> topClaimGetOtherCriticalIllnessGrantsQueryEntryCollection = new ArrayList<TopClaimGetOtherCriticalIllnessGrantsQueryEntry>();

  public TopClaimGetOtherCriticalIllnessGrantsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopClaimGetOtherCriticalIllnessGrantsQueryResult addTopClaimGetOtherCriticalIllnessGrantsQueryEntryCollectionItem(TopClaimGetOtherCriticalIllnessGrantsQueryEntry topClaimGetOtherCriticalIllnessGrantsQueryEntryCollectionItem) {
    this.topClaimGetOtherCriticalIllnessGrantsQueryEntryCollection.add(topClaimGetOtherCriticalIllnessGrantsQueryEntryCollectionItem);
    return this;
  }

  public List<TopClaimGetOtherCriticalIllnessGrantsQueryEntry> getTopClaimGetOtherCriticalIllnessGrantsQueryEntryCollection() {
    return topClaimGetOtherCriticalIllnessGrantsQueryEntryCollection;
  }

  public void setTopClaimGetOtherCriticalIllnessGrantsQueryEntryCollection(List<TopClaimGetOtherCriticalIllnessGrantsQueryEntry> topClaimGetOtherCriticalIllnessGrantsQueryEntryCollection) {
    this.topClaimGetOtherCriticalIllnessGrantsQueryEntryCollection = topClaimGetOtherCriticalIllnessGrantsQueryEntryCollection;
  }
}

