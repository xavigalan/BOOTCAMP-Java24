package com.login.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("/hola") 
		public String hola() {
		return "<html><body><h1>Hola desde Spring Boot</h1></body></html>";
	}
}
