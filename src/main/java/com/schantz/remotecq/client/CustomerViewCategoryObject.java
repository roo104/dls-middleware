package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewCategoryObject implements Serializable {
  @JsonProperty("title")
  private CqMessageKey title = null;

  @JsonProperty("mainCategory")
  private Boolean mainCategory = false;

  @JsonProperty("type")
  private String type = null;


  public CqMessageKey getTitle() {
    return title;
  }

  public void setTitle(CqMessageKey title) {
    this.title = title;
  }

  public Boolean getMainCategory() {
    return mainCategory;
  }

  public void setMainCategory(Boolean mainCategory) {
    this.mainCategory = mainCategory;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

