package com.in28minutes.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// @Configuration is a marker annotation that tells Spring that this is a configuration class
//Configure the things that we want Spring to manage
//Define the beans in this class

record Person(String name, int age, Address address) {
}
record Address(String city, String state) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Shazamm";
    }

    @Bean
    public int age() {
        return 100;
    }

    @Bean
    public Person person() {
        return new Person("Matthew", 27, new Address("Sammamish", "WA"));
    }
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, @Qualifier("address2Qualifier") Address address) {
        return new Person(name, age, address());
    }
    @Bean
    public Person person5Qualifier(String name, int age, Address address) {
        return new Person(name, age, address());
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Gotham", "USA");
    }

    @Bean(name = "address3")
    @Qualifier("address2Qualifier")
    public Address address3() {
        return new Address("The Hood", "Bompton");
    }
}
