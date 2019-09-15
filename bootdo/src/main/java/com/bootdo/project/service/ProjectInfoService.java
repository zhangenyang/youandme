package com.bootdo.project.service;

import com.bootdo.project.model.ProjectInfoWithBLOBs;
import com.bootdo.project.model.dto.ProjectInfoDTO;
import com.bootdo.project.model.vo.ProjectInfoVO;

import java.util.List;

public interface ProjectInfoService {

    ProjectInfoDTO getProjectInfoById(Long id);

    List<ProjectInfoDTO> getAll();

    List<ProjectInfoWithBLOBs> getProjectInfoByIds(List<Long> ids);

    int deleteById(Long id);

    int insert(ProjectInfoVO projectInfoVO);

    int insertSelective(ProjectInfoWithBLOBs record);

    int updateByPrimaryKeySelective(ProjectInfoWithBLOBs record);

    int updateByPrimaryKey(ProjectInfoWithBLOBs record);
}
