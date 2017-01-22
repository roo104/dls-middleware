package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BasicClauseQueryClauseQueryResult implements Serializable {
  @JsonProperty("clauseId")
  private ClauseIdCq clauseId = null;


  public ClauseIdCq getClauseId() {
    return clauseId;
  }

  public void setClauseId(ClauseIdCq clauseId) {
    this.clauseId = clauseId;
  }
}

