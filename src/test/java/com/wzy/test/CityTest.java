package com.wzy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzy.model.City;
import com.wzy.service.CityService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class CityTest {
	
	@Autowired
	CityService cityService;
	
	
	@Test
	public void getCityById() {
		City city=cityService.getCityById(1);
		System.out.println(city.getName());
	}

}
