package com.in28minutes.learn_spring_framework.examples.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationContextApplication {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BusinessCalculationContextApplication.class)) {
                    BusinessCalculationService businessCalculationService = context.getBean(BusinessCalculationService.class);
                    System.out.println("Max value: " + businessCalculationService.findMax());
            
        }
    }
}
