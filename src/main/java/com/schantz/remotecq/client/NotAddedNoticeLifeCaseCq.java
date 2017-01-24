package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class NotAddedNoticeLifeCaseCq implements Serializable {
	@JsonProperty("noticeCq")
	private NoticeCq noticeCq = null;
	
	@JsonProperty("idCqCollection")
	private List<IdCq> idCqCollection = new ArrayList<IdCq>();
	
	
	public NoticeCq getNoticeCq() {
		return noticeCq;
	}
	
	public void setNoticeCq(NoticeCq noticeCq) {
		this.noticeCq = noticeCq;
	}
	
	public NotAddedNoticeLifeCaseCq addIdCqCollectionItem(IdCq idCqCollectionItem) {
		this.idCqCollection.add(idCqCollectionItem);
		return this;
	}
	
	public List<IdCq> getIdCqCollection() {
		return idCqCollection;
	}
	
	public void setIdCqCollection(List<IdCq> idCqCollection) {
		this.idCqCollection = idCqCollection;
	}
}

