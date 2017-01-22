package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RoleCq implements Serializable {
  @JsonProperty("roleIdCq")
  private RoleIdCq roleIdCq = null;

  @JsonProperty("privilegeCqCollection")
  private List<PrivilegeCq> privilegeCqCollection = new ArrayList<PrivilegeCq>();


  public RoleIdCq getRoleIdCq() {
    return roleIdCq;
  }

  public void setRoleIdCq(RoleIdCq roleIdCq) {
    this.roleIdCq = roleIdCq;
  }
  public RoleCq addPrivilegeCqCollectionItem(PrivilegeCq privilegeCqCollectionItem) {
    this.privilegeCqCollection.add(privilegeCqCollectionItem);
    return this;
  }

  public List<PrivilegeCq> getPrivilegeCqCollection() {
    return privilegeCqCollection;
  }

  public void setPrivilegeCqCollection(List<PrivilegeCq> privilegeCqCollection) {
    this.privilegeCqCollection = privilegeCqCollection;
  }
}

