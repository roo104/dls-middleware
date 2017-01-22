package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DkCreateDummyTaxCardsCommand implements Serializable {
  @JsonProperty("isFlush")
  private Boolean isFlush = false;

  @JsonProperty("isExecuteStrategy")
  private Boolean isExecuteStrategy = false;


  public Boolean getIsFlush() {
    return isFlush;
  }

  public void setIsFlush(Boolean isFlush) {
    this.isFlush = isFlush;
  }

  public Boolean getIsExecuteStrategy() {
    return isExecuteStrategy;
  }

  public void setIsExecuteStrategy(Boolean isExecuteStrategy) {
    this.isExecuteStrategy = isExecuteStrategy;
  }
}

