package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EventCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("transTime")
	private OffsetDateTime transTime = null;
	
	@JsonProperty("systemGenerated")
	private Boolean systemGenerated = false;
	
	@JsonProperty("included")
	private Boolean included = false;
	
	@JsonProperty("locked")
	private Boolean locked = false;
	
	@JsonProperty("cancelUser")
	private String cancelUser = null;
	
	@JsonProperty("validationOverridesPresent")
	private Boolean validationOverridesPresent = false;
	
	@JsonProperty("eventManipulateRightsCq")
	private EventManipulateRightsCq eventManipulateRightsCq = null;
	
	@JsonProperty("subEventTransCollection")
	private List<SubEventTransCq> subEventTransCollection = new ArrayList<SubEventTransCq>();
	
	@JsonProperty("lastTransId")
	private EventTransIdCq lastTransId = null;
	
	@JsonProperty("inclusionId")
	private EventInclusionIdCq inclusionId = null;
	
	@JsonProperty("policyId")
	private PolicyIdCq policyId = null;
	
	@JsonProperty("commitWorkpadId")
	private WorkpadIdCq commitWorkpadId = null;
	
	@JsonProperty("lifeEventTypeCq")
	private LifeEventTypeCq lifeEventTypeCq = null;
	
	
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
	
	public LocalDate getEventDate() {
		return eventDate;
	}
	
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	
	public OffsetDateTime getTransTime() {
		return transTime;
	}
	
	public void setTransTime(OffsetDateTime transTime) {
		this.transTime = transTime;
	}
	
	public Boolean getSystemGenerated() {
		return systemGenerated;
	}
	
	public void setSystemGenerated(Boolean systemGenerated) {
		this.systemGenerated = systemGenerated;
	}
	
	public Boolean getIncluded() {
		return included;
	}
	
	public void setIncluded(Boolean included) {
		this.included = included;
	}
	
	public Boolean getLocked() {
		return locked;
	}
	
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	
	public String getCancelUser() {
		return cancelUser;
	}
	
	public void setCancelUser(String cancelUser) {
		this.cancelUser = cancelUser;
	}
	
	public Boolean getValidationOverridesPresent() {
		return validationOverridesPresent;
	}
	
	public void setValidationOverridesPresent(Boolean validationOverridesPresent) {
		this.validationOverridesPresent = validationOverridesPresent;
	}
	
	public EventManipulateRightsCq getEventManipulateRightsCq() {
		return eventManipulateRightsCq;
	}
	
	public void setEventManipulateRightsCq(EventManipulateRightsCq eventManipulateRightsCq) {
		this.eventManipulateRightsCq = eventManipulateRightsCq;
	}
	
	public EventCq addSubEventTransCollectionItem(SubEventTransCq subEventTransCollectionItem) {
		this.subEventTransCollection.add(subEventTransCollectionItem);
		return this;
	}
	
	public List<SubEventTransCq> getSubEventTransCollection() {
		return subEventTransCollection;
	}
	
	public void setSubEventTransCollection(List<SubEventTransCq> subEventTransCollection) {
		this.subEventTransCollection = subEventTransCollection;
	}
	
	public EventTransIdCq getLastTransId() {
		return lastTransId;
	}
	
	public void setLastTransId(EventTransIdCq lastTransId) {
		this.lastTransId = lastTransId;
	}
	
	public EventInclusionIdCq getInclusionId() {
		return inclusionId;
	}
	
	public void setInclusionId(EventInclusionIdCq inclusionId) {
		this.inclusionId = inclusionId;
	}
	
	public PolicyIdCq getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(PolicyIdCq policyId) {
		this.policyId = policyId;
	}
	
	public WorkpadIdCq getCommitWorkpadId() {
		return commitWorkpadId;
	}
	
	public void setCommitWorkpadId(WorkpadIdCq commitWorkpadId) {
		this.commitWorkpadId = commitWorkpadId;
	}
	
	public LifeEventTypeCq getLifeEventTypeCq() {
		return lifeEventTypeCq;
	}
	
	public void setLifeEventTypeCq(LifeEventTypeCq lifeEventTypeCq) {
		this.lifeEventTypeCq = lifeEventTypeCq;
	}
}

