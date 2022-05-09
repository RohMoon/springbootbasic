package com.sm;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentTestComponent {
    public ArgumentTestComponent(ApplicationArguments applicationArguments) {
        System.out.println("foo : "+ applicationArguments.containsOption("foo"));
        System.out.println("bar : "+ applicationArguments.containsOption("bar"));
    }
}
