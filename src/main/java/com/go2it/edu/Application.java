package com.go2it.edu;

import com.go2it.edu.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

@Component
public class Application {
    @Inject
    @Named(value = "helloKittyService")

//	==========Alternative approach with the same result
//	@Autowired
//	@Qualifier("helloKittyService")

    private IGreetingService greeting = null;

    public Application() {
    }

    public Application(IGreetingService greeting) {
        this.greeting = greeting;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Application application = (Application) ctx.getBean("application");
        application.start();
    }

    public void start() {
        if (greeting != null) {
            greeting.sendGreeting();
        }
    }
}
