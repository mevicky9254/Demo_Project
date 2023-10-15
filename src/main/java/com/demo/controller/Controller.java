package com.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins="*")
public class Controller {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World !";
	}

}
