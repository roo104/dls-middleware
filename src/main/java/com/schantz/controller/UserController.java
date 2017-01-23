/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.controller;

import com.schantz.model.*;
import com.schantz.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUserBySocialSecurityNumber(id);
	}
}
