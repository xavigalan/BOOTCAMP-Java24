package com.login.controllers;

import java.util.Random;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.login.pojos.TextToJSON;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String defect() {
		return "defecto.html";
	}

	@RequestMapping("/texttojson")
	public TextToJSON textojson() {
		return new TextToJSON("textojson.html", 300);
	}

	@RequestMapping(path = "/produces", produces = "application/json")
	public String produces() {
		return "{\"page\": \"produces.html\"}";
	}

	@RequestMapping("/objectnode")
	public ObjectNode objectnode() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("key", "value");
		objectNode.put("fiuuu", "bar");
		objectNode.put("numero", 17);
		return objectNode;
	}

	@RequestMapping(path = "/responsebody")
	public ResponseEntity<String> getGreetingWithResponseEntity() {
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"test\": \"Hola soy Xavi y esto es ResponseEntity\"}", httpHeaders,
				HttpStatus.OK);
	}

	@RequestMapping("/randomstatus")
	public ResponseEntity<String> getRandomStatus() {
	    Random random = new Random();
	    int result = random.nextInt(2); 
	    
	    HttpStatus notfound = HttpStatus.NOT_FOUND;
	    HttpStatus teapot = HttpStatus.ACCEPTED;

	    if (result == 0) {
	        String statusMessage = notfound.getReasonPhrase();  
	        return new ResponseEntity<>("Operación exitosa, status: " + HttpStatus.OK.getReasonPhrase(), HttpStatus.OK);  // Código 200
	    } else {
	    	if (random.nextBoolean()) {
	            String statusMessage = notfound.getReasonPhrase(); 
	            return new ResponseEntity<>("Error: no encontrado, status: " + statusMessage, notfound);  // Código 404
	        } else {
	            String statusMessage = teapot.getReasonPhrase();
	            return new ResponseEntity<>("Error: soy una tetera, status: " + statusMessage, teapot); // Código 418
	        }
	    }
	}


}
