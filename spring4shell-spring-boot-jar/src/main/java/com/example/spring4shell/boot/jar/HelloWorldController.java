package com.example.spring4shell.boot.jar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.OffsetDateTime;

@Controller
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping({ "/", "/helloworld", "spring4shell/helloworld" })
    @ResponseBody
    public Greeting index(Model model) {
        logger.info("model = {}", model);
        Greeting greeting = new Greeting();
        greeting.setId(123);
        greeting.setContent(OffsetDateTime.now().toString() + " " + model);
        model.addAttribute("greeting", greeting);
        return greeting;
    }

}
