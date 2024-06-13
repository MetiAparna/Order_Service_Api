package com.ass.order_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.ass.order_service")
public class OrderConfiguration {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

		
	}
}
