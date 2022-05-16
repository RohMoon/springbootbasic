package com.sm;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

//    @Around("execution(* com.sm..*.EventService.*(..))")
    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        long begin = System.currentTimeMillis();
        Object retVal = proceedingJoinPoint.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }
}