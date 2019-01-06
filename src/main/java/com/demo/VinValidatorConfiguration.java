package com.demo;

import javax.activation.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.service.VinValidatorService;

@Configuration
public class VinValidatorConfiguration {

	@Bean
	public VinValidatorService vinValidatorSerice() {
		return new VinValidatorService();
	}
	
//	@Bean
//	@ConfigurationProperties("app.datasource")
//	public DataSource dataSource() {
//		return (DataSource) DataSourceBuilder.create().build();
//	}
}
