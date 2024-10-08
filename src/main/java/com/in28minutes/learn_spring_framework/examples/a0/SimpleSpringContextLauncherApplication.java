package com.in28minutes.learn_spring_framework.examples.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component automatically creates the beans for the class
@Configuration
//ComponentScan will scan everything (bean) in side the current package.
//If you want to scan everything in the sub packages, you can use ComponentScan("com.in28minutes.learn_spring_framework")
@ComponentScan
public class SimpleSpringContextLauncherApplication {
public static void main(String[] args) {
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			SimpleSpringContextLauncherApplication.class)) {
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		// System.out.println(context.getBean(YourBusinessClass.class).toString());
		
	}

}

}
