package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class OiAccountVoucherFilterQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("oiAccountVoucherTypeCqCollection")
  private List<String> oiAccountVoucherTypeCqCollection = new ArrayList<String>();

  public OiAccountVoucherFilterQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public OiAccountVoucherFilterQueryResult addOiAccountVoucherTypeCqCollectionItem(String oiAccountVoucherTypeCqCollectionItem) {
    this.oiAccountVoucherTypeCqCollection.add(oiAccountVoucherTypeCqCollectionItem);
    return this;
  }

  public List<String> getOiAccountVoucherTypeCqCollection() {
    return oiAccountVoucherTypeCqCollection;
  }

  public void setOiAccountVoucherTypeCqCollection(List<String> oiAccountVoucherTypeCqCollection) {
    this.oiAccountVoucherTypeCqCollection = oiAccountVoucherTypeCqCollection;
  }
}

