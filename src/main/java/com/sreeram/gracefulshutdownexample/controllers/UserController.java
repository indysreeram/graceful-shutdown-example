package com.sreeram.gracefulshutdownexample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {

        System.out.println("Waiting for 5 sec....");
        Thread.sleep(5000);
        System.out.println("Returning the Hello!!!");;
        return "Hello World";
    }
}
