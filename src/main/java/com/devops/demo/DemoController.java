package com.devops.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "DevOps Pipeline App Running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}

