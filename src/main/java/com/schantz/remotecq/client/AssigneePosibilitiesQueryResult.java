package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AssigneePosibilitiesQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("userInfoCqCollection")
  private List<UserInfoCq> userInfoCqCollection = new ArrayList<UserInfoCq>();

  public AssigneePosibilitiesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public AssigneePosibilitiesQueryResult addUserInfoCqCollectionItem(UserInfoCq userInfoCqCollectionItem) {
    this.userInfoCqCollection.add(userInfoCqCollectionItem);
    return this;
  }

  public List<UserInfoCq> getUserInfoCqCollection() {
    return userInfoCqCollection;
  }

  public void setUserInfoCqCollection(List<UserInfoCq> userInfoCqCollection) {
    this.userInfoCqCollection = userInfoCqCollection;
  }
}

