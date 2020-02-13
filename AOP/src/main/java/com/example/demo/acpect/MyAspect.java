package com.example.demo.acpect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.example.demo.service.UserServiceImpl.printUser(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void brfore(){
        System.out.println("this is before");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("this is after");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("this is afterReturning");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("this is afterThrowing");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp)throws Throwable{
        System.out.println("this is around before");
        jp.proceed();
        System.out.println("this is around after");
    }
}

