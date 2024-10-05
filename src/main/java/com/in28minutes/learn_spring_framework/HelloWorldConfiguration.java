package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// @Configuration is a marker annotation that tells Spring that this is a configuration class
//Configure the things that we want Spring to manage
//Define the beans in this class

record Person(String name, int age) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Matthew";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person() {
        return new Person("Matthew", 27);
    }
}
