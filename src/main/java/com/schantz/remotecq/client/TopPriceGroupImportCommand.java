package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopPriceGroupImportCommand implements Serializable {
  @JsonProperty("data")
  private byte[] data = null;

  @JsonProperty("fileName")
  private String fileName = null;


  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
}

