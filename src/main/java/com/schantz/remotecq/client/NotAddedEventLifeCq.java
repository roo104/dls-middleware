package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class NotAddedEventLifeCq implements Serializable {
  @JsonProperty("eventCq")
  private EventCq eventCq = null;


  public EventCq getEventCq() {
    return eventCq;
  }

  public void setEventCq(EventCq eventCq) {
    this.eventCq = eventCq;
  }
}

