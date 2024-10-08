package com.in28minutes.learn_spring_framework.examples.h1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;

import java.util.Arrays;

//@Component automatically creates the beans for the class
@Configuration
//ComponentScan will scan everything (bean) in side the current package.
//If you want to scan everything in the sub packages, you can use ComponentScan("com.in28minutes.learn_spring_framework")
@ComponentScan
public class XmlConfigurationContextLauncherApplication {
public static void main(String[] args) {
	try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean("name"));
		context.getBean(GameRunner.class).run();
	}

}

}
