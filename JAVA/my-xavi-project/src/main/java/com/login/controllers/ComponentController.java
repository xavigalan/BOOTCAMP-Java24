package com.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.components.MyComponent;
import com.login.pojos.TextToJSON;

@RestController
public class ComponentController {

    @Autowired
    private MyComponent myComponent;

    @RequestMapping("/mycomponent")
    public TextToJSON getFromComponent() {
        return myComponent.getTextToJSON();
    }
}
