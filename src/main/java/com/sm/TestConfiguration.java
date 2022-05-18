package com.sm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestConfiguration {

    @Bean // Configuration이니까 Bean을 만들 수 있는 것
    public String hello(){
        return "hello test";
    }
}
