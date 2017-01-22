package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PrivilegeQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("privilegeCqCollection")
  private List<PrivilegeCq> privilegeCqCollection = new ArrayList<PrivilegeCq>();

  public PrivilegeQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public PrivilegeQueryResult addPrivilegeCqCollectionItem(PrivilegeCq privilegeCqCollectionItem) {
    this.privilegeCqCollection.add(privilegeCqCollectionItem);
    return this;
  }

  public List<PrivilegeCq> getPrivilegeCqCollection() {
    return privilegeCqCollection;
  }

  public void setPrivilegeCqCollection(List<PrivilegeCq> privilegeCqCollection) {
    this.privilegeCqCollection = privilegeCqCollection;
  }
}

