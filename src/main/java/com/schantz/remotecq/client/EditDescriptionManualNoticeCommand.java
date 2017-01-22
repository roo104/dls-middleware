package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EditDescriptionManualNoticeCommand implements Serializable {
  @JsonProperty("noticeIdCq")
  private NoticeIdCq noticeIdCq = null;

  @JsonProperty("description")
  private String description = null;


  public NoticeIdCq getNoticeIdCq() {
    return noticeIdCq;
  }

  public void setNoticeIdCq(NoticeIdCq noticeIdCq) {
    this.noticeIdCq = noticeIdCq;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

