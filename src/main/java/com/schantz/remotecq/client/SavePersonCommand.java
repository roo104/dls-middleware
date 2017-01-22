package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SavePersonCommand implements Serializable {
  @JsonProperty("registration")
  private String registration = null;

  @JsonProperty("personCq")
  private PersonCq personCq = null;


  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public PersonCq getPersonCq() {
    return personCq;
  }

  public void setPersonCq(PersonCq personCq) {
    this.personCq = personCq;
  }
}

