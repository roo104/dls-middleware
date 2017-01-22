package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RoleInfoCq implements Serializable {
  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("roleIdCq")
  private RoleIdCq roleIdCq = null;


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RoleIdCq getRoleIdCq() {
    return roleIdCq;
  }

  public void setRoleIdCq(RoleIdCq roleIdCq) {
    this.roleIdCq = roleIdCq;
  }
}

