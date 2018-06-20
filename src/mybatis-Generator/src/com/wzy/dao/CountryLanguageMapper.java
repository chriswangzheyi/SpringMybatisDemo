package com.wzy.dao;

import com.wzy.model.CountryLanguage;
import com.wzy.model.CountryLanguageKey;

public interface CountryLanguageMapper {
    int deleteByPrimaryKey(CountryLanguageKey key);

    int insert(CountryLanguage record);

    int insertSelective(CountryLanguage record);

    CountryLanguage selectByPrimaryKey(CountryLanguageKey key);

    int updateByPrimaryKeySelective(CountryLanguage record);

    int updateByPrimaryKey(CountryLanguage record);
}