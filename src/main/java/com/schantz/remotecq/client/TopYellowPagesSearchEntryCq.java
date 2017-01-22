package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopYellowPagesSearchEntryCq implements Serializable {
  @JsonProperty("zipcode")
  private String zipcode = null;

  @JsonProperty("streetname")
  private String streetname = null;

  @JsonProperty("district")
  private String district = null;

  @JsonProperty("village")
  private String village = null;


  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getStreetname() {
    return streetname;
  }

  public void setStreetname(String streetname) {
    this.streetname = streetname;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getVillage() {
    return village;
  }

  public void setVillage(String village) {
    this.village = village;
  }
}

