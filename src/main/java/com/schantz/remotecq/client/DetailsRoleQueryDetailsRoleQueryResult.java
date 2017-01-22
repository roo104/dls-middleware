package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class DetailsRoleQueryDetailsRoleQueryResult implements Serializable {
  @JsonProperty("roleIdCq")
  private RoleIdCq roleIdCq = null;


  public RoleIdCq getRoleIdCq() {
    return roleIdCq;
  }

  public void setRoleIdCq(RoleIdCq roleIdCq) {
    this.roleIdCq = roleIdCq;
  }
}

