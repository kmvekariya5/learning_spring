package com.komal.learningSpringFramework1.BussinessCalculatioService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MySQLDbService implements DataBaseServcie{
	public int[] retrive()
	{
		return new int[] {1,2,2,59};
	}
}
