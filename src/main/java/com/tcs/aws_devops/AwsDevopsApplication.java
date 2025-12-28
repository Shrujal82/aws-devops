package com.tcs.aws_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AwsDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDevopsApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcom to demo project</h1>";
	}
	
	@GetMapping("/about")
	public String about() {
		return "<h1>This is about page</h1>";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "<h1>This is contact page</h1>";
	}

}
