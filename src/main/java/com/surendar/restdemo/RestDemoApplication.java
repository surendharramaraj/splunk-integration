package com.surendar.restdemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class RestDemoApplication {

	private static final Logger logger = LogManager.getLogger(RestDemoApplication.class);
	public static void main(String[] args) {
		
		logger.info("Starting-------------------");
		
		SpringApplication.run(RestDemoApplication.class, args);
	}

}
