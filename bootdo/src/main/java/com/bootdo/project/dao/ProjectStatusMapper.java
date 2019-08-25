package com.bootdo.project.dao;

import com.bootdo.project.model.ProjectStatus;
import com.bootdo.project.model.ProjectStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectStatusMapper {
    int countByExample(ProjectStatusExample example);

    int deleteByExample(ProjectStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectStatus record);

    int insertSelective(ProjectStatus record);

    List<ProjectStatus> selectByExample(ProjectStatusExample example);

    ProjectStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectStatus record, @Param("example") ProjectStatusExample example);

    int updateByExample(@Param("record") ProjectStatus record, @Param("example") ProjectStatusExample example);

    int updateByPrimaryKeySelective(ProjectStatus record);

    int updateByPrimaryKey(ProjectStatus record);
}