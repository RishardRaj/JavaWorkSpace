package com.nt.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {
	
	@RequestMapping("/")
	public String process(){
		return "welcome to Spring Boot";
	}
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(com.nt.controller.TestController.class, args);
    }


}
