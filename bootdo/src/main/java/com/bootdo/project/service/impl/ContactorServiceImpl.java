package com.bootdo.project.service.impl;

import com.bootdo.project.dao.ContactorMapper;
import com.bootdo.project.model.Contactor;
import com.bootdo.project.model.ContactorExample;
import com.bootdo.project.service.ContactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContactorServiceImpl implements ContactorService {

    @Autowired
    private ContactorMapper contactorMapper;

    @Override
    public Contactor getContactorById(Long id){
        return contactorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Contactor> getContactorByIds(List<Long> ids) {
        ContactorExample example = new ContactorExample();
        ContactorExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);

        return contactorMapper.selectByExample(example);
    }

    @Override
    public int deleteById(Long id) {
        return contactorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Contactor record) {
        return contactorMapper.insert(record);
    }

    @Override
    public int insertSelective(Contactor record) {
        return contactorMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Contactor record) {
        return contactorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Contactor record) {
        return contactorMapper.updateByPrimaryKey(record);
    }
}
