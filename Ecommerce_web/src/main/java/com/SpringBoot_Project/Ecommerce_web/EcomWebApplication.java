package com.SpringBoot_Project.Ecommerce_web;

import com.SpringBoot_Project.Ecommerce_web.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomWebApplication {

//    @Autowired
//    private EmailService service;

    public static void main(String[] args) {
        SpringApplication.run(EcomWebApplication.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void triggerMail(){
//        service.sendMail("shubhneet.aggrwal@tothenew.com",
//                "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiZXN0IiwiaWF0IjoxNjgyNDE5NTA0LCJleHAiOjE2ODI0MTk1MTF9.62Rl0hIBXW5x5Vh-b20-mj_joJCqqunIkItEfqWgDgn7pKoP4yk2ZLr7JnLAzbPlrKDr6mT0PrNGOXjTj4OUww","customer");
//    }
}