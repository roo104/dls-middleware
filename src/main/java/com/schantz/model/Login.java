/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import lombok.*;

@Getter
public class Login {
	
	private final String sessionToken;
	private final String userId;
	
	public Login(String sessionToken, String userId) {
		this.sessionToken = sessionToken;
		this.userId = userId;
	}
}
