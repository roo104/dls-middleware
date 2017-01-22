package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EboksSubscriptionCq implements Serializable {
  @JsonProperty("isSubscribedToEboks")
  private Boolean isSubscribedToEboks = false;

  @JsonProperty("isSubscriptionPossible")
  private Boolean isSubscriptionPossible = false;


  public Boolean getIsSubscribedToEboks() {
    return isSubscribedToEboks;
  }

  public void setIsSubscribedToEboks(Boolean isSubscribedToEboks) {
    this.isSubscribedToEboks = isSubscribedToEboks;
  }

  public Boolean getIsSubscriptionPossible() {
    return isSubscriptionPossible;
  }

  public void setIsSubscriptionPossible(Boolean isSubscriptionPossible) {
    this.isSubscriptionPossible = isSubscriptionPossible;
  }
}

