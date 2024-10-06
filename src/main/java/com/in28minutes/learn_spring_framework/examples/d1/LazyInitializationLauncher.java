package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component automatically creates the beans for the class

@Component
class ClassA {
}


@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic goes here");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Doing something");
	}
}



@Configuration
//ComponentScan will scan everything (bean) in side the current package.
//If you want to scan everything in the sub packages, you can use ComponentScan("com.in28minutes.learn_spring_framework")
@ComponentScan
public class LazyInitializationLauncher {
public static void main(String[] args) {
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			LazyInitializationLauncher.class)) {
		System.out.println("Init of context is completed: ");
				context.getBean(ClassB.class).doSomething();;
		
	}

}

}
