package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RemovePrivilegeRoleCommand implements Serializable {
  @JsonProperty("roleIdCq")
  private RoleIdCq roleIdCq = null;

  @JsonProperty("removeMeCollection")
  private List<PrivilegeIdCq> removeMeCollection = new ArrayList<PrivilegeIdCq>();


  public RoleIdCq getRoleIdCq() {
    return roleIdCq;
  }

  public void setRoleIdCq(RoleIdCq roleIdCq) {
    this.roleIdCq = roleIdCq;
  }
  public RemovePrivilegeRoleCommand addRemoveMeCollectionItem(PrivilegeIdCq removeMeCollectionItem) {
    this.removeMeCollection.add(removeMeCollectionItem);
    return this;
  }

  public List<PrivilegeIdCq> getRemoveMeCollection() {
    return removeMeCollection;
  }

  public void setRemoveMeCollection(List<PrivilegeIdCq> removeMeCollection) {
    this.removeMeCollection = removeMeCollection;
  }
}

