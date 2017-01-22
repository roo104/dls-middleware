/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.errorhandling;

public class LoginException extends RuntimeException {
	
	public LoginException(String message) {
		super(message);
	}
}
