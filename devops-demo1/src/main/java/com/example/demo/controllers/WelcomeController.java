package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {
	
	public String[] getCity(){
		return new String[] {"hyd","mumbai","kerala"};
	}

}
