package com.bootdo.project.service;

import com.bootdo.project.model.ContractInfo;

import java.util.List;

public interface ContractInfoService {

    ContractInfo getContractInfoById(Long id);

    List<ContractInfo> getContractInfoByIds(List<Long> ids);

    int deleteById(Long id);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);
}
