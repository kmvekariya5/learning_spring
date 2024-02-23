package com.komal.learningSpringFramework1.BussinessCalculatioService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BussinessCalculation {
	private DataBaseServcie service = null;
	
	public BussinessCalculation(@Qualifier("MongoDBService")DataBaseServcie service)
	{
		super();
		this.service = service;
	}
	
	public int findMax()
	{
		return Arrays.stream(service.retrive()).max().orElse(0);
	}
}
