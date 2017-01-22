/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.controller;

import com.schantz.model.*;
import com.schantz.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
	
	private final LoginService loginService;
	
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@GetMapping("/login")
	public Login login(String socialSecurityNumber, String password) {
		return loginService.login(socialSecurityNumber, password);
	}
}
