package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class QueueMessageCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("messageBody")
	private String messageBody = null;
	
	@JsonProperty("queuedClass")
	private String queuedClass = null;
	
	@JsonProperty("queueMessageIdCq")
	private QueueMessageIdCq queueMessageIdCq = null;
	
	@JsonProperty("operationHistoryCollection")
	private List<QueueOperationCq> operationHistoryCollection = new ArrayList<QueueOperationCq>();
	
	@JsonProperty("lastOperation")
	private QueueOperationCq lastOperation = null;
	
	
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
	
	public String getMessageBody() {
		return messageBody;
	}
	
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	
	public String getQueuedClass() {
		return queuedClass;
	}
	
	public void setQueuedClass(String queuedClass) {
		this.queuedClass = queuedClass;
	}
	
	public QueueMessageIdCq getQueueMessageIdCq() {
		return queueMessageIdCq;
	}
	
	public void setQueueMessageIdCq(QueueMessageIdCq queueMessageIdCq) {
		this.queueMessageIdCq = queueMessageIdCq;
	}
	
	public QueueMessageCq addOperationHistoryCollectionItem(QueueOperationCq operationHistoryCollectionItem) {
		this.operationHistoryCollection.add(operationHistoryCollectionItem);
		return this;
	}
	
	public List<QueueOperationCq> getOperationHistoryCollection() {
		return operationHistoryCollection;
	}
	
	public void setOperationHistoryCollection(List<QueueOperationCq> operationHistoryCollection) {
		this.operationHistoryCollection = operationHistoryCollection;
	}
	
	public QueueOperationCq getLastOperation() {
		return lastOperation;
	}
	
	public void setLastOperation(QueueOperationCq lastOperation) {
		this.lastOperation = lastOperation;
	}
}

