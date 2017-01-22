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
	private final String ownerId;
	private final String insuredPersonId;
	
	public Policy(String id, LocalDate startDate, String ownerId, String insuredPersonId) {
		this.id = id;
		this.startDate = startDate;
		this.ownerId = ownerId;
		this.insuredPersonId = insuredPersonId;
	}
	
}
