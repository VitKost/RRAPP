package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MainApplication {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
