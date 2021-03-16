package com.go2it.edu.service;

import org.springframework.stereotype.Component;


@Component ("helloKittyService")
public class HelloKittyService implements IGreetingService{
    @Override
    public void sendGreeting() {
        System.out.println("Hello, Kitty!");
    }
}
