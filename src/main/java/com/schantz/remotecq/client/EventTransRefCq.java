package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EventTransRefCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("transId")
  private EventTransIdCq transId = null;


  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public EventTransIdCq getTransId() {
    return transId;
  }

  public void setTransId(EventTransIdCq transId) {
    this.transId = transId;
  }
}

