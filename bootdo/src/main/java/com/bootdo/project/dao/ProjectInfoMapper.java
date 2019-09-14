package com.bootdo.project.dao;

import com.bootdo.project.model.ProjectInfo;
import com.bootdo.project.model.ProjectInfoExample;
import com.bootdo.project.model.ProjectInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectInfoMapper {
    int countByExample(ProjectInfoExample example);

    int deleteByExample(ProjectInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectInfoWithBLOBs record);

    int insertSelective(ProjectInfoWithBLOBs record);

    List<ProjectInfoWithBLOBs> selectAll();

    List<ProjectInfoWithBLOBs> selectByExampleWithBLOBs(ProjectInfoExample example);

    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    ProjectInfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectInfoWithBLOBs record, @Param("example") ProjectInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ProjectInfoWithBLOBs record, @Param("example") ProjectInfoExample example);

    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByPrimaryKeySelective(ProjectInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProjectInfoWithBLOBs record);

    int updateByPrimaryKey(ProjectInfo record);
}