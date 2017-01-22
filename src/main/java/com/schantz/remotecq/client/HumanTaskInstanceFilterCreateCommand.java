package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HumanTaskInstanceFilterCreateCommand implements Serializable {
  @JsonProperty("humanTaskInstanceFilterCq")
  private HumanTaskInstanceFilterCq humanTaskInstanceFilterCq = null;


  public HumanTaskInstanceFilterCq getHumanTaskInstanceFilterCq() {
    return humanTaskInstanceFilterCq;
  }

  public void setHumanTaskInstanceFilterCq(HumanTaskInstanceFilterCq humanTaskInstanceFilterCq) {
    this.humanTaskInstanceFilterCq = humanTaskInstanceFilterCq;
  }
}

