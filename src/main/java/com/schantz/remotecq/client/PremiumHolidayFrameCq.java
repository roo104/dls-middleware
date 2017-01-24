package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PremiumHolidayFrameCq implements Serializable {
	@JsonProperty("waitingPeriod")
	private Long waitingPeriod = null;
	
	@JsonProperty("premiumHolidayTypeCq")
	private String premiumHolidayTypeCq = null;
	
	@JsonProperty("timeFrameCq")
	private TimeFrameCq timeFrameCq = null;
	
	@JsonProperty("isInUse")
	private Boolean isInUse = false;
	
	
	public Long getWaitingPeriod() {
		return waitingPeriod;
	}
	
	public void setWaitingPeriod(Long waitingPeriod) {
		this.waitingPeriod = waitingPeriod;
	}
	
	public String getPremiumHolidayTypeCq() {
		return premiumHolidayTypeCq;
	}
	
	public void setPremiumHolidayTypeCq(String premiumHolidayTypeCq) {
		this.premiumHolidayTypeCq = premiumHolidayTypeCq;
	}
	
	public TimeFrameCq getTimeFrameCq() {
		return timeFrameCq;
	}
	
	public void setTimeFrameCq(TimeFrameCq timeFrameCq) {
		this.timeFrameCq = timeFrameCq;
	}
	
	public Boolean getIsInUse() {
		return isInUse;
	}
	
	public void setIsInUse(Boolean isInUse) {
		this.isInUse = isInUse;
	}
}

