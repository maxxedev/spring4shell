package com.example.spring4shell.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class BinderControllerAdvice {

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        // This code protects Spring Core from a "Remote Code Execution" attack (dubbed "Spring4Shell").
        // By applying this mitigation, you prevent the "Class Loader Manipulation" attack vector from firing.
        // For more details, see this post: https://www.lunasec.io/docs/blog/spring-rce-vulnerabilities/
        
        String property = System.getProperty("APPLY_ADVICE", System.getenv("APPLY_ADVICE"));
        if (Boolean.valueOf(property)) { // turned off by default to allow exploit to be reproduced. When fixing, turn it on by default! 
            String[] denylist = new String[] { "class.*", "Class.*", "*.class.*", "*.Class.*" };
            dataBinder.setDisallowedFields(denylist);
        }
    }
}
