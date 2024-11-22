package com.login.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saludos")
public class SaludosController {
	@RequestMapping(value = { "/hola", "/hello", "/salut" })
	public String getPerson() {
		return "Hello, hola, salut";
	}
}
