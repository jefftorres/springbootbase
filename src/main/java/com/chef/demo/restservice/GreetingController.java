package com.chef.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "yeah it's the %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "XD") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
