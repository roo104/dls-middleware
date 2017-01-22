package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSavePersonCommand implements Serializable {
  @JsonProperty("registration")
  private String registration = null;

  @JsonProperty("personCq")
  private PersonCq personCq = null;

  @JsonProperty("gtiInteressentNr")
  private String gtiInteressentNr = null;

  @JsonProperty("subscribeToEboks")
  private Boolean subscribeToEboks = false;


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

  public String getGtiInteressentNr() {
    return gtiInteressentNr;
  }

  public void setGtiInteressentNr(String gtiInteressentNr) {
    this.gtiInteressentNr = gtiInteressentNr;
  }

  public Boolean getSubscribeToEboks() {
    return subscribeToEboks;
  }

  public void setSubscribeToEboks(Boolean subscribeToEboks) {
    this.subscribeToEboks = subscribeToEboks;
  }
}

