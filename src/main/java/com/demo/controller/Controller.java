package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.ClothingCombinationService;



@RestController
@CrossOrigin(origins="*")
public class Controller {
	
	@Autowired
	private ClothingCombinationService cService;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World !";
	}

	
	
	
	@GetMapping("/combination")
	public ResponseEntity<String>getCombination(@RequestParam("budget") Double budget){
		 
		String message=cService.getCombinations(budget);
		
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
