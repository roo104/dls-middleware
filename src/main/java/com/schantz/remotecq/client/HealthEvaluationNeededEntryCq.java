package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class HealthEvaluationNeededEntryCq implements Serializable {
	@JsonProperty("triggeredDate")
	private LocalDate triggeredDate = null;
	
	@JsonProperty("waitingPeriodNoOfPeriods")
	private Long waitingPeriodNoOfPeriods = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createDate")
	private OffsetDateTime createDate = null;
	
	@JsonProperty("healthGroupRuleCq")
	private HealthGroupRuleCq healthGroupRuleCq = null;
	
	@JsonProperty("healthFormIdCq")
	private HealthFormIdCq healthFormIdCq = null;
	
	@JsonProperty("waitingPeriodLength")
	private String waitingPeriodLength = null;
	
	@JsonProperty("isDeleteHealthEvaluation")
	private Boolean isDeleteHealthEvaluation = false;
	
	@JsonProperty("isCreatedManually")
	private Boolean isCreatedManually = false;
	
	
	public LocalDate getTriggeredDate() {
		return triggeredDate;
	}
	
	public void setTriggeredDate(LocalDate triggeredDate) {
		this.triggeredDate = triggeredDate;
	}
	
	public Long getWaitingPeriodNoOfPeriods() {
		return waitingPeriodNoOfPeriods;
	}
	
	public void setWaitingPeriodNoOfPeriods(Long waitingPeriodNoOfPeriods) {
		this.waitingPeriodNoOfPeriods = waitingPeriodNoOfPeriods;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public OffsetDateTime getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(OffsetDateTime createDate) {
		this.createDate = createDate;
	}
	
	public HealthGroupRuleCq getHealthGroupRuleCq() {
		return healthGroupRuleCq;
	}
	
	public void setHealthGroupRuleCq(HealthGroupRuleCq healthGroupRuleCq) {
		this.healthGroupRuleCq = healthGroupRuleCq;
	}
	
	public HealthFormIdCq getHealthFormIdCq() {
		return healthFormIdCq;
	}
	
	public void setHealthFormIdCq(HealthFormIdCq healthFormIdCq) {
		this.healthFormIdCq = healthFormIdCq;
	}
	
	public String getWaitingPeriodLength() {
		return waitingPeriodLength;
	}
	
	public void setWaitingPeriodLength(String waitingPeriodLength) {
		this.waitingPeriodLength = waitingPeriodLength;
	}
	
	public Boolean getIsDeleteHealthEvaluation() {
		return isDeleteHealthEvaluation;
	}
	
	public void setIsDeleteHealthEvaluation(Boolean isDeleteHealthEvaluation) {
		this.isDeleteHealthEvaluation = isDeleteHealthEvaluation;
	}
	
	public Boolean getIsCreatedManually() {
		return isCreatedManually;
	}
	
	public void setIsCreatedManually(Boolean isCreatedManually) {
		this.isCreatedManually = isCreatedManually;
	}
}

