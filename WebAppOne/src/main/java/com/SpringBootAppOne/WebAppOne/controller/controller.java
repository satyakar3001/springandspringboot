package com.SpringBootAppOne.WebAppOne.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome to the Home Page";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "Welcome to the about page";
	}
}
