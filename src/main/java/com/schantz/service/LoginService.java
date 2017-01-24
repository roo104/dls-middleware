/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import com.schantz.errorhandling.*;
import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class LoginService {
	
	@Autowired
	private UserService userService;
	
	public Login login(String socialSecurityNumber, String password) {
		LoginCommand loginCommand = new LoginCommand();
		loginCommand.setUsername("admin@schantz.com");
		loginCommand.setPwd("123");
		
		ClientRequest<LoginCommand> loginRequest = ClientRequest.POST(UrlParams.LOGIN_URL)
				.body(BodyInserters.fromObject(loginCommand));
		
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		LoginIdPairCommandResult loginIdPairCommandResult = client.exchange(loginRequest)
				.then(response -> response.bodyToMono(LoginIdPairCommandResult.class))
				.doOnError(throwable -> {
					throw new LoginException("Invalid credentials");
				})
				.block();
		
		User user = userService.getUserBySocialSecurityNumber(socialSecurityNumber);
		return new Login(loginIdPairCommandResult.getIdentifierA().getSessionToken(), user.getId());
	}
}
