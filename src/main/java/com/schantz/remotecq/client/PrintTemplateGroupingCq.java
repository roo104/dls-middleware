package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PrintTemplateGroupingCq implements Serializable {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("childCollection")
  private List<PrintTemplateGroupingCq> childCollection = new ArrayList<PrintTemplateGroupingCq>();

  @JsonProperty("printTemplateGroupingIdCq")
  private PrintTemplateGroupingIdCq printTemplateGroupingIdCq = null;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public PrintTemplateGroupingCq addChildCollectionItem(PrintTemplateGroupingCq childCollectionItem) {
    this.childCollection.add(childCollectionItem);
    return this;
  }

  public List<PrintTemplateGroupingCq> getChildCollection() {
    return childCollection;
  }

  public void setChildCollection(List<PrintTemplateGroupingCq> childCollection) {
    this.childCollection = childCollection;
  }

  public PrintTemplateGroupingIdCq getPrintTemplateGroupingIdCq() {
    return printTemplateGroupingIdCq;
  }

  public void setPrintTemplateGroupingIdCq(PrintTemplateGroupingIdCq printTemplateGroupingIdCq) {
    this.printTemplateGroupingIdCq = printTemplateGroupingIdCq;
  }
}

