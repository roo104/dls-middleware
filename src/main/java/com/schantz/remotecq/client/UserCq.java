package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class UserCq implements Serializable {
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

  @JsonProperty("userIdCq")
  private UserIdCq userIdCq = null;

  @JsonProperty("roleCqCollection")
  private List<RoleCq> roleCqCollection = new ArrayList<RoleCq>();


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

  public UserIdCq getUserIdCq() {
    return userIdCq;
  }

  public void setUserIdCq(UserIdCq userIdCq) {
    this.userIdCq = userIdCq;
  }
  public UserCq addRoleCqCollectionItem(RoleCq roleCqCollectionItem) {
    this.roleCqCollection.add(roleCqCollectionItem);
    return this;
  }

  public List<RoleCq> getRoleCqCollection() {
    return roleCqCollection;
  }

  public void setRoleCqCollection(List<RoleCq> roleCqCollection) {
    this.roleCqCollection = roleCqCollection;
  }
}

