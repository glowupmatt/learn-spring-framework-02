package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                RealWorldSpringContextLauncherApplication.class)) {
                    BusinessCalculationService businessCalculationService = context.getBean(BusinessCalculationService.class);
                    System.out.println("Max value: " + businessCalculationService.findMax());
            
        }
    }
}
