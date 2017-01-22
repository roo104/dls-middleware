package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class UserQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("securityToken")
  private String securityToken = null;

  @JsonProperty("countryLayer")
  private String countryLayer = null;

  @JsonProperty("roleCollection")
  private List<RoleCq> roleCollection = new ArrayList<RoleCq>();

  @JsonProperty("basePrivilegeCollection")
  private List<PrivilegeCq> basePrivilegeCollection = new ArrayList<PrivilegeCq>();

  public UserQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSecurityToken() {
    return securityToken;
  }

  public void setSecurityToken(String securityToken) {
    this.securityToken = securityToken;
  }

  public String getCountryLayer() {
    return countryLayer;
  }

  public void setCountryLayer(String countryLayer) {
    this.countryLayer = countryLayer;
  }
  public UserQueryResult addRoleCollectionItem(RoleCq roleCollectionItem) {
    this.roleCollection.add(roleCollectionItem);
    return this;
  }

  public List<RoleCq> getRoleCollection() {
    return roleCollection;
  }

  public void setRoleCollection(List<RoleCq> roleCollection) {
    this.roleCollection = roleCollection;
  }
  public UserQueryResult addBasePrivilegeCollectionItem(PrivilegeCq basePrivilegeCollectionItem) {
    this.basePrivilegeCollection.add(basePrivilegeCollectionItem);
    return this;
  }

  public List<PrivilegeCq> getBasePrivilegeCollection() {
    return basePrivilegeCollection;
  }

  public void setBasePrivilegeCollection(List<PrivilegeCq> basePrivilegeCollection) {
    this.basePrivilegeCollection = basePrivilegeCollection;
  }
}

