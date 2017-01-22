/**
 * Copyright Schantz A/S, all rights reserved
 */
package com.schantz.service;

import com.schantz.errorhandling.*;
import com.schantz.model.*;
import com.schantz.remotecq.client.*;
import com.schantz.service.url.*;
import org.springframework.http.client.reactive.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.*;
import org.springframework.web.reactive.function.client.*;

@Service
public class LoginService {
	
	public Login login(String socialSecurityNumber, String password) {
		LoginCommand loginCommand = new LoginCommand();
		loginCommand.setUsername("admin@schantz.com");
		loginCommand.setPwd("123");
		
		final String[] sessionId = new String[1];
		
		WebClient client = WebClient.create(new ReactorClientHttpConnector());
		
		ClientRequest<LoginCommand> loginRequest = ClientRequest.POST(UrlParams.LOGIN_URL)
				.body(BodyInserters.fromObject(loginCommand));
		
		ClientRequest<Void> personRequest = ClientRequest.GET(UrlParams.PERSON_SEARCH_URL, socialSecurityNumber).build();
		
		PersonSearchQueryResult personSearchQueryResult = client.exchange(loginRequest)
				.then(response -> response.bodyToMono(LoginIdPairCommandResult.class))
				.doOnError(throwable -> {
					throw new LoginException("Invalid credentials");
				})
				.flatMap(loginIdPairCommandResult -> {
					sessionId[0] = loginIdPairCommandResult.getIdentifierA().getSessionToken();
					return client.exchange(personRequest)
							.then(response -> response.bodyToMono(PersonSearchQueryResult.class))
							.subscribe();
				})
				.blockFirst();
		
		return new Login(sessionId[0], personSearchQueryResult.getEntryCollection().get(0).getPersonId().getUniqueId());
	}
}
