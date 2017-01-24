/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import java.util.*;

public enum EmployeeBillingType {
	
	NONE("00"),
	PDS("20");
	
	private final String code;
	
	EmployeeBillingType(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public static EmployeeBillingType fromCode(String code) {
		return EnumSet.allOf(EmployeeBillingType.class)
				.stream()
				.filter(e -> e.getCode().equals(code))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException(String.format("Unsupported type %s.", code)));
		
		
	}
}
