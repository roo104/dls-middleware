package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class AcceptFundDraftCommand implements Serializable {
  @JsonProperty("draftId")
  private FundVersionIdCq draftId = null;


  public FundVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(FundVersionIdCq draftId) {
    this.draftId = draftId;
  }
}

