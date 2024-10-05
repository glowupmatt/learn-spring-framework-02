package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch the Spring Application Context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2: Configure the things we want spring to manage - @Configuration
		//HelloWorldConfiguration is a configuration class -@Configuration
		//name - @Bean

		//3: Retrieve the bean managed by Spring
		System.out.println(applicationContext.getBean("name"));
		System.out.println(applicationContext.getBean("age"));
		System.out.println(applicationContext.getBean("person"));
		
	}

}
