package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementPackageIdCq implements Serializable {
  @JsonProperty("packageId")
  private String packageId = null;

  @JsonProperty("agreementVersionIdCq")
  private AgreementVersionIdCq agreementVersionIdCq = null;

  @JsonProperty("packageName")
  private EntityNameCq packageName = null;


  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public AgreementVersionIdCq getAgreementVersionIdCq() {
    return agreementVersionIdCq;
  }

  public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
    this.agreementVersionIdCq = agreementVersionIdCq;
  }

  public EntityNameCq getPackageName() {
    return packageName;
  }

  public void setPackageName(EntityNameCq packageName) {
    this.packageName = packageName;
  }
}

