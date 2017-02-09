/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class LoginService {
	
	@Value("${base-url}")
	private String baseUrl;
	
	@Autowired
	private UserService userService;
	
	public Login login(String socialSecurityNumber, String password) {
		LoginCommand loginCommand = new LoginCommand();
		loginCommand.setUsername("admin@schantz.com");
		loginCommand.setPwd("123");
		
		WebClient client = WebClient.create(baseUrl + UrlParams.LOGIN_URL);
		
		LoginIdPairCommandResult loginIdPairCommandResult = client.post()
				.uri("")
				.exchange(BodyInserters.fromObject(loginCommand))
				.then(response -> response.bodyToMono(LoginIdPairCommandResult.class))
				.block();
		
		User user = userService.getUserBySocialSecurityNumber(socialSecurityNumber);
		return new Login(loginIdPairCommandResult.getIdentifierA().getSessionToken(), user.getId());
	}
}
