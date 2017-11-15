package com.wzy.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzy.dao.CityMapper;
import com.wzy.model.City;
import com.wzy.service.CityService;

@Service("CityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;
	
	public City getCityById(Integer id) {
		
		return cityMapper.selectByPrimaryKey(id);
	}

}
