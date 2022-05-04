package com.springdemo.helloms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMSController {
    @RequestMapping
    public String helloMicroService(){
        return "Hello Microservice from Spring Boot";
    }
    @RequestMapping("/getWorkOrders")
    public String getWorkOrders(){
        return "Listing Work Orders for PCG Workbench";
    }
}
