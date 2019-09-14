package com.bootdo.project.service.impl;

import com.bootdo.project.dao.ContractInfoMapper;
import com.bootdo.project.model.ContractInfo;
import com.bootdo.project.model.ContractInfoExample;
import com.bootdo.project.service.ContractInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractInfoServiceImpl implements ContractInfoService {

    @Autowired
    private ContractInfoMapper contractInfoMapper;

    @Override
    public ContractInfo getContractInfoById(Long id){
        return contractInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ContractInfo> getContractInfoByIds(List<Long> ids) {
        ContractInfoExample example = new ContractInfoExample();
        ContractInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);

        return contractInfoMapper.selectByExample(example);
    }

    @Override
    public int deleteById(Long id) {
        return contractInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ContractInfo record) {
        return contractInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ContractInfo record) {
        return contractInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ContractInfo record) {
        return contractInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ContractInfo record) {
        return contractInfoMapper.updateByPrimaryKey(record);
    }
}
