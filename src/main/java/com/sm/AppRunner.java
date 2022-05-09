package com.sm;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class AppRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("AppRunner ApplicationRunner");
        System.out.println("foo : "+ args.containsOption("foo"));
        System.out.println("bar : "+ args.containsOption("bar"));
    }
}
