package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LoginIdPairCommandResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("statusMessages")
	private List<CommandStatusMessage> statusMessages = new ArrayList<CommandStatusMessage>();
	
	@JsonProperty("identifierA")
	private SessionTokenIdCq identifierA = null;
	
	@JsonProperty("identifierB")
	private UserIdCq identifierB = null;
	
	public LoginIdPairCommandResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public LoginIdPairCommandResult addStatusMessagesItem(CommandStatusMessage statusMessagesItem) {
		this.statusMessages.add(statusMessagesItem);
		return this;
	}
	
	public List<CommandStatusMessage> getStatusMessages() {
		return statusMessages;
	}
	
	public void setStatusMessages(List<CommandStatusMessage> statusMessages) {
		this.statusMessages = statusMessages;
	}
	
	public SessionTokenIdCq getIdentifierA() {
		return identifierA;
	}
	
	public void setIdentifierA(SessionTokenIdCq identifierA) {
		this.identifierA = identifierA;
	}
	
	public UserIdCq getIdentifierB() {
		return identifierB;
	}
	
	public void setIdentifierB(UserIdCq identifierB) {
		this.identifierB = identifierB;
	}
}

