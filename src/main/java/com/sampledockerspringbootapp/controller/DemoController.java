package com.sampledockerspringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/test")
	public String DemoGet() {
		return "This springboot App is running in Docker";
	}

}
