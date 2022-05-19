package com.sm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class AppRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MyProperties myProperties;

    @Value("${my.name}")
    String name;

    @Value("${my.age}")
    int age;

    @Value("${my.fullName}")
    String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("hello Logger");
        System.out.println("AppRunner ApplicationRunner");
        System.out.println("foo : "+ args.containsOption("foo"));
        System.out.println("bar : "+ args.containsOption("bar"));
        System.out.println(name);
        System.out.println(age);//-493660209
        System.out.println(fullName);
        System.out.println("\n\n\n =================================>");
//        myProperties.setName("ARA NE! ");
//        myProperties.setAge(2);
//        myProperties.setFullName("ROH");
        System.out.println(myProperties.getName());
        System.out.println(myProperties.getAge());
        System.out.println(myProperties.getFullName());

    }
}
