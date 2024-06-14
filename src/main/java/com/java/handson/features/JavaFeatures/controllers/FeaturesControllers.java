/**
 * 
 */
package com.java.handson.features.JavaFeatures.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.handson.features.JavaFeatures.service.ArrayListFeatures;

/**
 * @author pradeepk
 *
 */

/*
 * This class is rest controller because in this java spring boot project
 * We will be using the rest apis to demonstrate the features and while doing so we will learn more about the 
 * annotation , its type , bean injection 
 * and its uses where ever required.
 */
@RestController

public class FeaturesControllers { 
	/*
	 * What is bean--> 
	 * Bean is an object that is instantiate, assembled and managed by Spring 
	 * IOC container. Beans are created using configuration metadata that we provide to the 
	 * containers.
	 * 
	 * Life Cycle of beans
	 * Life cycle:
         The life cycle of a Spring bean is managed by the container. The typical lifecycle includes:

        1> Instantiation: The bean is created.
        2>Dependency Injection: Dependencies are injected into the bean.
        3>Initialization: Custom initialization methods can be invoked.
        4>Usage: The bean is ready to be used.
        5>Destruction: The bean is destroyed when the container is closed.
        
        Scope of SPring beans
        ------------------------
        1> Prototype: A instance is created every-time when bean is requested. This is lazy initialization
        2> Singleton : A single instance is created and shared in through out the applications
        3> other scopes are "session" , "request" , "applications " these intances are mainly 
                  used in web-applications
                  
          Declaring a Spring Bean
          Beans can be declared in various ways in Spring:

             1. Using XML Configuration:
                  <bean id="myBeanName" class = "example.com"\>
             2. Using Annotations
                @RestController, @Resource, @Component , @Service : These are class 
                level annotations
                @Bean : This is method level annotation
             3. Using Java Configuration (Java-based Configuration)
                import org.springframework.context.annotation.Bean;
                import org.springframework.context.annotation.Configuration;

				@Configuration
				public class AppConfig {

    				@Bean
    				public MyBeanClass myBean() {
        					return new MyBeanClass();
    				}
				}
				
				Here at the class level we have defined the annotation @Controller : This signifies that
				this class controls the flow.
				
				The @RestController annotation in Spring is used to create RESTful
				web services by combining the @Controller and @ResponseBody annotations. 
				It simplifies the development of web services by automatically converting Java objects to
				JSON or XML, making it a powerful tool for building modern web applications.
	 */
	
	private ArrayListFeatures arrayFeature;
	
	public FeaturesControllers(ArrayListFeatures feature) {
		this.arrayFeature=feature;
	}
	
	@GetMapping("/addIntegerElement")
	public List<Integer> addElement() {
		return arrayFeature.addIntegerElement();
	}
	
	@GetMapping("/addStringElement")
	public List<String> addStringElement() {
		return arrayFeature.addStringElement();
		
	}
	
	@GetMapping("/printElementFromList")
	public void print() {
		 arrayFeature.printElementFromList();
	}
	
	@GetMapping("/printElentWithS")
	public List<String> elementWithS(){
		return arrayFeature.printElentWithS();
	}
  
}
