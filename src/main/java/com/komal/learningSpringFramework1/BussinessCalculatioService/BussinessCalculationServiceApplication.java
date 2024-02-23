package com.komal.learningSpringFramework1.BussinessCalculatioService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@Configuration
public class BussinessCalculationServiceApplication {
	public static void main(String[] args)
	{
		var context = new AnnotationConfigApplicationContext(BussinessCalculationServiceApplication.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BussinessCalculation.class).findMax());
	}
}
