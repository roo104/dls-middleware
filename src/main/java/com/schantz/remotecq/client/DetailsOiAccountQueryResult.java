package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DetailsOiAccountQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("oiAccountItemCqCollection")
  private List<OiAccountItemCq> oiAccountItemCqCollection = new ArrayList<OiAccountItemCq>();

  @JsonProperty("oiAccountInfoCq")
  private OiAccountInfoCq oiAccountInfoCq = null;

  public DetailsOiAccountQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public DetailsOiAccountQueryResult addOiAccountItemCqCollectionItem(OiAccountItemCq oiAccountItemCqCollectionItem) {
    this.oiAccountItemCqCollection.add(oiAccountItemCqCollectionItem);
    return this;
  }

  public List<OiAccountItemCq> getOiAccountItemCqCollection() {
    return oiAccountItemCqCollection;
  }

  public void setOiAccountItemCqCollection(List<OiAccountItemCq> oiAccountItemCqCollection) {
    this.oiAccountItemCqCollection = oiAccountItemCqCollection;
  }

  public OiAccountInfoCq getOiAccountInfoCq() {
    return oiAccountInfoCq;
  }

  public void setOiAccountInfoCq(OiAccountInfoCq oiAccountInfoCq) {
    this.oiAccountInfoCq = oiAccountInfoCq;
  }
}

