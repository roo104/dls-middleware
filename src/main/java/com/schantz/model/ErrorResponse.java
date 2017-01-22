/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.model;

import lombok.*;
import org.springframework.http.*;

@Getter
public class ErrorResponse {
	
	private final int errorCode;
	private final String message;
	
	public ErrorResponse(HttpStatus errorCode, String message) {
		this.errorCode = errorCode.value();
		this.message = message;
	}
	
}
