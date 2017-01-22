package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TradeDetailsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("tradeDetailsCq")
  private TradeDetailsCq tradeDetailsCq = null;

  public TradeDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TradeDetailsCq getTradeDetailsCq() {
    return tradeDetailsCq;
  }

  public void setTradeDetailsCq(TradeDetailsCq tradeDetailsCq) {
    this.tradeDetailsCq = tradeDetailsCq;
  }
}

