package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSaveCompanyContactCommand implements Serializable {
  @JsonProperty("topCompanyContactCq")
  private TopCompanyContactCq topCompanyContactCq = null;

  @JsonProperty("topCompanyIdCq")
  private TopCompanyIdCq topCompanyIdCq = null;


  public TopCompanyContactCq getTopCompanyContactCq() {
    return topCompanyContactCq;
  }

  public void setTopCompanyContactCq(TopCompanyContactCq topCompanyContactCq) {
    this.topCompanyContactCq = topCompanyContactCq;
  }

  public TopCompanyIdCq getTopCompanyIdCq() {
    return topCompanyIdCq;
  }

  public void setTopCompanyIdCq(TopCompanyIdCq topCompanyIdCq) {
    this.topCompanyIdCq = topCompanyIdCq;
  }
}

