package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class NotAddedQuoteLifeCaseQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("notAddedQuoteLifeCaseCqCollection")
  private List<NotAddedQuoteLifeCaseCq> notAddedQuoteLifeCaseCqCollection = new ArrayList<NotAddedQuoteLifeCaseCq>();

  public NotAddedQuoteLifeCaseQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public NotAddedQuoteLifeCaseQueryResult addNotAddedQuoteLifeCaseCqCollectionItem(NotAddedQuoteLifeCaseCq notAddedQuoteLifeCaseCqCollectionItem) {
    this.notAddedQuoteLifeCaseCqCollection.add(notAddedQuoteLifeCaseCqCollectionItem);
    return this;
  }

  public List<NotAddedQuoteLifeCaseCq> getNotAddedQuoteLifeCaseCqCollection() {
    return notAddedQuoteLifeCaseCqCollection;
  }

  public void setNotAddedQuoteLifeCaseCqCollection(List<NotAddedQuoteLifeCaseCq> notAddedQuoteLifeCaseCqCollection) {
    this.notAddedQuoteLifeCaseCqCollection = notAddedQuoteLifeCaseCqCollection;
  }
}

