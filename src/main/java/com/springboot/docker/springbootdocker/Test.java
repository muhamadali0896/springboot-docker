package com.springboot.docker.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping(path = "/message")
	public String getMessage() {
		return "Dockerization is working";
	}
}
