package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NoticeQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("noticeCqCollection")
  private List<NoticeCq> noticeCqCollection = new ArrayList<NoticeCq>();

  public NoticeQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public NoticeQueryResult addNoticeCqCollectionItem(NoticeCq noticeCqCollectionItem) {
    this.noticeCqCollection.add(noticeCqCollectionItem);
    return this;
  }

  public List<NoticeCq> getNoticeCqCollection() {
    return noticeCqCollection;
  }

  public void setNoticeCqCollection(List<NoticeCq> noticeCqCollection) {
    this.noticeCqCollection = noticeCqCollection;
  }
}

