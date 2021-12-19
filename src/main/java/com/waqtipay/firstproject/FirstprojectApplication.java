package com.waqtipay.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class FirstprojectApplication {
	@RequestMapping("/")
	public String test(){
		return "Welcome";
	}
	public static void main(String[] args) {

		SpringApplication.run(FirstprojectApplication.class, args);
	}

}
