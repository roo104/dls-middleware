package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DocumentInfoCq implements Serializable {
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("documentName")
	private String documentName = null;
	
	@JsonProperty("fileName")
	private String fileName = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("documentIdCq")
	private DocumentIdCq documentIdCq = null;
	
	@JsonProperty("documentMetaDataCqCollection")
	private List<DocumentMetaDataCq> documentMetaDataCqCollection = new ArrayList<DocumentMetaDataCq>();
	
	@JsonProperty("mimeTypeCq")
	private String mimeTypeCq = null;
	
	@JsonProperty("composedOfCollection")
	private List<DocumentInfoCq> composedOfCollection = new ArrayList<DocumentInfoCq>();
	
	@JsonProperty("createdFromTemplate")
	private PrintTemplateVersionIdCq createdFromTemplate = null;
	
	@JsonProperty("beforeCaseworkerEdit")
	private DocumentInfoCq beforeCaseworkerEdit = null;
	
	@JsonProperty("shadowDocument")
	private DocumentInfoCq shadowDocument = null;
	
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getDocumentName() {
		return documentName;
	}
	
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public DocumentIdCq getDocumentIdCq() {
		return documentIdCq;
	}
	
	public void setDocumentIdCq(DocumentIdCq documentIdCq) {
		this.documentIdCq = documentIdCq;
	}
	
	public DocumentInfoCq addDocumentMetaDataCqCollectionItem(DocumentMetaDataCq documentMetaDataCqCollectionItem) {
		this.documentMetaDataCqCollection.add(documentMetaDataCqCollectionItem);
		return this;
	}
	
	public List<DocumentMetaDataCq> getDocumentMetaDataCqCollection() {
		return documentMetaDataCqCollection;
	}
	
	public void setDocumentMetaDataCqCollection(List<DocumentMetaDataCq> documentMetaDataCqCollection) {
		this.documentMetaDataCqCollection = documentMetaDataCqCollection;
	}
	
	public String getMimeTypeCq() {
		return mimeTypeCq;
	}
	
	public void setMimeTypeCq(String mimeTypeCq) {
		this.mimeTypeCq = mimeTypeCq;
	}
	
	public DocumentInfoCq addComposedOfCollectionItem(DocumentInfoCq composedOfCollectionItem) {
		this.composedOfCollection.add(composedOfCollectionItem);
		return this;
	}
	
	public List<DocumentInfoCq> getComposedOfCollection() {
		return composedOfCollection;
	}
	
	public void setComposedOfCollection(List<DocumentInfoCq> composedOfCollection) {
		this.composedOfCollection = composedOfCollection;
	}
	
	public PrintTemplateVersionIdCq getCreatedFromTemplate() {
		return createdFromTemplate;
	}
	
	public void setCreatedFromTemplate(PrintTemplateVersionIdCq createdFromTemplate) {
		this.createdFromTemplate = createdFromTemplate;
	}
	
	public DocumentInfoCq getBeforeCaseworkerEdit() {
		return beforeCaseworkerEdit;
	}
	
	public void setBeforeCaseworkerEdit(DocumentInfoCq beforeCaseworkerEdit) {
		this.beforeCaseworkerEdit = beforeCaseworkerEdit;
	}
	
	public DocumentInfoCq getShadowDocument() {
		return shadowDocument;
	}
	
	public void setShadowDocument(DocumentInfoCq shadowDocument) {
		this.shadowDocument = shadowDocument;
	}
}

