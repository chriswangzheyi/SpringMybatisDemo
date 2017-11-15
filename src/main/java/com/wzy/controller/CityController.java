package com.wzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wzy.model.City;
import com.wzy.service.CityService;

@Controller
@RequestMapping(value="/city")
public class CityController {
	
	@Autowired
	CityService CityService;
	

	@RequestMapping(value="/getCity")
	public String getCity() {
		City city=CityService.getCityById(1);
		
		System.out.println("city="+city.getName());
		return "index";	
	}
	
}
