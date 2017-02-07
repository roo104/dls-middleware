package com.schantz.controller;

import java.nio.charset.*;

import com.github.tomakehurst.wiremock.junit.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.http.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.web.*;
import org.springframework.test.web.servlet.*;
import org.springframework.web.context.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@ActiveProfiles("test")
public class PayoutsControllerTest {
	
	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("utf8"));
	
	private MockMvc mockMvc;
	
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(9999);
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void getPayouts() throws Exception {
		// Given
		stubFor(post(urlEqualTo("/services/rest/projection/query/projectionQuery"))
				.willReturn(aResponse()
						.withStatus(200)
						.withHeader("Content-Type", "application/json")
						.withBody(body)));
		
		// when
		mockMvc.perform(get("/policies/123/321/payouts")
				.contentType(contentType))
				.andExpect(status().isOk());
	}
	
	String body = "{\n" +
			"   \"ageDateCqCollection\":    [\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 63,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2029-12-01\"\n" +
			"      },\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 64,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2030-12-01\"\n" +
			"      },\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 65,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2031-12-01\"\n" +
			"      },\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 66,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2032-12-01\"\n" +
			"      },\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 67,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2033-12-01\"\n" +
			"      },\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 68,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2034-12-01\"\n" +
			"      },\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 69,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2035-12-01\"\n" +
			"      },\n" +
			"            {\n" +
			"         \"age\":          {\n" +
			"            \"year\": 70,\n" +
			"            \"month\": 0\n" +
			"         },\n" +
			"         \"date_\": \"2036-12-01\"\n" +
			"      }\n" +
			"   ],\n" +
			"   \"projectionResultGroupCqCollection\": [{\"projectionResultSectionCqCollection\": [   {\n" +
			"      \"projectionResultCoverCqCollection\":       [\n" +
			"                  {\n" +
			"            \"currentBenefit\": 0,\n" +
			"            \"projectionResultCoverBenefitCqCollection\":             [\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 63,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2029-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 64,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2030-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 65,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2031-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 66,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2032-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 67,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2033-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 68,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2034-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 69,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2035-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 70,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2036-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 0,\n" +
			"                  \"benefitInflated\": 0\n" +
			"               }\n" +
			"            ],\n" +
			"            \"policyCoverIdCq\":             {\n" +
			"               \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"               \"agreementCoverVariantIdCq\":                {\n" +
			"                  \"variantId\": \"S2\",\n" +
			"                  \"variantName\":                   {\n" +
			"                     \"defaultName\": \"Livrente\",\n" +
			"                     \"translationCollection\": [                     {\n" +
			"                        \"name\": \"Life annuity\",\n" +
			"                        \"locale\": \"en\"\n" +
			"                     }]\n" +
			"                  },\n" +
			"                  \"agreementCoverIdCq\":                   {\n" +
			"                     \"coverId\": \"DlsLifeAnnuity\",\n" +
			"                     \"coverName\":                      {\n" +
			"                        \"defaultName\": \"Livrente\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Life annuity\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     },\n" +
			"                     \"agreementPackageIdCq\":                      {\n" +
			"                        \"packageId\": \"DlsPackageId\",\n" +
			"                        \"agreementVersionIdCq\":                         {\n" +
			"                           \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                           \"localVersionNumber\": \"v.1\",\n" +
			"                           \"localVersionNote\": \"Init by example population\",\n" +
			"                           \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                           \"createUser\": \"System\",\n" +
			"                           \"agreementIdCq\":                            {\n" +
			"                              \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                              \"agreementId\": \"A-00000019\",\n" +
			"                              \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                           }\n" +
			"                        },\n" +
			"                        \"packageName\":                         {\n" +
			"                           \"defaultName\": \"Pakke 1\",\n" +
			"                           \"translationCollection\": [                           {\n" +
			"                              \"name\": \"Package 1\",\n" +
			"                              \"locale\": \"en\"\n" +
			"                           }]\n" +
			"                        }\n" +
			"                     }\n" +
			"                  }\n" +
			"               },\n" +
			"               \"policyPackageIdCq\":                {\n" +
			"                  \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"                  \"agreementPackageIdCq\":                   {\n" +
			"                     \"packageId\": \"DlsPackageId\",\n" +
			"                     \"agreementVersionIdCq\":                      {\n" +
			"                        \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                        \"localVersionNumber\": \"v.1\",\n" +
			"                        \"localVersionNote\": \"Init by example population\",\n" +
			"                        \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                        \"createUser\": \"System\",\n" +
			"                        \"agreementIdCq\":                         {\n" +
			"                           \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                           \"agreementId\": \"A-00000019\",\n" +
			"                           \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                        }\n" +
			"                     },\n" +
			"                     \"packageName\":                      {\n" +
			"                        \"defaultName\": \"Pakke 1\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Package 1\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     }\n" +
			"                  },\n" +
			"                  \"policyIdCq\":                   {\n" +
			"                     \"id\": \"2\",\n" +
			"                     \"policyUid\": \"$Jc4YUNnGginzjMNv@Q\",\n" +
			"                     \"eventTransUid\": \"$Jc4YUfnJI7AkANKrd1\"\n" +
			"                  }\n" +
			"               }\n" +
			"            },\n" +
			"            \"originalCoverId\":             {\n" +
			"               \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"               \"agreementCoverVariantIdCq\":                {\n" +
			"                  \"variantId\": \"S2\",\n" +
			"                  \"variantName\":                   {\n" +
			"                     \"defaultName\": \"Livrente\",\n" +
			"                     \"translationCollection\": [                     {\n" +
			"                        \"name\": \"Life annuity\",\n" +
			"                        \"locale\": \"en\"\n" +
			"                     }]\n" +
			"                  },\n" +
			"                  \"agreementCoverIdCq\":                   {\n" +
			"                     \"coverId\": \"DlsLifeAnnuity\",\n" +
			"                     \"coverName\":                      {\n" +
			"                        \"defaultName\": \"Livrente\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Life annuity\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     },\n" +
			"                     \"agreementPackageIdCq\":                      {\n" +
			"                        \"packageId\": \"DlsPackageId\",\n" +
			"                        \"agreementVersionIdCq\":                         {\n" +
			"                           \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                           \"localVersionNumber\": \"v.1\",\n" +
			"                           \"localVersionNote\": \"Init by example population\",\n" +
			"                           \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                           \"createUser\": \"System\",\n" +
			"                           \"agreementIdCq\":                            {\n" +
			"                              \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                              \"agreementId\": \"A-00000019\",\n" +
			"                              \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                           }\n" +
			"                        },\n" +
			"                        \"packageName\":                         {\n" +
			"                           \"defaultName\": \"Pakke 1\",\n" +
			"                           \"translationCollection\": [                           {\n" +
			"                              \"name\": \"Package 1\",\n" +
			"                              \"locale\": \"en\"\n" +
			"                           }]\n" +
			"                        }\n" +
			"                     }\n" +
			"                  }\n" +
			"               },\n" +
			"               \"policyPackageIdCq\":                {\n" +
			"                  \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"                  \"agreementPackageIdCq\":                   {\n" +
			"                     \"packageId\": \"DlsPackageId\",\n" +
			"                     \"agreementVersionIdCq\":                      {\n" +
			"                        \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                        \"localVersionNumber\": \"v.1\",\n" +
			"                        \"localVersionNote\": \"Init by example population\",\n" +
			"                        \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                        \"createUser\": \"System\",\n" +
			"                        \"agreementIdCq\":                         {\n" +
			"                           \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                           \"agreementId\": \"A-00000019\",\n" +
			"                           \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                        }\n" +
			"                     },\n" +
			"                     \"packageName\":                      {\n" +
			"                        \"defaultName\": \"Pakke 1\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Package 1\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     }\n" +
			"                  },\n" +
			"                  \"policyIdCq\":                   {\n" +
			"                     \"id\": \"2\",\n" +
			"                     \"policyUid\": \"$Jc4YUNnGginzjMNv@Q\",\n" +
			"                     \"eventTransUid\": \"$Jc4YUfnJI7AkANKrd1\"\n" +
			"                  }\n" +
			"               }\n" +
			"            },\n" +
			"            \"expiryAge\":             {\n" +
			"               \"year\": 67,\n" +
			"               \"month\": 0\n" +
			"            },\n" +
			"            \"benefitPeriod\":             {\n" +
			"               \"value\": 0,\n" +
			"               \"periodLength\": \"Y\"\n" +
			"            },\n" +
			"            \"insuranceTypeCq\": \"NUL\"\n" +
			"         },\n" +
			"                  {\n" +
			"            \"currentBenefit\": 58753.86,\n" +
			"            \"projectionResultCoverBenefitCqCollection\":             [\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 63,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2029-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 30141.56,\n" +
			"                  \"benefitInflated\": 40863.69\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 64,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2030-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 31648.32,\n" +
			"                  \"benefitInflated\": 43979.11\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 65,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2031-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 33013.84,\n" +
			"                  \"benefitInflated\": 47023.58\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 66,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2032-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 34199.66,\n" +
			"                  \"benefitInflated\": 49930.43\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 67,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2033-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 35200.54,\n" +
			"                  \"benefitInflated\": 52676.47\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 68,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2034-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 38362.05,\n" +
			"                  \"benefitInflated\": 58842.75\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 69,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2035-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 41432.92,\n" +
			"                  \"benefitInflated\": 65141.93\n" +
			"               },\n" +
			"                              {\n" +
			"                  \"projectionAge\":                   {\n" +
			"                     \"age\":                      {\n" +
			"                        \"year\": 70,\n" +
			"                        \"month\": 0\n" +
			"                     },\n" +
			"                     \"date_\": \"2036-12-01\"\n" +
			"                  },\n" +
			"                  \"benefit\": 44419.25,\n" +
			"                  \"benefitInflated\": 71583.04\n" +
			"               }\n" +
			"            ],\n" +
			"            \"policyCoverIdCq\":             {\n" +
			"               \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"               \"agreementCoverVariantIdCq\":                {\n" +
			"                  \"variantId\": \"S1\",\n" +
			"                  \"variantName\":                   {\n" +
			"                     \"defaultName\": \"Ratepension\",\n" +
			"                     \"translationCollection\": [                     {\n" +
			"                        \"name\": \"Certain annuity\",\n" +
			"                        \"locale\": \"en\"\n" +
			"                     }]\n" +
			"                  },\n" +
			"                  \"agreementCoverIdCq\":                   {\n" +
			"                     \"coverId\": \"DlsCertainAnnuity\",\n" +
			"                     \"coverName\":                      {\n" +
			"                        \"defaultName\": \"Ratepension\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Certain annuity\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     },\n" +
			"                     \"agreementPackageIdCq\":                      {\n" +
			"                        \"packageId\": \"DlsPackageId\",\n" +
			"                        \"agreementVersionIdCq\":                         {\n" +
			"                           \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                           \"localVersionNumber\": \"v.1\",\n" +
			"                           \"localVersionNote\": \"Init by example population\",\n" +
			"                           \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                           \"createUser\": \"System\",\n" +
			"                           \"agreementIdCq\":                            {\n" +
			"                              \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                              \"agreementId\": \"A-00000019\",\n" +
			"                              \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                           }\n" +
			"                        },\n" +
			"                        \"packageName\":                         {\n" +
			"                           \"defaultName\": \"Pakke 1\",\n" +
			"                           \"translationCollection\": [                           {\n" +
			"                              \"name\": \"Package 1\",\n" +
			"                              \"locale\": \"en\"\n" +
			"                           }]\n" +
			"                        }\n" +
			"                     }\n" +
			"                  }\n" +
			"               },\n" +
			"               \"policyPackageIdCq\":                {\n" +
			"                  \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"                  \"agreementPackageIdCq\":                   {\n" +
			"                     \"packageId\": \"DlsPackageId\",\n" +
			"                     \"agreementVersionIdCq\":                      {\n" +
			"                        \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                        \"localVersionNumber\": \"v.1\",\n" +
			"                        \"localVersionNote\": \"Init by example population\",\n" +
			"                        \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                        \"createUser\": \"System\",\n" +
			"                        \"agreementIdCq\":                         {\n" +
			"                           \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                           \"agreementId\": \"A-00000019\",\n" +
			"                           \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                        }\n" +
			"                     },\n" +
			"                     \"packageName\":                      {\n" +
			"                        \"defaultName\": \"Pakke 1\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Package 1\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     }\n" +
			"                  },\n" +
			"                  \"policyIdCq\":                   {\n" +
			"                     \"id\": \"2\",\n" +
			"                     \"policyUid\": \"$Jc4YUNnGginzjMNv@Q\",\n" +
			"                     \"eventTransUid\": \"$Jc4YUfnJI7AkANKrd1\"\n" +
			"                  }\n" +
			"               }\n" +
			"            },\n" +
			"            \"originalCoverId\":             {\n" +
			"               \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"               \"agreementCoverVariantIdCq\":                {\n" +
			"                  \"variantId\": \"S1\",\n" +
			"                  \"variantName\":                   {\n" +
			"                     \"defaultName\": \"Ratepension\",\n" +
			"                     \"translationCollection\": [                     {\n" +
			"                        \"name\": \"Certain annuity\",\n" +
			"                        \"locale\": \"en\"\n" +
			"                     }]\n" +
			"                  },\n" +
			"                  \"agreementCoverIdCq\":                   {\n" +
			"                     \"coverId\": \"DlsCertainAnnuity\",\n" +
			"                     \"coverName\":                      {\n" +
			"                        \"defaultName\": \"Ratepension\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Certain annuity\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     },\n" +
			"                     \"agreementPackageIdCq\":                      {\n" +
			"                        \"packageId\": \"DlsPackageId\",\n" +
			"                        \"agreementVersionIdCq\":                         {\n" +
			"                           \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                           \"localVersionNumber\": \"v.1\",\n" +
			"                           \"localVersionNote\": \"Init by example population\",\n" +
			"                           \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                           \"createUser\": \"System\",\n" +
			"                           \"agreementIdCq\":                            {\n" +
			"                              \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                              \"agreementId\": \"A-00000019\",\n" +
			"                              \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                           }\n" +
			"                        },\n" +
			"                        \"packageName\":                         {\n" +
			"                           \"defaultName\": \"Pakke 1\",\n" +
			"                           \"translationCollection\": [                           {\n" +
			"                              \"name\": \"Package 1\",\n" +
			"                              \"locale\": \"en\"\n" +
			"                           }]\n" +
			"                        }\n" +
			"                     }\n" +
			"                  }\n" +
			"               },\n" +
			"               \"policyPackageIdCq\":                {\n" +
			"                  \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"                  \"agreementPackageIdCq\":                   {\n" +
			"                     \"packageId\": \"DlsPackageId\",\n" +
			"                     \"agreementVersionIdCq\":                      {\n" +
			"                        \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"                        \"localVersionNumber\": \"v.1\",\n" +
			"                        \"localVersionNote\": \"Init by example population\",\n" +
			"                        \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"                        \"createUser\": \"System\",\n" +
			"                        \"agreementIdCq\":                         {\n" +
			"                           \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                           \"agreementId\": \"A-00000019\",\n" +
			"                           \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"                        }\n" +
			"                     },\n" +
			"                     \"packageName\":                      {\n" +
			"                        \"defaultName\": \"Pakke 1\",\n" +
			"                        \"translationCollection\": [                        {\n" +
			"                           \"name\": \"Package 1\",\n" +
			"                           \"locale\": \"en\"\n" +
			"                        }]\n" +
			"                     }\n" +
			"                  },\n" +
			"                  \"policyIdCq\":                   {\n" +
			"                     \"id\": \"2\",\n" +
			"                     \"policyUid\": \"$Jc4YUNnGginzjMNv@Q\",\n" +
			"                     \"eventTransUid\": \"$Jc4YUfnJI7AkANKrd1\"\n" +
			"                  }\n" +
			"               }\n" +
			"            },\n" +
			"            \"expiryAge\":             {\n" +
			"               \"year\": 67,\n" +
			"               \"month\": 0\n" +
			"            },\n" +
			"            \"benefitPeriod\":             {\n" +
			"               \"value\": 10,\n" +
			"               \"periodLength\": \"Y\"\n" +
			"            },\n" +
			"            \"insuranceTypeCq\": \"NUL\"\n" +
			"         }\n" +
			"      ],\n" +
			"      \"policyPackageIdCq\":       {\n" +
			"         \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"         \"agreementPackageIdCq\":          {\n" +
			"            \"packageId\": \"DlsPackageId\",\n" +
			"            \"agreementVersionIdCq\":             {\n" +
			"               \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"               \"localVersionNumber\": \"v.1\",\n" +
			"               \"localVersionNote\": \"Init by example population\",\n" +
			"               \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"               \"createUser\": \"System\",\n" +
			"               \"agreementIdCq\":                {\n" +
			"                  \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                  \"agreementId\": \"A-00000019\",\n" +
			"                  \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"               }\n" +
			"            },\n" +
			"            \"packageName\":             {\n" +
			"               \"defaultName\": \"Pakke 1\",\n" +
			"               \"translationCollection\": [               {\n" +
			"                  \"name\": \"Package 1\",\n" +
			"                  \"locale\": \"en\"\n" +
			"               }]\n" +
			"            }\n" +
			"         },\n" +
			"         \"policyIdCq\":          {\n" +
			"            \"id\": \"2\",\n" +
			"            \"policyUid\": \"$Jc4YUNnGginzjMNv@Q\",\n" +
			"            \"eventTransUid\": \"$Jc4YUfnJI7AkANKrd1\"\n" +
			"         }\n" +
			"      },\n" +
			"      \"originalPackageId\":       {\n" +
			"         \"instanceId\": \"newGeneralDefaultPolicyEventTypeId2016-10-01#1\",\n" +
			"         \"agreementPackageIdCq\":          {\n" +
			"            \"packageId\": \"DlsPackageId\",\n" +
			"            \"agreementVersionIdCq\":             {\n" +
			"               \"versionId\": \"$Jc4YTw5Eiz6iTsucOM###null###2015-10-01###null\",\n" +
			"               \"localVersionNumber\": \"v.1\",\n" +
			"               \"localVersionNote\": \"Init by example population\",\n" +
			"               \"localProductVersionUid\": \"$Jc4YTw5Eiz6iTsucOM\",\n" +
			"               \"createUser\": \"System\",\n" +
			"               \"agreementIdCq\":                {\n" +
			"                  \"lifeProductUid\": \"$Jc4YTvyEiwHIlQo9Wn\",\n" +
			"                  \"agreementId\": \"A-00000019\",\n" +
			"                  \"agreementName\": \"Korsbæk bank under overenskomst\"\n" +
			"               }\n" +
			"            },\n" +
			"            \"packageName\":             {\n" +
			"               \"defaultName\": \"Pakke 1\",\n" +
			"               \"translationCollection\": [               {\n" +
			"                  \"name\": \"Package 1\",\n" +
			"                  \"locale\": \"en\"\n" +
			"               }]\n" +
			"            }\n" +
			"         },\n" +
			"         \"policyIdCq\":          {\n" +
			"            \"id\": \"2\",\n" +
			"            \"policyUid\": \"$Jc4YUNnGginzjMNv@Q\",\n" +
			"            \"eventTransUid\": \"$Jc4YUfnJI7AkANKrd1\"\n" +
			"         }\n" +
			"      }\n" +
			"   }]}]\n" +
			"}";
	
}