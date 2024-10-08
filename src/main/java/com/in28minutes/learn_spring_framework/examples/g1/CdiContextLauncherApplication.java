package com.in28minutes.learn_spring_framework.examples.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.Arrays;

//@Component automatically creates the beans for the class

// @Component
@Named
class BusinessService {
	private DataService dataService;

	public DataService getDataService() {
		System.out.println("Setter Injection - BusinessService");
		return dataService;
	}
	
	// @Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

}

@Named
class DataService {
	
}


@Configuration
//ComponentScan will scan everything (bean) in side the current package.
//If you want to scan everything in the sub packages, you can use ComponentScan("com.in28minutes.learn_spring_framework")
@ComponentScan
public class CdiContextLauncherApplication {
public static void main(String[] args) {
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			CdiContextLauncherApplication.class)) {
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BusinessService.class).getDataService());
	}

}

}