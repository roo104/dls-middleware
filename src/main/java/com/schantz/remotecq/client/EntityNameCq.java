package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EntityNameCq implements Serializable {
  @JsonProperty("defaultName")
  private String defaultName = null;

  @JsonProperty("namedProductEntityUid")
  private String namedProductEntityUid = null;

  @JsonProperty("translationCollection")
  private List<EntityNameTranslationCq> translationCollection = new ArrayList<EntityNameTranslationCq>();


  public String getDefaultName() {
    return defaultName;
  }

  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }

  public String getNamedProductEntityUid() {
    return namedProductEntityUid;
  }

  public void setNamedProductEntityUid(String namedProductEntityUid) {
    this.namedProductEntityUid = namedProductEntityUid;
  }
  public EntityNameCq addTranslationCollectionItem(EntityNameTranslationCq translationCollectionItem) {
    this.translationCollection.add(translationCollectionItem);
    return this;
  }

  public List<EntityNameTranslationCq> getTranslationCollection() {
    return translationCollection;
  }

  public void setTranslationCollection(List<EntityNameTranslationCq> translationCollection) {
    this.translationCollection = translationCollection;
  }
}

