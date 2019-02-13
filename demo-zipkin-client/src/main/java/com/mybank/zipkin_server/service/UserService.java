package com.mybank.zipkin_server.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    @GetMapping(path="/user/{name}",consumes = "application/json")
    public String getUserName(@PathVariable String name)
    {

        return "User service " + name;

    }
}
