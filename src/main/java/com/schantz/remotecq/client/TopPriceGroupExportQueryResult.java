package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopPriceGroupExportQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("data")
  private byte[] data = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  @JsonProperty("isSpreadsheet")
  private Boolean isSpreadsheet = false;

  public TopPriceGroupExportQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

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

  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Boolean getIsSpreadsheet() {
    return isSpreadsheet;
  }

  public void setIsSpreadsheet(Boolean isSpreadsheet) {
    this.isSpreadsheet = isSpreadsheet;
  }
}

