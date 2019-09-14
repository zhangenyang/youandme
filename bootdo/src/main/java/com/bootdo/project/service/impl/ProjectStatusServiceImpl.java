package com.bootdo.project.service.impl;

import com.bootdo.project.dao.ProjectStatusMapper;
import com.bootdo.project.model.ProjectStatus;
import com.bootdo.project.model.ProjectStatusExample;
import com.bootdo.project.service.ProjectStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectStatusServiceImpl implements ProjectStatusService {

    @Autowired
    private ProjectStatusMapper projectStatusMapper;

    @Override
    public ProjectStatus getProjectStatusById(Long id){
        return projectStatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProjectStatus> getProjectStatusByIds(List<Long> ids) {
        ProjectStatusExample example = new ProjectStatusExample();
        ProjectStatusExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);

        return projectStatusMapper.selectByExample(example);
    }

    @Override
    public int deleteById(Long id) {
        return projectStatusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProjectStatus record) {
        return projectStatusMapper.insert(record);
    }

    @Override
    public int insertSelective(ProjectStatus record) {
        return projectStatusMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ProjectStatus record) {
        return projectStatusMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProjectStatus record) {
        return projectStatusMapper.updateByPrimaryKey(record);
    }
}
