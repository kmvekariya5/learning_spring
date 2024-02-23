package com.komal.learningSpringFramework1.PrePostAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class x
{
	private y ob = null;
	public x(y obj)
	{
		super();
		this.ob = obj;
	}
	
	public void doSome()
	{
		ob.doSome();
		System.out.println("DoSomething....");
	}
	
	@PreDestroy
	public void cleanup()
	{
		System.out.println("cleanup....");
	}
}

@Component
class y
{
	public y()
	{
		System.out.println("y....y");
	}
	@PostConstruct
	public void doSome()
	{
		System.out.println("DoSomething....y");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(AnnotationConfigApplicationContext var1 = new AnnotationConfigApplicationContext(PrePostAnnotationApp.class))
		{
			var1.getBean(x.class).doSome();
		}
	}

}
