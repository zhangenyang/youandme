package com.bootdo.project.dao;

import com.bootdo.project.model.ContractInfo;
import com.bootdo.project.model.ContractInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractInfoMapper {
    int countByExample(ContractInfoExample example);

    int deleteByExample(ContractInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    List<ContractInfo> selectByExample(ContractInfoExample example);

    ContractInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContractInfo record, @Param("example") ContractInfoExample example);

    int updateByExample(@Param("record") ContractInfo record, @Param("example") ContractInfoExample example);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);
}