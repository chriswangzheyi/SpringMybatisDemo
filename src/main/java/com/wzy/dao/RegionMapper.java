package com.wzy.dao;

import com.wzy.model.Region;

public interface RegionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}