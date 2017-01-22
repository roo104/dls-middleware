package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RoleValuePossibilitiesEntry implements Serializable {
  @JsonProperty("commissionReceiverIdCq")
  private CommissionReceiverIdCq commissionReceiverIdCq = null;

  @JsonProperty("userInfoCq")
  private UserInfoCq userInfoCq = null;

  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;


  public CommissionReceiverIdCq getCommissionReceiverIdCq() {
    return commissionReceiverIdCq;
  }

  public void setCommissionReceiverIdCq(CommissionReceiverIdCq commissionReceiverIdCq) {
    this.commissionReceiverIdCq = commissionReceiverIdCq;
  }

  public UserInfoCq getUserInfoCq() {
    return userInfoCq;
  }

  public void setUserInfoCq(UserInfoCq userInfoCq) {
    this.userInfoCq = userInfoCq;
  }

  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }
}

