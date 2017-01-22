package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EditUserCommand implements Serializable {
  @JsonProperty("userIdCq")
  private UserIdCq userIdCq = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;


  public UserIdCq getUserIdCq() {
    return userIdCq;
  }

  public void setUserIdCq(UserIdCq userIdCq) {
    this.userIdCq = userIdCq;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}

