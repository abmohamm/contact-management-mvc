package com.app.samples.mvc.ms3icontactmanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.app.samples.mvc")
@EnableConfigurationProperties
public class Ms3iContactManagementApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Ms3iContactManagementApiApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Ms3iContactManagementApiApplication.class, args);
	}
}

