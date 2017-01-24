package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ManualReceivableBatchCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("totalAmount")
	private Double totalAmount = null;
	
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("entryCount")
	private Long entryCount = null;
	
	@JsonProperty("deliveryNumber")
	private String deliveryNumber = null;
	
	@JsonProperty("receivedDate")
	private LocalDate receivedDate = null;
	
	@JsonProperty("balanced")
	private Boolean balanced = false;
	
	@JsonProperty("externalCreateDate")
	private LocalDate externalCreateDate = null;
	
	@JsonProperty("receivableBatchIdCq")
	private ReceivableBatchIdCq receivableBatchIdCq = null;
	
	@JsonProperty("manualPaymentEntryCqCollection")
	private List<ManualPaymentEntryCq> manualPaymentEntryCqCollection = new ArrayList<ManualPaymentEntryCq>();
	
	@JsonProperty("manualPaymentStatusCq")
	private String manualPaymentStatusCq = null;
	
	
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
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public LocalDate getValueDate() {
		return valueDate;
	}
	
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	
	public Long getEntryCount() {
		return entryCount;
	}
	
	public void setEntryCount(Long entryCount) {
		this.entryCount = entryCount;
	}
	
	public String getDeliveryNumber() {
		return deliveryNumber;
	}
	
	public void setDeliveryNumber(String deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	
	public LocalDate getReceivedDate() {
		return receivedDate;
	}
	
	public void setReceivedDate(LocalDate receivedDate) {
		this.receivedDate = receivedDate;
	}
	
	public Boolean getBalanced() {
		return balanced;
	}
	
	public void setBalanced(Boolean balanced) {
		this.balanced = balanced;
	}
	
	public LocalDate getExternalCreateDate() {
		return externalCreateDate;
	}
	
	public void setExternalCreateDate(LocalDate externalCreateDate) {
		this.externalCreateDate = externalCreateDate;
	}
	
	public ReceivableBatchIdCq getReceivableBatchIdCq() {
		return receivableBatchIdCq;
	}
	
	public void setReceivableBatchIdCq(ReceivableBatchIdCq receivableBatchIdCq) {
		this.receivableBatchIdCq = receivableBatchIdCq;
	}
	
	public ManualReceivableBatchCq addManualPaymentEntryCqCollectionItem(ManualPaymentEntryCq manualPaymentEntryCqCollectionItem) {
		this.manualPaymentEntryCqCollection.add(manualPaymentEntryCqCollectionItem);
		return this;
	}
	
	public List<ManualPaymentEntryCq> getManualPaymentEntryCqCollection() {
		return manualPaymentEntryCqCollection;
	}
	
	public void setManualPaymentEntryCqCollection(List<ManualPaymentEntryCq> manualPaymentEntryCqCollection) {
		this.manualPaymentEntryCqCollection = manualPaymentEntryCqCollection;
	}
	
	public String getManualPaymentStatusCq() {
		return manualPaymentStatusCq;
	}
	
	public void setManualPaymentStatusCq(String manualPaymentStatusCq) {
		this.manualPaymentStatusCq = manualPaymentStatusCq;
	}
}

