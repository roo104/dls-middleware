package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReferralTestSettingQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("isCheckAuthorizedForAutohrization")
	private Boolean isCheckAuthorizedForAutohrization = false;
	
	public ReferralTestSettingQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public Boolean getIsCheckAuthorizedForAutohrization() {
		return isCheckAuthorizedForAutohrization;
	}
	
	public void setIsCheckAuthorizedForAutohrization(Boolean isCheckAuthorizedForAutohrization) {
		this.isCheckAuthorizedForAutohrization = isCheckAuthorizedForAutohrization;
	}
}

