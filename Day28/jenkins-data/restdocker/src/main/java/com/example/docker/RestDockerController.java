package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDockerController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Method is called";
	}
	@GetMapping("/byee")
	public String byee() {
		return "byeeee Method is called";
	}
}
