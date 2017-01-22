/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import java.time.*;

import lombok.*;

@Getter
public class Policy {
	
	private final String id;
	private final LocalDate startDate;
	@Setter
	private String ownerId;
	@Setter
	private String insuredPersonId;
	@Setter
	private String eventTransId;
	@Setter
	private String agreementId;
	
	public Policy(String id, LocalDate startDate) {
		this.id = id;
		this.startDate = startDate;
	}
	
}
