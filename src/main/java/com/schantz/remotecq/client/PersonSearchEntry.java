package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PersonSearchEntry implements Serializable {
  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("addressCq")
  private AddressCq addressCq = null;

  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("name")
  private PersonNameCq name = null;


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AddressCq getAddressCq() {
    return addressCq;
  }

  public void setAddressCq(AddressCq addressCq) {
    this.addressCq = addressCq;
  }

  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public PersonNameCq getName() {
    return name;
  }

  public void setName(PersonNameCq name) {
    this.name = name;
  }
}

