package com.in28minutes.learn_spring_framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component automatically creates the beans for the class

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ProtoTypeClass {

}


@Configuration
//ComponentScan will scan everything (bean) in side the current package.
//If you want to scan everything in the sub packages, you can use ComponentScan("com.in28minutes.learn_spring_framework")
@ComponentScan
public class BeanScopesLauncherApplication {
public static void main(String[] args) {
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			BeanScopesLauncherApplication.class)) {
				System.out.println(context.getBean(NormalClass.class));
				System.out.println(context.getBean(NormalClass.class));

				System.out.println(context.getBean(ProtoTypeClass.class));
				System.out.println(context.getBean(ProtoTypeClass.class));
				System.out.println(context.getBean(ProtoTypeClass.class));
		
	}

}

}
