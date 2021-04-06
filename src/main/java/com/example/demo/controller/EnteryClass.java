package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnteryClass {
	
	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping(value="/")
	public String hello(){
		return "Welcome Mr Chaithanya kumar";
	}

}
