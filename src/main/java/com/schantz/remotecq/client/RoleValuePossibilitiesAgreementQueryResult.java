package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RoleValuePossibilitiesAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("roleValuePossibilitiesEntryCollection")
  private List<RoleValuePossibilitiesEntry> roleValuePossibilitiesEntryCollection = new ArrayList<RoleValuePossibilitiesEntry>();

  public RoleValuePossibilitiesAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RoleValuePossibilitiesAgreementQueryResult addRoleValuePossibilitiesEntryCollectionItem(RoleValuePossibilitiesEntry roleValuePossibilitiesEntryCollectionItem) {
    this.roleValuePossibilitiesEntryCollection.add(roleValuePossibilitiesEntryCollectionItem);
    return this;
  }

  public List<RoleValuePossibilitiesEntry> getRoleValuePossibilitiesEntryCollection() {
    return roleValuePossibilitiesEntryCollection;
  }

  public void setRoleValuePossibilitiesEntryCollection(List<RoleValuePossibilitiesEntry> roleValuePossibilitiesEntryCollection) {
    this.roleValuePossibilitiesEntryCollection = roleValuePossibilitiesEntryCollection;
  }
}

