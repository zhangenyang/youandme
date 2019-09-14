package com.bootdo.project.service;

import com.bootdo.project.model.ProjectStatus;

import java.util.List;

public interface ProjectStatusService {

    ProjectStatus getProjectStatusById(Long id);

    List<ProjectStatus> getProjectStatusByIds(List<Long> ids);

    int deleteById(Long id);

    int insert(ProjectStatus record);

    int insertSelective(ProjectStatus record);

    int updateByPrimaryKeySelective(ProjectStatus record);

    int updateByPrimaryKey(ProjectStatus record);

}
