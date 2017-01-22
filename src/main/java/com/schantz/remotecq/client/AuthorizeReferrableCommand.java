package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AuthorizeReferrableCommand implements Serializable {
  @JsonProperty("authorizeReferrableCqCollection")
  private List<AuthorizeReferrableCq> authorizeReferrableCqCollection = new ArrayList<AuthorizeReferrableCq>();

  public AuthorizeReferrableCommand addAuthorizeReferrableCqCollectionItem(AuthorizeReferrableCq authorizeReferrableCqCollectionItem) {
    this.authorizeReferrableCqCollection.add(authorizeReferrableCqCollectionItem);
    return this;
  }

  public List<AuthorizeReferrableCq> getAuthorizeReferrableCqCollection() {
    return authorizeReferrableCqCollection;
  }

  public void setAuthorizeReferrableCqCollection(List<AuthorizeReferrableCq> authorizeReferrableCqCollection) {
    this.authorizeReferrableCqCollection = authorizeReferrableCqCollection;
  }
}

