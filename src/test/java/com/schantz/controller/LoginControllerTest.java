package com.schantz.controller;

import org.junit.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.core.Is.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class LoginControllerTest extends WiremockTest {
	
	@Test
	public void login() throws Exception {
		// Given
		String socialSecurityNumber = "021166-0000";
		stubFor(post(urlEqualTo("/services/rest/security/users/command/loginCommand"))
				.willReturn(aResponse()
						.withStatus(201)
						.withHeader("Content-Type", "application/json")
						.withBodyFile("json/LoginCommandResponse.json")));
		
		stubFor(get(urlEqualTo("/services/rest/person/query/personSearchQuery?registration=" + socialSecurityNumber))
				.willReturn(aResponse()
						.withStatus(200)
						.withHeader("Content-Type", "application/json")
						.withBodyFile("json/PersonSearchQueryResponse.json")));
		
		// when
		ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.get("/login")
				.param("socialSecurityNumber", socialSecurityNumber)
				.contentType(contentType));
		
		// Then
		perform.andExpect(status().isOk());
		perform.andExpect(jsonPath("$.sessionToken", is("$JcTKbrpRe9SapAXrCR")));
		perform.andExpect(jsonPath("$.userId", is("$Jc4YUN$GMApLwpUcTj")));
		
	}
	
}