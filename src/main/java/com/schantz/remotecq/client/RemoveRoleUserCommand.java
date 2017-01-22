package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class RemoveRoleUserCommand implements Serializable {
  @JsonProperty("userIdCq")
  private UserIdCq userIdCq = null;

  @JsonProperty("roleIdCq")
  private RoleIdCq roleIdCq = null;


  public UserIdCq getUserIdCq() {
    return userIdCq;
  }

  public void setUserIdCq(UserIdCq userIdCq) {
    this.userIdCq = userIdCq;
  }

  public RoleIdCq getRoleIdCq() {
    return roleIdCq;
  }

  public void setRoleIdCq(RoleIdCq roleIdCq) {
    this.roleIdCq = roleIdCq;
  }
}

