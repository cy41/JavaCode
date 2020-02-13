package com.example.demo;

import com.example.demo.acpect.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = {"com.example.demo.acpect"})
@SpringBootApplication

public class DemoApplication {

    //@Bean(name="myAspect")
    /*
    public MyAspect initMyAspect(){
        return new MyAspect();
    }
    */

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
