package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.service.VinValidatorService;

@Configuration
public class VinValidatorConfiguration {

	@Bean
	public VinValidatorService vinValidatorSerice() {
		return new VinValidatorService();
	}
}
