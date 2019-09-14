package com.bootdo.project.service.impl;

import com.bootdo.project.dao.ProjectInfoMapper;
import com.bootdo.project.model.ProjectInfo;
import com.bootdo.project.model.ProjectInfoExample;
import com.bootdo.project.model.ProjectInfoWithBLOBs;
import com.bootdo.project.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {

    @Autowired
    private ProjectInfoMapper projectInfoMapper;

    @Override
    public ProjectInfoWithBLOBs getProjectInfoById(Long id){
        return projectInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProjectInfoWithBLOBs> getAll() {
        return projectInfoMapper.selectAll();
    }

    @Override
    public List<ProjectInfoWithBLOBs> getProjectInfoByIds(List<Long> ids) {
        ProjectInfoExample example = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);

        return projectInfoMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public int deleteById(Long id) {
        return projectInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.updateByPrimaryKey(record);
    }
}
