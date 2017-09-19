package com.bridgelabz.HelloWorldAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class MyConfig {

	@Bean(name="helloWorld")
	@Description("This method return hello world object")
	public HelloWorld hello() {
		return new HelloWorldImpl();
	}
}
