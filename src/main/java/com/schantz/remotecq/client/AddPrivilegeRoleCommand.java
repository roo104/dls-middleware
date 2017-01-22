package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AddPrivilegeRoleCommand implements Serializable {
  @JsonProperty("roleIdCq")
  private RoleIdCq roleIdCq = null;

  @JsonProperty("addMeCollection")
  private List<PrivilegeIdCq> addMeCollection = new ArrayList<PrivilegeIdCq>();


  public RoleIdCq getRoleIdCq() {
    return roleIdCq;
  }

  public void setRoleIdCq(RoleIdCq roleIdCq) {
    this.roleIdCq = roleIdCq;
  }
  public AddPrivilegeRoleCommand addAddMeCollectionItem(PrivilegeIdCq addMeCollectionItem) {
    this.addMeCollection.add(addMeCollectionItem);
    return this;
  }

  public List<PrivilegeIdCq> getAddMeCollection() {
    return addMeCollection;
  }

  public void setAddMeCollection(List<PrivilegeIdCq> addMeCollection) {
    this.addMeCollection = addMeCollection;
  }
}

