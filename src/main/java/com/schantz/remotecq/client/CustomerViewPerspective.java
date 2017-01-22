package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewPerspective implements Serializable {
  @JsonProperty("showAdditionalCovers")
  private Boolean showAdditionalCovers = false;

  @JsonProperty("showFinishedCovers")
  private Boolean showFinishedCovers = false;

  @JsonProperty("categoryCollection")
  private List<CustomerViewCategoryObject> categoryCollection = new ArrayList<CustomerViewCategoryObject>();

  @JsonProperty("triggerCollection")
  private List<String> triggerCollection = new ArrayList<String>();

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("customerViewPerspectiveGroupingType")
  private String customerViewPerspectiveGroupingType = null;


  public Boolean getShowAdditionalCovers() {
    return showAdditionalCovers;
  }

  public void setShowAdditionalCovers(Boolean showAdditionalCovers) {
    this.showAdditionalCovers = showAdditionalCovers;
  }

  public Boolean getShowFinishedCovers() {
    return showFinishedCovers;
  }

  public void setShowFinishedCovers(Boolean showFinishedCovers) {
    this.showFinishedCovers = showFinishedCovers;
  }
  public CustomerViewPerspective addCategoryCollectionItem(CustomerViewCategoryObject categoryCollectionItem) {
    this.categoryCollection.add(categoryCollectionItem);
    return this;
  }

  public List<CustomerViewCategoryObject> getCategoryCollection() {
    return categoryCollection;
  }

  public void setCategoryCollection(List<CustomerViewCategoryObject> categoryCollection) {
    this.categoryCollection = categoryCollection;
  }
  public CustomerViewPerspective addTriggerCollectionItem(String triggerCollectionItem) {
    this.triggerCollection.add(triggerCollectionItem);
    return this;
  }

  public List<String> getTriggerCollection() {
    return triggerCollection;
  }

  public void setTriggerCollection(List<String> triggerCollection) {
    this.triggerCollection = triggerCollection;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCustomerViewPerspectiveGroupingType() {
    return customerViewPerspectiveGroupingType;
  }

  public void setCustomerViewPerspectiveGroupingType(String customerViewPerspectiveGroupingType) {
    this.customerViewPerspectiveGroupingType = customerViewPerspectiveGroupingType;
  }
}

