package com.sm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class AppRunner implements ApplicationRunner {

    @Value("${my.name}")
    String name;

    @Value("${my.age}")
    int age;

    @Value("${my.fullName}")
    String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("AppRunner ApplicationRunner");
        System.out.println("foo : "+ args.containsOption("foo"));
        System.out.println("bar : "+ args.containsOption("bar"));
        System.out.println(name);
        System.out.println(age);//-493660209
        System.out.println(fullName);
    }
}
