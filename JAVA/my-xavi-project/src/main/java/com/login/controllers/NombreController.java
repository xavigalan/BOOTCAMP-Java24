package com.login.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {
	@RequestMapping("/welcome")
	public String getNombre() {
		return "Hola";
	}
}
