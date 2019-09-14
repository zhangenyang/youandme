package com.bootdo.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.bootdo.project.dao.ContactorMapper;
import com.bootdo.project.dao.ProjectInfoMapper;
import com.bootdo.project.model.*;
import com.bootdo.project.model.dto.ProjectInfoDTO;
import com.bootdo.project.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {

    @Autowired
    private ProjectInfoMapper projectInfoMapper;
    @Autowired
    private ContactorMapper contactorMapper;

    @Override
    public ProjectInfoWithBLOBs getProjectInfoById(Long id){
        return projectInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProjectInfoDTO> getAll() {
        List<ProjectInfoWithBLOBs> list = projectInfoMapper.selectAll();
        List<ProjectInfoDTO> responseList = new ArrayList<>();
        for(ProjectInfoWithBLOBs p : list){
            ProjectInfoDTO projectInfoDTO = new ProjectInfoDTO(p);

            // 根据customerContactorIds 获取contractList的信息
            List<Long> customerContactorIds =  JSON.parseArray(p.getContractInfoIds(),Long.class);
            ContactorExample example = new ContactorExample();
            ContactorExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(customerContactorIds);
            List<Contactor> contactors = contactorMapper.selectByExample(example);

            projectInfoDTO.setContactorList(contactors);
            // todo 其他的也一样

            responseList.add(projectInfoDTO);
        }

        return responseList;
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
