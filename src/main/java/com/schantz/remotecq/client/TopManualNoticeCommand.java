package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopManualNoticeCommand implements Serializable {
  @JsonProperty("noticeIdCq")
  private NoticeIdCq noticeIdCq = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("noticeSubTypeCq")
  private String noticeSubTypeCq = null;


  public NoticeIdCq getNoticeIdCq() {
    return noticeIdCq;
  }

  public void setNoticeIdCq(NoticeIdCq noticeIdCq) {
    this.noticeIdCq = noticeIdCq;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getNoticeSubTypeCq() {
    return noticeSubTypeCq;
  }

  public void setNoticeSubTypeCq(String noticeSubTypeCq) {
    this.noticeSubTypeCq = noticeSubTypeCq;
  }
}

