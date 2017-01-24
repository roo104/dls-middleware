package com.schantz;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cache.annotation.*;
import org.springframework.context.annotation.*;
import springfox.documentation.builders.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.*;
import springfox.documentation.spring.web.plugins.*;
import springfox.documentation.swagger2.annotations.*;

@EnableCaching
@EnableSwagger2
@SpringBootApplication
public class DlsMiddlewareApplication {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("DLS middleware")
				.description("")
				.version("2.0")
				.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DlsMiddlewareApplication.class, args);
	}
}
