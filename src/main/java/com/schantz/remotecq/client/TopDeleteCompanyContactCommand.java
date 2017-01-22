package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopDeleteCompanyContactCommand implements Serializable {
  @JsonProperty("topCompanyContactIdCq")
  private TopCompanyContactIdCq topCompanyContactIdCq = null;


  public TopCompanyContactIdCq getTopCompanyContactIdCq() {
    return topCompanyContactIdCq;
  }

  public void setTopCompanyContactIdCq(TopCompanyContactIdCq topCompanyContactIdCq) {
    this.topCompanyContactIdCq = topCompanyContactIdCq;
  }
}

