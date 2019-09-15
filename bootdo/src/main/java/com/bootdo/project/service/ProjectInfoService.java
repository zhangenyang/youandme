package com.bootdo.project.service;

import com.bootdo.project.model.ProjectInfoWithBLOBs;
import com.bootdo.project.model.dto.ProjectInfoDTO;

import java.util.List;

public interface ProjectInfoService {

    ProjectInfoWithBLOBs getProjectInfoById(Long id);

    List<ProjectInfoDTO> getAll();

    List<ProjectInfoWithBLOBs> getProjectInfoByIds(List<Long> ids);

    int deleteById(Long id);

    int insert(ProjectInfoWithBLOBs record);

    int insertSelective(ProjectInfoWithBLOBs record);

    int updateByPrimaryKeySelective(ProjectInfoWithBLOBs record);

    int updateByPrimaryKey(ProjectInfoWithBLOBs record);
}
