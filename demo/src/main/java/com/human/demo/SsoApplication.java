package com.human.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SsoApplication {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(SsoApplication.class);

	public static void main(String[] args) {
		logger.info("Inicio");
		SpringApplication.run(SsoApplication.class, args);
		logger.info("Final");
	}

}
