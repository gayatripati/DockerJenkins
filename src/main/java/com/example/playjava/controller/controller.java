package com.example.playjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/message")
	public String getData() {
		return  "welcome nik";
	}
}
