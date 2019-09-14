package com.bootdo.project.service;

import com.bootdo.project.model.Contactor;
import com.bootdo.project.model.ContactorExample;

import java.util.List;

public interface ContactorService {

    Contactor getContactorById(Long id);

    List<Contactor> getContactorByIds(List<Long> ids);

    int deleteById(Long id);

    int insert(Contactor record);

    int insertSelective(Contactor record);

    int updateByPrimaryKeySelective(Contactor record);

    int updateByPrimaryKey(Contactor record);

}
