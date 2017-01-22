package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HasActiveSubscriptionQueryHasActiveSubscriptionQueryResult implements Serializable {
  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;


  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }
}

