package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsCommissionRefundRuleQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("commissionRefundRuleVersionDetailsCq")
	private CommissionRefundRuleVersionDetailsCq commissionRefundRuleVersionDetailsCq = null;
	
	public VersionDetailsCommissionRefundRuleQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CommissionRefundRuleVersionDetailsCq getCommissionRefundRuleVersionDetailsCq() {
		return commissionRefundRuleVersionDetailsCq;
	}
	
	public void setCommissionRefundRuleVersionDetailsCq(CommissionRefundRuleVersionDetailsCq commissionRefundRuleVersionDetailsCq) {
		this.commissionRefundRuleVersionDetailsCq = commissionRefundRuleVersionDetailsCq;
	}
}

