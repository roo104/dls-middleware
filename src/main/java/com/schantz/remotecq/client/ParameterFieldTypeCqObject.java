package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ParameterFieldTypeCqObject implements Serializable {
  @JsonProperty("id")
  private ParameterTypeIdCq id = null;

  @JsonProperty("isAllowNull")
  private Boolean isAllowNull = false;


  public ParameterTypeIdCq getId() {
    return id;
  }

  public void setId(ParameterTypeIdCq id) {
    this.id = id;
  }

  public Boolean getIsAllowNull() {
    return isAllowNull;
  }

  public void setIsAllowNull(Boolean isAllowNull) {
    this.isAllowNull = isAllowNull;
  }
}

