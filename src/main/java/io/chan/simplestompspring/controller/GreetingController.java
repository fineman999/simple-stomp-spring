package io.chan.simplestompspring.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/greeting")
    public String greeting(String message) {
        return "[" + System.currentTimeMillis() + ": " + message + "]";
    }

}
