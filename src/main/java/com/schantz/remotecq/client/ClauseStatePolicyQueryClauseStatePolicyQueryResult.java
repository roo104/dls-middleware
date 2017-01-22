package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ClauseStatePolicyQueryClauseStatePolicyQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }
}

