package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CprInfoCq implements Serializable {
  @JsonProperty("currentPersonNumber")
  private String currentPersonNumber = null;

  @JsonProperty("updated")
  private LocalDate updated = null;

  @JsonProperty("paternalisticDate")
  private LocalDate paternalisticDate = null;

  @JsonProperty("dontWantAdvertisements")
  private LocalDate dontWantAdvertisements = null;

  @JsonProperty("addressProtection")
  private LocalDate addressProtection = null;

  @JsonProperty("isDontAutoupdateAddresses")
  private Boolean isDontAutoupdateAddresses = false;

  @JsonProperty("isSubscriptionInForce")
  private Boolean isSubscriptionInForce = false;

  @JsonProperty("isDontWantSubscription")
  private Boolean isDontWantSubscription = false;


  public String getCurrentPersonNumber() {
    return currentPersonNumber;
  }

  public void setCurrentPersonNumber(String currentPersonNumber) {
    this.currentPersonNumber = currentPersonNumber;
  }

  public LocalDate getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDate updated) {
    this.updated = updated;
  }

  public LocalDate getPaternalisticDate() {
    return paternalisticDate;
  }

  public void setPaternalisticDate(LocalDate paternalisticDate) {
    this.paternalisticDate = paternalisticDate;
  }

  public LocalDate getDontWantAdvertisements() {
    return dontWantAdvertisements;
  }

  public void setDontWantAdvertisements(LocalDate dontWantAdvertisements) {
    this.dontWantAdvertisements = dontWantAdvertisements;
  }

  public LocalDate getAddressProtection() {
    return addressProtection;
  }

  public void setAddressProtection(LocalDate addressProtection) {
    this.addressProtection = addressProtection;
  }

  public Boolean getIsDontAutoupdateAddresses() {
    return isDontAutoupdateAddresses;
  }

  public void setIsDontAutoupdateAddresses(Boolean isDontAutoupdateAddresses) {
    this.isDontAutoupdateAddresses = isDontAutoupdateAddresses;
  }

  public Boolean getIsSubscriptionInForce() {
    return isSubscriptionInForce;
  }

  public void setIsSubscriptionInForce(Boolean isSubscriptionInForce) {
    this.isSubscriptionInForce = isSubscriptionInForce;
  }

  public Boolean getIsDontWantSubscription() {
    return isDontWantSubscription;
  }

  public void setIsDontWantSubscription(Boolean isDontWantSubscription) {
    this.isDontWantSubscription = isDontWantSubscription;
  }
}

