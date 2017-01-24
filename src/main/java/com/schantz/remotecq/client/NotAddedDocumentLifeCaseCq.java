package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class NotAddedDocumentLifeCaseCq implements Serializable {
	@JsonProperty("documentInfoCq")
	private DocumentInfoCq documentInfoCq = null;
	
	@JsonProperty("idCqCollection")
	private List<IdCq> idCqCollection = new ArrayList<IdCq>();
	
	
	public DocumentInfoCq getDocumentInfoCq() {
		return documentInfoCq;
	}
	
	public void setDocumentInfoCq(DocumentInfoCq documentInfoCq) {
		this.documentInfoCq = documentInfoCq;
	}
	
	public NotAddedDocumentLifeCaseCq addIdCqCollectionItem(IdCq idCqCollectionItem) {
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

