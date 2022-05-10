package com.sm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner2 implements ApplicationRunner {

    // 일반적인 표현식 사용 예
    @Value("#{1+1}")
    int value;

    @Value("#{ 'hello' + 'world'}")
    String greeting;

    @Value("#{1 eq 1 }")
    boolean trueOrFalse;
    
    //프로퍼티 사용 예
    @Value("${my.value}")
    String myValue;

    @Value("#{${my.value} eq 100}")
    boolean isMyValue100;

    //빈 속성 사용 예 (여기서는 Sample 이라는 빈을 사전에 정의 했음.)
//    @Value("#{sample.value}")
//    int sampleValue;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    System.out.println(value);
    System.out.println(greeting);
    System.out.println(trueOrFalse);
    System.out.println(myValue);
    System.out.println(isMyValue100);
//    System.out.println(sampleValue);
    }
}
