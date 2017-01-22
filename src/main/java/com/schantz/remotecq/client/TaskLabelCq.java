package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TaskLabelCq implements Serializable {
  @JsonProperty("labelText")
  private String labelText = null;


  public String getLabelText() {
    return labelText;
  }

  public void setLabelText(String labelText) {
    this.labelText = labelText;
  }
}

