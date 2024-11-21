package com.login.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.login.pojos.TextToJSON;

@RestController
public class RestComponent{
    @RequestMapping("/component")
    public TextToJSON component() {
        return new TextToJSON("Palabra1", "Palabra2");
    }
}
