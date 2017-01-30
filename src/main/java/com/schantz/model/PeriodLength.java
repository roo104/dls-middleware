/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

public enum PeriodLength {
	
	MONTHLY("M"),
	YEARLY("Y");
	
	private final String period;
	
	PeriodLength(String preriod) {
		this.period = preriod;
	}
	
	public String getPeriod() {
		return period;
	}
}
