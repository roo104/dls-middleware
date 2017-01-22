/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.errorhandling;

import com.schantz.model.*;
import javax.servlet.http.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.*;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler {
	
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<ErrorResponse> unauthorized(HttpServletRequest req, Exception exception) {
		ErrorResponse responseBody = new ErrorResponse(HttpStatus.UNAUTHORIZED, exception.getMessage());
		return new ResponseEntity<>(responseBody, HttpStatus.UNAUTHORIZED);
	}
}
