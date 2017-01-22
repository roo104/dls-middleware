package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TestAdvanceDetailsQueryTestAdvanceDetailsQueryResult implements Serializable {
  @JsonProperty("testAdvanceUid")
  private String testAdvanceUid = null;


  public String getTestAdvanceUid() {
    return testAdvanceUid;
  }

  public void setTestAdvanceUid(String testAdvanceUid) {
    this.testAdvanceUid = testAdvanceUid;
  }
}

