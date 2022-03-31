package com.example.spring4shell.boot.war;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.OffsetDateTime;

@Controller
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping({ "/", "/helloworld", "spring4shell/helloworld" })
    public String index(Model model) {
        logger.info("model = {}", model);
        model.addAttribute("model", String.valueOf(model));
        model.addAttribute("time", OffsetDateTime.now().toString());
        return "helloworld";
    }

}
