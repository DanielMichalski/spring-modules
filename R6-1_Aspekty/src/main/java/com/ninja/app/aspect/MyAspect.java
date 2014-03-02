package com.ninja.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Author: Daniel
 */
@Component
@Aspect
public class MyAspect {
    @Before(value = "bean(*)")
    public void before(JoinPoint joinPoint) {
        System.out.println("Wywołanie metody " + joinPoint.getSignature().getName());
    }

    @Around(value = "bean(*)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("Around przed");

        Object result = joinPoint.proceed();

        System.out.println("Around po");

        return result;
    }
}
