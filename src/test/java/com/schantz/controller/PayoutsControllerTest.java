package com.schantz.controller;

import org.junit.*;
import org.springframework.test.web.servlet.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static org.hamcrest.core.Is.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class PayoutsControllerTest extends WiremockTest {
	
	@Test
	public void getPayouts() throws Exception {
		// Given
		stubFor(post(urlEqualTo("/services/rest/projection/query/projectionQuery"))
				.willReturn(aResponse()
						.withStatus(200)
						.withHeader("Content-Type", "application/json")
						.withBodyFile("json/ProjectionQueryResponse.json")));
		
		// when
		ResultActions perform = mockMvc.perform(get("/policies/123/321/payouts")
				.contentType(contentType));
		
		// Then
		perform.andExpect(status().isOk());
		perform.andExpect(jsonPath("$.['Certain annuity']", is(2933.37d)));
		perform.andExpect(jsonPath("$.['Life annuity']", is(0d)));
	}
	
}