/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.controller;

import com.schantz.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
	
	private final LoginService loginService;
	
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@GetMapping("/login")
	public String login(String username, String password) {
		return loginService.login(username, password);
	}
}
