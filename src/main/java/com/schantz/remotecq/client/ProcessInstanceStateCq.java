package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ProcessInstanceStateCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("htmlDescription")
	private String htmlDescription = null;
	
	@JsonProperty("htmlDescriptionArgumentsCollection")
	private List<CqMessageKey> htmlDescriptionArgumentsCollection = new ArrayList<CqMessageKey>();
	
	@JsonProperty("processInstanceStateIdCq")
	private ProcessInstanceStateIdCq processInstanceStateIdCq = null;
	
	@JsonProperty("currentState")
	private ProcessInstanceStateStatusChangeCq currentState = null;
	
	@JsonProperty("stateHistoryCollection")
	private List<ProcessInstanceStateStatusChangeCq> stateHistoryCollection = new ArrayList<ProcessInstanceStateStatusChangeCq>();
	
	@JsonProperty("configurationFieldCqCollection")
	private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();
	
	@JsonProperty("attachmentsCollection")
	private List<DocumentInfoCq> attachmentsCollection = new ArrayList<DocumentInfoCq>();
	
	@JsonProperty("processInstanceStateLogCqCollection")
	private List<ProcessInstanceStateLogCq> processInstanceStateLogCqCollection = new ArrayList<ProcessInstanceStateLogCq>();
	
	@JsonProperty("isDone")
	private Boolean isDone = false;
	
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public String getHtmlDescription() {
		return htmlDescription;
	}
	
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}
	
	public ProcessInstanceStateCq addHtmlDescriptionArgumentsCollectionItem(CqMessageKey htmlDescriptionArgumentsCollectionItem) {
		this.htmlDescriptionArgumentsCollection.add(htmlDescriptionArgumentsCollectionItem);
		return this;
	}
	
	public List<CqMessageKey> getHtmlDescriptionArgumentsCollection() {
		return htmlDescriptionArgumentsCollection;
	}
	
	public void setHtmlDescriptionArgumentsCollection(List<CqMessageKey> htmlDescriptionArgumentsCollection) {
		this.htmlDescriptionArgumentsCollection = htmlDescriptionArgumentsCollection;
	}
	
	public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
		return processInstanceStateIdCq;
	}
	
	public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
		this.processInstanceStateIdCq = processInstanceStateIdCq;
	}
	
	public ProcessInstanceStateStatusChangeCq getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(ProcessInstanceStateStatusChangeCq currentState) {
		this.currentState = currentState;
	}
	
	public ProcessInstanceStateCq addStateHistoryCollectionItem(ProcessInstanceStateStatusChangeCq stateHistoryCollectionItem) {
		this.stateHistoryCollection.add(stateHistoryCollectionItem);
		return this;
	}
	
	public List<ProcessInstanceStateStatusChangeCq> getStateHistoryCollection() {
		return stateHistoryCollection;
	}
	
	public void setStateHistoryCollection(List<ProcessInstanceStateStatusChangeCq> stateHistoryCollection) {
		this.stateHistoryCollection = stateHistoryCollection;
	}
	
	public ProcessInstanceStateCq addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
		this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
		return this;
	}
	
	public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
		return configurationFieldCqCollection;
	}
	
	public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
		this.configurationFieldCqCollection = configurationFieldCqCollection;
	}
	
	public ProcessInstanceStateCq addAttachmentsCollectionItem(DocumentInfoCq attachmentsCollectionItem) {
		this.attachmentsCollection.add(attachmentsCollectionItem);
		return this;
	}
	
	public List<DocumentInfoCq> getAttachmentsCollection() {
		return attachmentsCollection;
	}
	
	public void setAttachmentsCollection(List<DocumentInfoCq> attachmentsCollection) {
		this.attachmentsCollection = attachmentsCollection;
	}
	
	public ProcessInstanceStateCq addProcessInstanceStateLogCqCollectionItem(ProcessInstanceStateLogCq processInstanceStateLogCqCollectionItem) {
		this.processInstanceStateLogCqCollection.add(processInstanceStateLogCqCollectionItem);
		return this;
	}
	
	public List<ProcessInstanceStateLogCq> getProcessInstanceStateLogCqCollection() {
		return processInstanceStateLogCqCollection;
	}
	
	public void setProcessInstanceStateLogCqCollection(List<ProcessInstanceStateLogCq> processInstanceStateLogCqCollection) {
		this.processInstanceStateLogCqCollection = processInstanceStateLogCqCollection;
	}
	
	public Boolean getIsDone() {
		return isDone;
	}
	
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}
}

