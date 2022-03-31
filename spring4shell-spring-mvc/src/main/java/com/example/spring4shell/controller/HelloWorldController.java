package com.example.spring4shell.controller;

import com.example.spring4shell.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    @RequestMapping({ "/", "/helloworld" })
    public String handler(HelloWorld model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("model=" + model);
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return "helloworld";
    }
}
