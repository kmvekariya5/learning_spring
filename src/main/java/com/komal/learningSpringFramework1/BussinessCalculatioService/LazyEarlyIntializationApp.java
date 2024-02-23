package com.komal.learningSpringFramework1.BussinessCalculatioService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
class B
{
	public B()
	{
		System.out.println("Inside Class B");
	}
	public void bbc()
	{
		System.out.println("Inside Class B bbc");
	}
}

@Component

class A
{
	private B obj = null;
	public A(B obj)
	{
		this.obj = obj;
		System.out.println("Inside Class A");
	}
	
	public void bbc()
	{
		obj.bbc();
		System.out.println("Inside Class A bbc");
	}
}

@ComponentScan
@Configuration
public class LazyEarlyIntializationApp {
	//var context = new AnnotationConfigApplicationContext(LazyEarlyIntializationApp.class);
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyEarlyIntializationApp.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		context.getBean(B.class).bbc();
	}
	
}
