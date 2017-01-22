package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TestAdvanceCq implements Serializable {
  @JsonProperty("testAdvanceInfoCq")
  private TestAdvanceInfoCq testAdvanceInfoCq = null;

  @JsonProperty("testAdvanceLogEntryCqCollection")
  private List<TestAdvanceLogEntryCq> testAdvanceLogEntryCqCollection = new ArrayList<TestAdvanceLogEntryCq>();


  public TestAdvanceInfoCq getTestAdvanceInfoCq() {
    return testAdvanceInfoCq;
  }

  public void setTestAdvanceInfoCq(TestAdvanceInfoCq testAdvanceInfoCq) {
    this.testAdvanceInfoCq = testAdvanceInfoCq;
  }
  public TestAdvanceCq addTestAdvanceLogEntryCqCollectionItem(TestAdvanceLogEntryCq testAdvanceLogEntryCqCollectionItem) {
    this.testAdvanceLogEntryCqCollection.add(testAdvanceLogEntryCqCollectionItem);
    return this;
  }

  public List<TestAdvanceLogEntryCq> getTestAdvanceLogEntryCqCollection() {
    return testAdvanceLogEntryCqCollection;
  }

  public void setTestAdvanceLogEntryCqCollection(List<TestAdvanceLogEntryCq> testAdvanceLogEntryCqCollection) {
    this.testAdvanceLogEntryCqCollection = testAdvanceLogEntryCqCollection;
  }
}

