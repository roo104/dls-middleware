package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PersonSaveHealthRegistrationCommand implements Serializable {
  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("personHealthDataCq")
  private PersonHealthDataCq personHealthDataCq = null;


  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public PersonHealthDataCq getPersonHealthDataCq() {
    return personHealthDataCq;
  }

  public void setPersonHealthDataCq(PersonHealthDataCq personHealthDataCq) {
    this.personHealthDataCq = personHealthDataCq;
  }
}

