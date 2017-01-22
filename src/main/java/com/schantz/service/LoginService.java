/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import com.schantz.errorhandling.*;
import com.schantz.remotecq.client.*;
import org.slf4j.*;
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class LoginService {
	
	Logger log = LoggerFactory.getLogger(LoginService.class);
	
	public LoginIdPairCommandResult login(String username, String password) {
		LoginCommand loginCommand = new LoginCommand();
		loginCommand.setUsername(username);
		loginCommand.setPwd(password);
		
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		ClientRequest<LoginCommand> request = ClientRequest.POST(UrlParams.BASE_URL + "security/users/command/loginCommand")
				.body(BodyInserters.fromObject(loginCommand));
		
		return client.exchange(request)
				.then(response -> response.bodyToMono(LoginIdPairCommandResult.class))
				.doOnError(throwable -> {
					throw new LoginException("Invalid credentials");
				}).block();
	}
}
