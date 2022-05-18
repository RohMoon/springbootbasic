package com.sm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("prod")
public class BaseConfiguration {

    @Bean // Configuration이니까 Bean을 만들 수 있는 것
    public String hello(){
        return "hello base";
    }
}
