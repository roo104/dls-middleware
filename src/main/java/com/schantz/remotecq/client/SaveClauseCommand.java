package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SaveClauseCommand implements Serializable {
  @JsonProperty("clauseCq")
  private ClauseCq clauseCq = null;


  public ClauseCq getClauseCq() {
    return clauseCq;
  }

  public void setClauseCq(ClauseCq clauseCq) {
    this.clauseCq = clauseCq;
  }
}

