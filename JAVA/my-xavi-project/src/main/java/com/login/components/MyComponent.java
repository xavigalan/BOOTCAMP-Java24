package com.login.components;

import org.springframework.stereotype.Component;
import com.login.pojos.TextToJSON;

@Component
public class MyComponent {
    public TextToJSON getTextToJSON() {
        return new TextToJSON("Palabra3", "Palabra4");
    }
}
