package com.ninjaapps.aspect2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Aspect
@Component("myAspect")
public class MyAspect {
    @Before ("allBeans()")
    public void beforeServices(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        Object[] args = joinPoint.getArgs();
        int argsLenth = args.length;
        for (int i = 0; i < argsLenth; i++) {
            System.out.println("Parametr " + args[i]);
        }

        System.out.println("Przed wywołaniem metody " + methodName);
    }

    @Pointcut ("execution(void *..*Service.addTask(..))")
    public void taskFromService() {}

    @Pointcut (value = "within( *..*Service)")
    public void onlyServices() {}

    @Pointcut (value = "bean(*)")
    public void allBeans() {}

}
