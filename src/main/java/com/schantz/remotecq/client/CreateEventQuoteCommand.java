package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CreateEventQuoteCommand implements Serializable {
  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;

  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("skipAdvance")
  private Boolean skipAdvance = false;

  @JsonProperty("placement")
  private EventPlacementCq placement = null;

  @JsonProperty("lifeEventIdCq")
  private String lifeEventIdCq = null;


  public QuoteIdCq getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteIdCq quoteId) {
    this.quoteId = quoteId;
  }

  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public Boolean getSkipAdvance() {
    return skipAdvance;
  }

  public void setSkipAdvance(Boolean skipAdvance) {
    this.skipAdvance = skipAdvance;
  }

  public EventPlacementCq getPlacement() {
    return placement;
  }

  public void setPlacement(EventPlacementCq placement) {
    this.placement = placement;
  }

  public String getLifeEventIdCq() {
    return lifeEventIdCq;
  }

  public void setLifeEventIdCq(String lifeEventIdCq) {
    this.lifeEventIdCq = lifeEventIdCq;
  }
}

