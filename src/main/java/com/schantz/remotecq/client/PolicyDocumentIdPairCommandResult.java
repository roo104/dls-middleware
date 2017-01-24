package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyDocumentIdPairCommandResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("statusMessages")
	private List<CommandStatusMessage> statusMessages = new ArrayList<CommandStatusMessage>();
	
	@JsonProperty("identifierA")
	private PolicyIdCq identifierA = null;
	
	@JsonProperty("identifierB")
	private DocumentIdCq identifierB = null;
	
	public PolicyDocumentIdPairCommandResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PolicyDocumentIdPairCommandResult addStatusMessagesItem(CommandStatusMessage statusMessagesItem) {
		this.statusMessages.add(statusMessagesItem);
		return this;
	}
	
	public List<CommandStatusMessage> getStatusMessages() {
		return statusMessages;
	}
	
	public void setStatusMessages(List<CommandStatusMessage> statusMessages) {
		this.statusMessages = statusMessages;
	}
	
	public PolicyIdCq getIdentifierA() {
		return identifierA;
	}
	
	public void setIdentifierA(PolicyIdCq identifierA) {
		this.identifierA = identifierA;
	}
	
	public DocumentIdCq getIdentifierB() {
		return identifierB;
	}
	
	public void setIdentifierB(DocumentIdCq identifierB) {
		this.identifierB = identifierB;
	}
}

