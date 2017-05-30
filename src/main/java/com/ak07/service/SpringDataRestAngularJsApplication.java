package com.ak07.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

//@EnableJpaRepositories
//@Import(RepositoryRestMvcConfiguration.class)
@SpringBootApplication
public class SpringDataRestAngularJsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestAngularJsApplication.class, args);
	}
}
