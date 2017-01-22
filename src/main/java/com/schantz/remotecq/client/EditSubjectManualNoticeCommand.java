package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class EditSubjectManualNoticeCommand implements Serializable {
  @JsonProperty("noticeIdCq")
  private NoticeIdCq noticeIdCq = null;

  @JsonProperty("subject")
  private String subject = null;


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
}

