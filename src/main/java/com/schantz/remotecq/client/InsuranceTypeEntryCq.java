package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class InsuranceTypeEntryCq implements Serializable {
  @JsonProperty("level")
  private CqMessageKey level = null;

  @JsonProperty("profile")
  private CqMessageKey profile = null;

  @JsonProperty("insuranceTypeCq")
  private String insuranceTypeCq = null;

  @JsonProperty("entityNameCq")
  private EntityNameCq entityNameCq = null;


  public CqMessageKey getLevel() {
    return level;
  }

  public void setLevel(CqMessageKey level) {
    this.level = level;
  }

  public CqMessageKey getProfile() {
    return profile;
  }

  public void setProfile(CqMessageKey profile) {
    this.profile = profile;
  }

  public String getInsuranceTypeCq() {
    return insuranceTypeCq;
  }

  public void setInsuranceTypeCq(String insuranceTypeCq) {
    this.insuranceTypeCq = insuranceTypeCq;
  }

  public EntityNameCq getEntityNameCq() {
    return entityNameCq;
  }

  public void setEntityNameCq(EntityNameCq entityNameCq) {
    this.entityNameCq = entityNameCq;
  }
}

