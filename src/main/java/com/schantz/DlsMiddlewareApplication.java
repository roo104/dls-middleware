package com.schantz;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cache.annotation.*;

@EnableCaching
@SpringBootApplication
public class DlsMiddlewareApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DlsMiddlewareApplication.class, args);
	}
}
