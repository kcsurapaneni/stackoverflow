package com.learn.security.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author Krishna Chaitanya
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    Map<String, String> welcome(@RequestParam("name") String name) {
        return Map.of("message", "Hello, " + name);
    }

}
