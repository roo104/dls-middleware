package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TemplateDetailsPrintQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("printTemplateCq")
  private PrintTemplateCq printTemplateCq = null;

  public TemplateDetailsPrintQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public PrintTemplateCq getPrintTemplateCq() {
    return printTemplateCq;
  }

  public void setPrintTemplateCq(PrintTemplateCq printTemplateCq) {
    this.printTemplateCq = printTemplateCq;
  }
}

