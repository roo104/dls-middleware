/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.controller;

import com.schantz.model.*;
import com.schantz.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public Login login(String socialSecurityNumber, String password) {
		return loginService.login(socialSecurityNumber, password);
	}
}
