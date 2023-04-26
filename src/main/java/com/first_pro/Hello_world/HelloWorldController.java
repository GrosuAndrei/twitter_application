package com.first_pro.Hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class HelloWorldController {

    @GetMapping(path="hello-world")
    public String hello() {
        return "Hello World";
    }
}
