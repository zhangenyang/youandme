package com.bootdo.project.dao;

import com.bootdo.project.model.Contactor;
import com.bootdo.project.model.ContactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactorMapper {
    int countByExample(ContactorExample example);

    int deleteByExample(ContactorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Contactor record);

    int insertSelective(Contactor record);

    List<Contactor> selectByExample(ContactorExample example);

    Contactor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Contactor record, @Param("example") ContactorExample example);

    int updateByExample(@Param("record") Contactor record, @Param("example") ContactorExample example);

    int updateByPrimaryKeySelective(Contactor record);

    int updateByPrimaryKey(Contactor record);
}