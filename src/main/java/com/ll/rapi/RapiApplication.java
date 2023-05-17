package com.ll.rapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RapiApplication.class, args);
	}

}
