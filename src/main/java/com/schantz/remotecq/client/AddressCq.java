package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AddressCq implements Serializable {
  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("zipCodeDescription")
  private String zipCodeDescription = null;

  @JsonProperty("co")
  private String co = null;

  @JsonProperty("att")
  private String att = null;

  @JsonProperty("addressTypeCq")
  private String addressTypeCq = null;

  @JsonProperty("countryIso3Cq")
  private String countryIso3Cq = null;


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getZipCodeDescription() {
    return zipCodeDescription;
  }

  public void setZipCodeDescription(String zipCodeDescription) {
    this.zipCodeDescription = zipCodeDescription;
  }

  public String getCo() {
    return co;
  }

  public void setCo(String co) {
    this.co = co;
  }

  public String getAtt() {
    return att;
  }

  public void setAtt(String att) {
    this.att = att;
  }

  public String getAddressTypeCq() {
    return addressTypeCq;
  }

  public void setAddressTypeCq(String addressTypeCq) {
    this.addressTypeCq = addressTypeCq;
  }

  public String getCountryIso3Cq() {
    return countryIso3Cq;
  }

  public void setCountryIso3Cq(String countryIso3Cq) {
    this.countryIso3Cq = countryIso3Cq;
  }
}

