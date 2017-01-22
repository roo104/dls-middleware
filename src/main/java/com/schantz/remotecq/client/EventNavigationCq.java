package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EventNavigationCq implements Serializable {
  @JsonProperty("currentEventTrans")
  private EventTransCq currentEventTrans = null;

  @JsonProperty("nextEventTransRef")
  private EventTransRefCq nextEventTransRef = null;

  @JsonProperty("nextAdvEventTransRef")
  private EventTransRefCq nextAdvEventTransRef = null;

  @JsonProperty("prevEventTransRef")
  private EventTransRefCq prevEventTransRef = null;

  @JsonProperty("prevAdvEventTransRef")
  private EventTransRefCq prevAdvEventTransRef = null;

  @JsonProperty("lastEventTransRef")
  private EventTransRefCq lastEventTransRef = null;

  @JsonProperty("transactionHistoryCollection")
  private List<EventTransCq> transactionHistoryCollection = new ArrayList<EventTransCq>();


  public EventTransCq getCurrentEventTrans() {
    return currentEventTrans;
  }

  public void setCurrentEventTrans(EventTransCq currentEventTrans) {
    this.currentEventTrans = currentEventTrans;
  }

  public EventTransRefCq getNextEventTransRef() {
    return nextEventTransRef;
  }

  public void setNextEventTransRef(EventTransRefCq nextEventTransRef) {
    this.nextEventTransRef = nextEventTransRef;
  }

  public EventTransRefCq getNextAdvEventTransRef() {
    return nextAdvEventTransRef;
  }

  public void setNextAdvEventTransRef(EventTransRefCq nextAdvEventTransRef) {
    this.nextAdvEventTransRef = nextAdvEventTransRef;
  }

  public EventTransRefCq getPrevEventTransRef() {
    return prevEventTransRef;
  }

  public void setPrevEventTransRef(EventTransRefCq prevEventTransRef) {
    this.prevEventTransRef = prevEventTransRef;
  }

  public EventTransRefCq getPrevAdvEventTransRef() {
    return prevAdvEventTransRef;
  }

  public void setPrevAdvEventTransRef(EventTransRefCq prevAdvEventTransRef) {
    this.prevAdvEventTransRef = prevAdvEventTransRef;
  }

  public EventTransRefCq getLastEventTransRef() {
    return lastEventTransRef;
  }

  public void setLastEventTransRef(EventTransRefCq lastEventTransRef) {
    this.lastEventTransRef = lastEventTransRef;
  }
  public EventNavigationCq addTransactionHistoryCollectionItem(EventTransCq transactionHistoryCollectionItem) {
    this.transactionHistoryCollection.add(transactionHistoryCollectionItem);
    return this;
  }

  public List<EventTransCq> getTransactionHistoryCollection() {
    return transactionHistoryCollection;
  }

  public void setTransactionHistoryCollection(List<EventTransCq> transactionHistoryCollection) {
    this.transactionHistoryCollection = transactionHistoryCollection;
  }
}

