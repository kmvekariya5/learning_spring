package com.komal.learningSpringFramework1.BussinessCalculatioService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("MongoDBService")
public class MongoDbService implements DataBaseServcie{
	public int[] retrive()
	{
		return new int[] {11,12,12,15,55};
	}
}
