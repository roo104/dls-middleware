/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
public class User {
	
	private final String id;
	private final String firstName;
	private final String middleName;
	private final String lastName;
	@Setter
	@JsonIgnore
	private String socialSecurityNumber;
	
	public User(String id, String firstName, String middleName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
}
