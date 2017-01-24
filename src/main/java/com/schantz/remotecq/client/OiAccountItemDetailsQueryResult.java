package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountItemDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("oiAccountItemDetailsCq")
	private OiAccountItemDetailsCq oiAccountItemDetailsCq = null;
	
	@JsonProperty("oiAccountInfoCq")
	private OiAccountInfoCq oiAccountInfoCq = null;
	
	public OiAccountItemDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public OiAccountItemDetailsCq getOiAccountItemDetailsCq() {
		return oiAccountItemDetailsCq;
	}
	
	public void setOiAccountItemDetailsCq(OiAccountItemDetailsCq oiAccountItemDetailsCq) {
		this.oiAccountItemDetailsCq = oiAccountItemDetailsCq;
	}
	
	public OiAccountInfoCq getOiAccountInfoCq() {
		return oiAccountInfoCq;
	}
	
	public void setOiAccountInfoCq(OiAccountInfoCq oiAccountInfoCq) {
		this.oiAccountInfoCq = oiAccountInfoCq;
	}
}

