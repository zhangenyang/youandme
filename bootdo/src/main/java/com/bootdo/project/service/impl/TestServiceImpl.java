package com.bootdo.project.service.impl;

import com.bootdo.project.dao.ContactorMapper;
import com.bootdo.project.model.Contactor;
import com.bootdo.project.model.ContactorExample;
import com.bootdo.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private ContactorMapper contactorMapper;

    @Override
    public List<Contactor> getContactorByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ContactorExample example = new ContactorExample();
        ContactorExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);

        return contactorMapper.selectByExample(example);
    }
}
