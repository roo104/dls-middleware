package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopLegalPartySearchEntry implements Serializable {
  @JsonProperty("gtiInteressentNr")
  private String gtiInteressentNr = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("postalCodeAndCity")
  private String postalCodeAndCity = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("matchedByKey")
  private String matchedByKey = null;

  @JsonProperty("supplementaryText")
  private String supplementaryText = null;

  @JsonProperty("registration")
  private String registration = null;

  @JsonProperty("idCq")
  private IdCq idCq = null;

  @JsonProperty("topLegalPartyTypeCq")
  private String topLegalPartyTypeCq = null;


  public String getGtiInteressentNr() {
    return gtiInteressentNr;
  }

  public void setGtiInteressentNr(String gtiInteressentNr) {
    this.gtiInteressentNr = gtiInteressentNr;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostalCodeAndCity() {
    return postalCodeAndCity;
  }

  public void setPostalCodeAndCity(String postalCodeAndCity) {
    this.postalCodeAndCity = postalCodeAndCity;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getMatchedByKey() {
    return matchedByKey;
  }

  public void setMatchedByKey(String matchedByKey) {
    this.matchedByKey = matchedByKey;
  }

  public String getSupplementaryText() {
    return supplementaryText;
  }

  public void setSupplementaryText(String supplementaryText) {
    this.supplementaryText = supplementaryText;
  }

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public IdCq getIdCq() {
    return idCq;
  }

  public void setIdCq(IdCq idCq) {
    this.idCq = idCq;
  }

  public String getTopLegalPartyTypeCq() {
    return topLegalPartyTypeCq;
  }

  public void setTopLegalPartyTypeCq(String topLegalPartyTypeCq) {
    this.topLegalPartyTypeCq = topLegalPartyTypeCq;
  }
}

