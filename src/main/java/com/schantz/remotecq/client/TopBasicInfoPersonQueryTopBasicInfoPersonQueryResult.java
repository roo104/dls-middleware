package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopBasicInfoPersonQueryTopBasicInfoPersonQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("gtiInteressentNr")
  private String gtiInteressentNr = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public String getGtiInteressentNr() {
    return gtiInteressentNr;
  }

  public void setGtiInteressentNr(String gtiInteressentNr) {
    this.gtiInteressentNr = gtiInteressentNr;
  }
}

