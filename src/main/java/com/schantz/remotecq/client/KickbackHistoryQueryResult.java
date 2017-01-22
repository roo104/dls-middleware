package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class KickbackHistoryQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("kickbackEntryCqCollection")
  private List<KickbackEntryCq> kickbackEntryCqCollection = new ArrayList<KickbackEntryCq>();

  public KickbackHistoryQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public KickbackHistoryQueryResult addKickbackEntryCqCollectionItem(KickbackEntryCq kickbackEntryCqCollectionItem) {
    this.kickbackEntryCqCollection.add(kickbackEntryCqCollectionItem);
    return this;
  }

  public List<KickbackEntryCq> getKickbackEntryCqCollection() {
    return kickbackEntryCqCollection;
  }

  public void setKickbackEntryCqCollection(List<KickbackEntryCq> kickbackEntryCqCollection) {
    this.kickbackEntryCqCollection = kickbackEntryCqCollection;
  }
}

