package com.go2it.edu.service;

import org.springframework.stereotype.Component;

@Component ("helloWorldService")

public class HelloWorldService implements IGreetingService{
    private String message;
    private int repeat;

    public HelloWorldService(){
        message="";
    }

    public HelloWorldService(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public void sendGreeting() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Hello, world!" + message);
        }
    }
}
